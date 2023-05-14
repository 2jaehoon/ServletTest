package day0428;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ReadCookie extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��Ű�� �о�ͼ� ��Ű���� "id"�� ��Ű �ִٸ�
		Cookie[] cookies = request.getCookies();
		if( cookies != null ) {
			for(Cookie readCookie : cookies ) {
				if("saveId".equals(readCookie.getName() )  ) {
					// scope ��ü�� ���� �����ϰ�
					request.setAttribute("saveId", readCookie.getValue() );
					break;
				}//end if
			}//end for
			
		}
		// login_frm.jsp�� �̵��Ѵ�.
		RequestDispatcher rd = request.getRequestDispatcher("day0428/login_frm.jsp");
		rd.forward(request, response);
		
	}//doget

}
