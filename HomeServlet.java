package main.javaee.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.javaee.db.Tasks;
import main.javaee.db.DBManager;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/home.html")
public class HomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Tasks> tasks = DBManager.getAllTasks();
        request.setAttribute("zhumys", tasks);
        request.getRequestDispatcher("/tasks.jsp").forward(request, response);
    }
}
