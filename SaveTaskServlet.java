package main.javaee.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.javaee.db.Tasks;
import main.javaee.db.DBManager;

import java.io.IOException;

@WebServlet(value = "/save-tasks")
public class SaveTaskServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("task_id"));
        String name = request.getParameter("task_name");
        String description = request.getParameter("task_description");
        String deadline_date = request.getParameter("task_deadline");

        Tasks tasks = DBManager.getTask(id);
        if(tasks !=null){
            tasks.setName(name);
            tasks.setDescription(description);
            tasks.setDeadlineDate(deadline_date);
            DBManager.updateTask(tasks);
            response.sendRedirect("/details?task_id="+id);
        }else{
            response.sendRedirect("/");
        }
    }
}
