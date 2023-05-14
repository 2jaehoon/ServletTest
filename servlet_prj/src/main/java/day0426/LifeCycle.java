package day0426;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet의 생명주기 method
 * @author user
 *
 */
@SuppressWarnings("serial")
public class LifeCycle extends HttpServlet {
       
    
    
	

	@Override
	public void init() throws ServletException {
		System.out.println("---------init() 최초 접속자에 의해 호출되고 한 번만 생성");
		
	}//init

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("------- doGet, doPost, service 모든 접속자가 계속 호출하여 실행");
		System.out.println(request.getRemoteAddr());
		
	}//service
	
	@Override
	public void destroy() {
		System.out.println("-------- destory() WAS가 정상종료되었을 때 호출");
	}

}
