package sk.train.dao;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/Hello")
public class MyServlet extends HttpServlet {

    @Inject
    private EmpServiceIf mycdibean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        Writer w = resp.getWriter();
        if (mycdibean == null) {
            w.write("Fatal");
        }
        else {
            w.write(mycdibean.readEmp(100L).toString());
        }
        w.flush();

    }
}
