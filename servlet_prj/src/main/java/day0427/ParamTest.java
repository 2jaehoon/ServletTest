package day0427;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
//1. HttpServlet ���
public class ParamTest extends HttpServlet {
//2. ��û����� ó���� �� �ִ� �޼��带 Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//3. ���� ��� ����
		response.setContentType("text/html;charset=UTF-8");
		//4. ��� ��Ʈ�� ���
		PrintWriter out = response.getWriter();
		//5. ���� ������ �����Ͽ� ����
		out.print("<h2>GET ����� ����</h2>");
		
		out.write("<!DOCTYPE html>\r\n");
	      out.write("<html>\r\n");
	      out.write("<head>\r\n");
	      out.write("<meta charset=\"UTF-8\">\r\n");
	      out.write("<title>Insert title here</title>\r\n");
	      out.write("\r\n");
	      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost/jsp_prj/common/main_v20230217.css\"/> \r\n");
	      out.write("<style type=\"text/css\">\r\n");
	      out.write("\r\n");
	      out.write("#wrap{\r\n");
	      out.write("width:1000px; height:1200px; margin:0px auto; /* background-color:#FF0000; */\r\n");
	      out.write("}\r\n");
	      out.write("\r\n");
	      out.write("#header{\r\n");
	      out.write("height:200px; /* background-color:#00FF00; */\r\n");
	      out.write("position:relative;\r\n");
	      out.write("background:#FFF url(http://localhost/jsp_prj/common/images/header_bg.png) repeat-x;\r\n");
	      out.write("}\r\n");
	      out.write("\r\n");
	      out.write("#logo{\r\n");
	      out.write("position:absolute; top:40px; left:100px; \r\n");
	      out.write("width:150px; font-weight:bold; font-size:40px; font-family:���; \r\n");
	      out.write("}\r\n");
	      out.write("\r\n");
	      out.write("#naviBar{\r\n");
	      out.write("position:absolute; top:140px; left:0px;\r\n");
	      out.write("height:60px;\r\n");
	      out.write("}\r\n");
	      out.write("\r\n");
	      out.write("#container{\r\n");
	      out.write("height:900px; /* background-color:#23A9FF; */\r\n");
	      out.write("position:relative;\r\n");
	      out.write("}\r\n");
	      out.write("\r\n");
	      out.write("#footer{\r\n");
	      out.write("height:100px; position:relative; /* background-color:#0766E6; */\r\n");
	      out.write("}\r\n");
	      out.write("\r\n");
	      out.write("#flogo{\r\n");
	      out.write("position:absolute; left:600px; \r\n");
	      out.write("height:60px; font-weight:bold; font-size:20px; font-family:\"���� ���\";\r\n");
	      out.write("color:#d7d7d7;\r\n");
	      out.write("} \r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("</style>\r\n");
	      out.write("<!-- jQuery CDN ���� -->\r\n");
	      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\r\n");
	      out.write("<!-- jQuery CDN �� -->\r\n");
	      out.write("\r\n");
	      out.write("<!-- bootstrap ����-->\r\n");
	      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
	      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
	      out.write("<!-- bootstrap ��-->\r\n");
	      out.write("\r\n");
	      out.write("<script type=\"text/javascript\">\r\n");
	      out.write("$(function(){\r\n");
	      out.write("	\r\n");
	      out.write("	\r\n");
	      out.write("	\r\n");
	      out.write("});//ready\r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("</script>\r\n");
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("<div id=\"wrap\"> <!-- wrap(w:1000 h:1200) -->\r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("<div id=\"header\"><!-- header(w:1000 h:200) -->\r\n");
	      out.write("	<div id=\"logo\">Class 4</div>\r\n");
	      out.write("	<div id=\"naviBar\">naviBar(w:1000 h:60)</div>\r\n");
	      out.write("</div>\r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("<div id=\"container\">\r\n");
	      //�� �Ķ���� �ޱ�
	      //�̸� ���� : request.getParameter("�̸�");
	      String name = request.getParameter("name");//text
	      String age = request.getParameter("age");//password
	      String addr = request.getParameter("addr");//hidden
	      String domain = request.getParameter("domain");//select
	      String info = request.getParameter("info");//textarea
	      //�̸� �ߺ� : request.getParameterValues("�̸�");
	      String[] hobby = request.getParameterValues("hobby");//checkbox
	      
	      out.println("<ul>");
	      out.print("<li><strong>�̸�</strong> : ");
	      out.print(name);
	      out.println("</li>");
	      out.print("<li><strong>����</strong> : ");
	      out.print(age);
	      out.println("</li>");
	      out.print("<li><strong>�ּ�</strong> : ");
	      out.print(addr);
	      out.println("</li>");
	      out.print("<li><strong>������</strong> : ");
	      out.print(domain);
	      out.println("</li>");
	      out.print("<li><strong>���</strong> : ");
	      if( hobby == null ) {
	      out.print("������ ��� ����");
	      }else {
	    	  for( String value : hobby ) {
	    		  out.print(value);
	    		  out.print(" ");
	    	  }//end for
	      }//end else
	      out.println("</li>");
	      out.print("<li><strong>����</strong> : ");
	      if(!"".equals(info)) {
	    	 out.print(info.replaceAll("\n", "<br>")); 
	      }
	      out.println("</li>");
	      
	      out.println("</ul>");
	      
	      out.write("Hello Servlet!!\r\n");
	      out.write("</div>\r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("<div id=\"footer\">footer(w:1000 h:100)\r\n");
	      out.write("	<div id=\"flogo\">Copyright &copy; Class 4. All rights reserved.</div>\r\n");
	      out.write("</div>\r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("</div>\r\n");
	      out.write("\r\n");
	      out.write("</body>\r\n");
	      out.write("</html>");
		
		
	}

//2. ��û����� ó���� �� �ִ� �޼��带 Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		//5. ���� ������ �����Ͽ� ����
		out.print("<h2>HOST ����� ����</h2>");
		
		//Post����� �ѱ� ó��
		request.setCharacterEncoding("UTF-8");
		out.print("<h1>����Ʈ ��� ����</h1>");
		
		out.write("<!DOCTYPE html>\r\n");
	      out.write("<html>\r\n");
	      out.write("<head>\r\n");
	      out.write("<meta charset=\"UTF-8\">\r\n");
	      out.write("<title>Insert title here</title>\r\n");
	      out.write("\r\n");
	      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost/jsp_prj/common/main_v20230217.css\"/> \r\n");
	      out.write("<style type=\"text/css\">\r\n");
	      out.write("\r\n");
	      out.write("#wrap{\r\n");
	      out.write("width:1000px; height:1200px; margin:0px auto; /* background-color:#FF0000; */\r\n");
	      out.write("}\r\n");
	      out.write("\r\n");
	      out.write("#header{\r\n");
	      out.write("height:200px; /* background-color:#00FF00; */\r\n");
	      out.write("position:relative;\r\n");
	      out.write("background:#FFF url(http://localhost/jsp_prj/common/images/header_bg.png) repeat-x;\r\n");
	      out.write("}\r\n");
	      out.write("\r\n");
	      out.write("#logo{\r\n");
	      out.write("position:absolute; top:40px; left:100px; \r\n");
	      out.write("width:150px; font-weight:bold; font-size:40px; font-family:���; \r\n");
	      out.write("}\r\n");
	      out.write("\r\n");
	      out.write("#naviBar{\r\n");
	      out.write("position:absolute; top:140px; left:0px;\r\n");
	      out.write("height:60px;\r\n");
	      out.write("}\r\n");
	      out.write("\r\n");
	      out.write("#container{\r\n");
	      out.write("height:900px; /* background-color:#23A9FF; */\r\n");
	      out.write("position:relative;\r\n");
	      out.write("}\r\n");
	      out.write("\r\n");
	      out.write("#footer{\r\n");
	      out.write("height:100px; position:relative; /* background-color:#0766E6; */\r\n");
	      out.write("}\r\n");
	      out.write("\r\n");
	      out.write("#flogo{\r\n");
	      out.write("position:absolute; left:600px; \r\n");
	      out.write("height:60px; font-weight:bold; font-size:20px; font-family:\"���� ���\";\r\n");
	      out.write("color:#d7d7d7;\r\n");
	      out.write("} \r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("</style>\r\n");
	      out.write("<!-- jQuery CDN ���� -->\r\n");
	      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\r\n");
	      out.write("<!-- jQuery CDN �� -->\r\n");
	      out.write("\r\n");
	      out.write("<!-- bootstrap ����-->\r\n");
	      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
	      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
	      out.write("<!-- bootstrap ��-->\r\n");
	      out.write("\r\n");
	      out.write("<script type=\"text/javascript\">\r\n");
	      out.write("$(function(){\r\n");
	      out.write("	\r\n");
	      out.write("	\r\n");
	      out.write("	\r\n");
	      out.write("});//ready\r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("</script>\r\n");
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("<div id=\"wrap\"> <!-- wrap(w:1000 h:1200) -->\r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("<div id=\"header\"><!-- header(w:1000 h:200) -->\r\n");
	      out.write("	<div id=\"logo\">Class 4</div>\r\n");
	      out.write("	<div id=\"naviBar\">naviBar(w:1000 h:60)</div>\r\n");
	      out.write("</div>\r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("<div id=\"container\">\r\n");
	      
	    //�� �Ķ���� �ޱ�
	      //�̸� ���� : request.getParameter("�̸�");
	      String name = request.getParameter("name");//text
	      String age = request.getParameter("age");//password
	      String addr = request.getParameter("addr");//hidden
	      String domain = request.getParameter("domain");//select
	      String info = request.getParameter("info");//textarea
	      //�̸� �ߺ� : request.getParameterValues("�̸�");
	      String[] hobby = request.getParameterValues("hobby");//checkbox
	      
	      out.println("<ul>");
	      out.print("<li><mark>POST ����� ��û�� ���� ����</mark></li> ");
	      out.print("<li><strong>�̸�</strong> : ");
	      out.print(name);
	      out.println("</li>");
	      out.print("<li><strong>����</strong> : ");
	      out.print(age);
	      out.println("</li>");
	      out.print("<li><strong>�ּ�</strong> : ");
	      out.print(addr);
	      out.println("</li>");
	      out.print("<li><strong>������</strong> : ");
	      out.print(domain);
	      out.println("</li>");
	      out.print("<li><strong>���</strong> : ");
	      if( hobby == null ) {
	      out.print("������ ��� ����");
	      }else {
	    	  for( String value : hobby ) {
	    		  out.print(value);
	    		  out.print(" ");
	    	  }//end for
	      }//end else
	      out.println("</li>");
	      out.print("<li><strong>����</strong> : ");
	      if(!"".equals(info)) {
	    	 out.print(info.replaceAll("\n", "<br>")); 
	      }
	      out.println("</li>");
	      
	      out.println("</ul>");
	      
	      out.write("Hello Servlet!!\r\n");
	      out.write("</div>\r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("<div id=\"footer\">footer(w:1000 h:100)\r\n");
	      out.write("	<div id=\"flogo\">Copyright &copy; Class 4. All rights reserved.</div>\r\n");
	      out.write("</div>\r\n");
	      out.write("\r\n");
	      out.write("\r\n");
	      out.write("</div>\r\n");
	      out.write("\r\n");
	      out.write("</body>\r\n");
	      out.write("</html>");
		
	}

}
