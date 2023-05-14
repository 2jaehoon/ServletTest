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
		//üũ�ڽ��� value�Ӽ��� ���ٸ� check�� ���¿� "on"�� �Ѿ����
		//�׷��� �ʴٸ� null�� �Ѿ�´�.
		Cookie idCookie = null;
		if(idSaveFlag != null) {
		//checkbox�� �о�鿩 checked�� ���¶�� //
		//���̵� ��Ű�� �����ϰ� 
			idCookie = new Cookie("saveId", id);
			idCookie.setMaxAge(60*60*24*30*1);
		}else {
		//�α����� ����� �����ش�.
		//checked�� ���°� �ƴ϶�� ��Ű�� ����� ���̵� �����ϰ�
			idCookie = new Cookie("saveId", "");
			idCookie.setMaxAge(0);
		}//end else
		//�ɱ�
		response.addCookie(idCookie);
		
		//�α����� �����ϸ� ���ǿ� �α��� ������ ����
		HttpSession session = request.getSession();
		session.setAttribute("sessionId", id);
		
		//�α����ϴ� ����� �����ִ� JSP�� �̵�
		
		RequestDispatcher rd = request.getRequestDispatcher("day0428/login_result.jsp");
		rd.forward(request, response);
	}//doPost

}
