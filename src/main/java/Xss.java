import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Xss", value = "/Xss")
public class Xss extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // BAD: a request parameter is written directly to an error response page
        response.sendError(HttpServletResponse.SC_NOT_FOUND,
                "The page \"" + request.getParameter("page") + "\" was not found.");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
