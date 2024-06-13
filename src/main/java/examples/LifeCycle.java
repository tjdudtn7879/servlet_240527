package examples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
    int initCount=1;
    int serviceCount=1;
    int destroyCount=1;

//    웹 브라우저에서 첫 실행할때 호출됨
    @Override
    public void init() throws ServletException {
    	System.out.println("init 메소드가 첫 요청만 호출됨: "+initCount++);
    }
    @Override
    public void destroy() {
    	System.out.println("destroy 메소드는 톰캣 종료될때만 호출됨: "+destroyCount++);
    }
//    웹 브라우저에서 실행될때마다 호출됨
//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//    	System.out.println("service 메소드는 요청될때마다 호출됨: "+serviceCount++);
//    	
//    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
