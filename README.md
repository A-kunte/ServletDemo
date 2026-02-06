🚀 System Monitor: Jakarta Servlet & Glassmorphism UI
A modern web application demonstrating Jakarta EE (Servlets) and advanced CSS3 techniques. This project serves as a real-time server-side monitor, utilizing HTTP headers for automated state synchronization.

🛠 Tech Stack
Backend: Java 21, Jakarta Servlet API 6.0

Frontend: HTML5, CSS3 (Glassmorphism, Keyframe Animations)

Server: Apache Tomcat 10+

Build Tool: Maven

✨ Key Features
Automated Refresh: Implements response.setIntHeader("Refresh", 5) to trigger server-side updates every 5 seconds without client-side JavaScript.

Innovative UI: Features a "Glassmorphism" design using backdrop-filter for a frosted-glass effect.

Fluid Background: A dynamic 4-color gradient background animated via CSS @keyframes.

Responsive Layout: Fully centered and adaptive layout using CSS Flexbox.

📂 Project Structure
Plaintext
ServletDemo/
├── src/main/java/AutoRefreshServlet.java  # Core Logic: Handles HTTP headers & HTML generation
├── src/main/webapp/css/style.css          # Design: Animations & Glassmorphism styles
└── pom.xml                                # Dependencies: Jakarta EE 10+ & Servlet API
🚀 How to Run
Clone the repository: git clone https://github.com/A-kunte/ServletDemo.git

Open in IntelliJ IDEA (with Smart Tomcat plugin installed).

Run the Server: Access at http://localhost:8080/ServletDemo/AutoRefresh
