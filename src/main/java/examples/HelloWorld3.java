package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld3
 */
@WebServlet("/HelloWorld3")
public class HelloWorld3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		text/html : text/html 내용으로 응답을 함
//		response.setContentType("text/html");
//		charset=euc-kr : 한글처리
//		response.setContentType("text/html;charset=euc-kr");
//		response.setContentType("text/html;charset=EUC_KR");
//		response.setContentType("text/html;charset=UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Hello~2");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>안녕하세요~!!!</h1>");
		out.println("</body>");
		out.println("</html>");

	}

}
