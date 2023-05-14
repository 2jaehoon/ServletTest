package day0428;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class AddCookie extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String idSaveFlag = request.getParameter("idSaveFlag");
		//체크박스가 value속성이 없다면 check된 상태엔 "on"이 넘어오고
		//그렇지 않다면 null이 넘어온다.
		Cookie idCookie = null;
		if(idSaveFlag != null) {
		//checkbox를 읽어들여 checked된 상태라면 //
		//아이디를 쿠키에 저장하고 
			idCookie = new Cookie("saveId", id);
			idCookie.setMaxAge(60*60*24*30*1);
		}else {
		//로그인한 결과를 보여준다.
		//checked된 상태가 아니라면 쿠키에 저장된 아이디를 삭제하고
			idCookie = new Cookie("saveId", "");
			idCookie.setMaxAge(0);
		}//end else
		//심기
		response.addCookie(idCookie);
		
		//로그인을 성공하면 세션에 로그인 정보를 저장
		HttpSession session = request.getSession();
		session.setAttribute("sessionId", id);
		
		//로그인하는 결과를 보여주는 JSP로 이동
		
		RequestDispatcher rd = request.getRequestDispatcher("day0428/login_result.jsp");
		rd.forward(request, response);
	}//doPost

}
