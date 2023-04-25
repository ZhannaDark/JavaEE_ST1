package main.javaee.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.javaee.db.Tasks;
import main.javaee.db.DBManager;

import java.io.IOException;

@WebServlet(value = "/add-tasks")
public class AddTaskServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("task_name");
        String desc = request.getParameter("task_desc");
        String deadl = request.getParameter("task_dead");

        Tasks tasks = new Tasks();
        tasks.setName(name);
        tasks.setDescription(desc);
        tasks.setDeadlineDate(deadl);
        tasks.setIsDone("No");

        DBManager.addTask(tasks);

        response.sendRedirect("/");

    }
}
