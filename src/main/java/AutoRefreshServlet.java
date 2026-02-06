import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

@WebServlet("/AutoRefresh")
public class AutoRefreshServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Logic: Set Headers
        response.setIntHeader("Refresh", 5);
        response.setContentType("text/html");

        // 2. Data: Get Time
        String currentTime = Calendar.getInstance().getTime().toString();

        // 3. Presentation: Updated HTML for Animations
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html><html><head>");
        out.println("<link rel='stylesheet' type='text/css' href='css/style.css'>");
        out.println("<title>Server Monitor</title></head><body>");

        out.println("<div class='container'>"); // Wrapper for entry animation
        out.println("<h1>System Status: <span class='online'>● Online</span></h1>");
        out.println("<div class='card'>"); // Glassmorphism card
        out.println("<p>Current Server Time:</p>");

        out.println("<div class='time-box'>"); // New div for the pulse effect
        out.println("<h2 class='time'>" + currentTime + "</h2>");
        out.println("</div>");

        out.println("<p class='footer'>Refreshing in 5 seconds...</p>");
        out.println("</div></div></body></html>");
    }
}