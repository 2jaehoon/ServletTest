package day0426;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet�� �����ֱ� method
 * @author user
 *
 */
@SuppressWarnings("serial")
public class LifeCycle extends HttpServlet {
       
    
    
	

	@Override
	public void init() throws ServletException {
		System.out.println("---------init() ���� �����ڿ� ���� ȣ��ǰ� �� ���� ����");
		
	}//init

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("------- doGet, doPost, service ��� �����ڰ� ��� ȣ���Ͽ� ����");
		System.out.println(request.getRemoteAddr());
		
	}//service
	
	@Override
	public void destroy() {
		System.out.println("-------- destory() WAS�� ��������Ǿ��� �� ȣ��");
	}

}
