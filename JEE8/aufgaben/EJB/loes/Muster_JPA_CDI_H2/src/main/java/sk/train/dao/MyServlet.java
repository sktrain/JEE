package sk.train.dao;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
