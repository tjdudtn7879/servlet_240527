package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultiPara
 */
@WebServlet("/MultiPara")
public class MultiPara extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String[] item;
//		getParameterValues 메소드 : 여러개 요청된 name 값들을 받는다.
		item = request.getParameterValues("item");
		out.print("선택된 항목이 ");
		
		for (int i = 0; i < item.length; i++) {
			out.print(" : " +item[i]);
		}
		out.print("입니다");
	}
}
