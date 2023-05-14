package day0427;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class RemoveSession extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//세션 삭제
		//1. 세션 얻기
		HttpSession session = request.getSession();
		//2. 얻어낸 세션에서 값 삭제
		session.removeAttribute("ses_name");
		//3. 무효화
		//session.invalidate();
		
		//forward로 이동
		RequestDispatcher rd = request.getRequestDispatcher("day0427/remove_result.jsp");
		rd.forward(request, response);
		
	}//doGet

}
