<%-- 
    Document   : monitor
    Created on : Jan 13, 2018, 10:23:48 PM
    Author     : anurag.nana.deshmukh
archive
--%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.imconfig.connectionManager"%>

<%
    ResultSet rs = null;
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "infarep", "infarep");
        String query01 = "SELECT * FROM ( SELECT X2.SUBJECT_AREA , X1.WORKFLOW_NAME, DECODE(TO_CHAR(X1.RUN_STATUS_CODE),'1','SUCCEEDED','2','DISABLED','3','FAILED','4','STOPPED','5','ABORTED','6','RUNNING','7','SUSPENDING','8','SUSPENDED','9','STOPPING','10','ABORTING','11','WAITING','12','SCHEDULED','13','UNSCHEDULED','14','UNKNOWN','15','TERMINATED RUN STATUS CODE',TO_CHAR(X1.RUN_STATUS_CODE)) STATUS , X1.SERVER_NAME, X1.START_TIME AS START_TIME, RANK() OVER (PARTITION BY X2.SUBJECT_AREA,X1.WORKFLOW_NAME,X1.SERVER_NAME ORDER BY START_TIME DESC) RANKNO , RUN_ERR_MSG AS RUN_ERR_MSG FROM OPB_WFLOW_RUN X1, REP_SUBJECT X2 WHERE X1.SUBJECT_ID = X2.SUBJECT_ID ) WHERE RANKNO=1 ORDER BY START_TIME DESC";
        Statement stmt01 = conn.createStatement();
        rs = stmt01.executeQuery(query01);

        /*connectionManager cm = new connectionManager();
    Connection con = cm.getConnection();
    if (con != null) {
        out.println("no conn");
    }
    Statement stmt = cm.getStatement(con);
    String query = "SELECT * FROM ( SELECT x2.subject_area, x1.workflow_name, DECODE(TO_CHAR(x1.run_status_code),'1','SUCCEEDED','2','DISABLED','3','FAILED','4','STOPPED','5','ABORTED','6','RUNNING','7','SUSPENDING' ,'8','SUSPENDED','9','STOPPING','10','ABORTING','11','WAITING','12','SCHEDULED','13','UNSCHEDULED','14','UNKNOWN','15','TERMINATED RUN STATUS CODE' ,TO_CHAR(x1.run_status_code) ) status, x1.server_name, TO_CHAR(x1.start_time,'DD-MON-YYYY HH24:MI:SS') AS start_time, RANK() OVER( PARTITION BY x2.subject_area, x1.workflow_name, x1.server_name ORDER BY start_time DESC ) rankno, run_err_msg AS run_err_msg FROM opb_wflow_run x1, rep_subject x2 WHERE x1.subject_id = x2.subject_id ) WHERE rankno = 1 ORDER BY start_time DESC";
    rs = cm.getResult(stmt, query);*/
    } catch (Exception ex) {
        out.println("ERROR:" + ex.getMessage());
    }
%>
<div id="data-tables">

    <div class="panel panel-light">
        <div class="panel-heading">
            <div class="panel-title">
                <h4>Job Monitor (Latest Job runs)</h4>
            </div>
        </div>
        <div class="panel-body table-responsive">
            <table id="data-table-example1" class="display table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                    <tr>
                        <th>Folder</th>
                        <th>Workflow Name</th>
                        <th>Status</th>
                        <th>Service</th>
                        <th>Start date</th>
                        <th>Error Message</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        if (rs != null) {
                            while (rs.next()) {
                                out.println("<tr>");
                                out.println("<td>" + rs.getString("SUBJECT_AREA") + "</td>");
                                out.println("<td>" + rs.getString("WORKFLOW_NAME") + "</td>");
                                //if(rs.getString("STATUS").toString().toUpperCase()="SUCCEEDED")
                                if (rs.getString("STATUS").toString().equalsIgnoreCase("SUCCEEDED")) {
                                    out.println("<td><span class='label label-success'>" + rs.getString("STATUS") + "</span></td>");
                                } else {
                                    out.println("<td><span class='label label-danger'>" + rs.getString("STATUS") + "</span></td>");
                                }
                                out.println("<td>" + rs.getString("SERVER_NAME") + "</td>");
                                out.println("<td>" + rs.getString("START_TIME") + "</td>");
                                if (rs.getString("RUN_ERR_MSG") != null) {
                                    //out.println("<button type='button' class='btn btn-default btn-xs' data-popover-style='danger' data-placement='top' data-toggle='popover' data-title='Error Message' data-content='" + rs.getString("RUN_ERR_MSG").trim() + "'>" + rs.getString("RUN_ERR_MSG").trim().substring(0, 30) +"</button>");
                                    out.println("<td>" + " <label tabindex='0' class='' role='' data-toggle='popover' data-trigger='hover' data-placement='top' title='Error Message' data-content='"+rs.getString("RUN_ERR_MSG").trim()+"'>"+rs.getString("RUN_ERR_MSG").trim().substring(0, 25)+"..</label>" +  "</td>");
                                } else {
                                    out.println("<td></td>"); 
                                }
                                out.println("<td><div class='btn-group btn-group-xs dropup'><button type='button' class='btn btn-info btn-pretty dropdown-toggle' data-toggle='dropdown'><i class='fa fa-cog'></i> <span class='caret'></span> </button><ul class='dropdown-menu dropdown-menu-right' role='menu'>  <li><a href='#'><i class='fa fa-file text-primary'></i> Get Log</a></li> <li><a href='#'><i class='fa fa-arrow-circle-right text-primary'></i> Run</a></li> <li><a href='#'><i class='fa fa-envelope text-primary'></i> View Details</a></li>  </ul>  </div></td>");
                                out.println("</tr>");
                            }
                        } else {
                            out.println("no rs");
                        }
                    %>
                </tbody>
            </table>
        </div>
    </div>
    <script type="text/javascript">
        LobiAdmin.loadScript([
            'js/plugin/datatables/jquery.dataTables.min.js'
        ], function () {
            LobiAdmin.loadScript([
                'js/plugin/datatables/dataTables.bootstrap.min.js',
                'js/plugin/datatables/dataTables.responsive.min.js',
                'js/plugin/bootstrap-datepicker/bootstrap-datepicker.js'
            ], initPage);
        });

        function initPage() {
            $('#data-table-example1').DataTable();
            $('#data-table-example2').DataTable({
                "scrollY": 300,
                "scrollX": true,
//                responsive: true
            });
            $('#data-table-example3').DataTable({
                "columnDefs": [
                    {
                        // The `data` parameter refers to the data for the cell (defined by the
                        // `data` option, which defaults to the column being worked with, in
                        // this case `data: 0`.
                        "render": function (data, type, row) {
                            var val = data.replace(/[\$,]/g, '');
                            if (val > 100000) {
                                return '<span class="text-success">' + data + '</span>';
                            } else {
                                return '<span class="text-danger">' + data + '</span>';
                            }
                        },
                        "targets": 5
                    },
                    {"visible": false, "targets": [3]}
                ],
                responsive: true
            });
            var table = $('#data-table-example4').DataTable({
                responsive: true
            });
            // Apply the search
            $("#data-table-example4 thead th input[type=text]").on('keyup change', function () {

                table
                        .column($(this).closest('th').index() + ':visible')
                        .search(this.value)
                        .draw();

            });
            // Apply the search
            $("#data-table-example4 thead th select").on('change', function () {

                var val = $.fn.dataTable.util.escapeRegex(
                        $(this).val()
                        );

                table
                        .column($(this).closest('th').index() + ':visible')
                        .search(val ? '^' + val + '$' : '', true, false)
                        .draw();

            });
            $('.datepicker-demo').datepicker({
                format: 'yyyy/mm/dd'
            });

            $('.panel').lobiPanel({
                reload: false,
                editTitle: false
            });
        }
    </script>
</div>
