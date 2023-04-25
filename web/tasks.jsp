<%@ page import="java.util.ArrayList" %>
<%@ page import="main.javaee.db.Tasks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <%@include file="head.jsp"%>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <div class="container mt-3">
            <div class="row mt-3">
                <div class="col-12">
                    <button type="button" class="btn btn-primary btn-sm" style="background-color: #6f42c1" data-bs-toggle="modal" data-bs-target="#addTask">
                       + Add Task
                    </button>

                    <div class="modal fade" id="addTask" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                        <div class="modal-dialog modal-lg">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h1 class="modal-title fs-5" id="staticBackdropLabel">New Task</h1>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                </div>
                                <div class="modal-body">
                                    <%@include file="addform.jsp"%>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-12">
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NAME</th>
                                <th>DeadlineDate</th>
                                <th>Done</th>
                                <th style="width: 10%;">DETAILS</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                ArrayList<Tasks> delalar = (ArrayList<Tasks>) request.getAttribute("zhumys");
                                if(delalar !=null){
                                for(Tasks tasks : delalar){
                            %>
                                <tr>
                                    <td><%=tasks.getId()%></td>
                                    <td><%=tasks.getName()%></td>
                                    <td><%=tasks.getDeadlineDate()%></td>
                                    <td><%=tasks.getIsDone()%></td>
                                    <td>
                                        <a class="btn btn-sm btn-primary" style="background-color: #6f42c1" href="/details?task_id=<%=tasks.getId()%>">DETAILS</a>
                                    </td>
                                </tr>
                            <%
                                    }
                                }
                            %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>