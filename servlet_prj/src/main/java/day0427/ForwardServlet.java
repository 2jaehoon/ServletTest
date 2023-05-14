package day0427;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ForwardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 System.out.println("request" + request);
		 System.out.println("response" + response);
		
		//업무로직을 처리한 결과
		String[] names = {"윤상준","김경태","김규미","모민경","박진호","황충연" };	
		
		//화면을 만들기 어렵기 때문에 JSP로 이동한다.
		//1. 이동할 페이지 설정
		RequestDispatcher rd = request.getRequestDispatcher("day0427/forward_view.jsp");
		//2. 이동할 페이지에서 보여줄 값을 설정( scope 객체 사용 )
		request.setAttribute("data", names);
		//3. 이동
		rd.forward(request, response);
		
	}//doGet

}//class
