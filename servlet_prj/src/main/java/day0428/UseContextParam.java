package day0428;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class UseContextParam extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		//모든 Servlet/JSP에서 사용할 값이 있는 <context-param>의 값 얻기
		//1. ServletContextParam 얻기
		ServletContext sc = getServletContext();
		//2. 값 얻기
		String protocol = sc.getInitParameter("protocol");
		String domain = sc.getInitParameter("domain");
		String contextPath = sc.getInitParameter("context_path");
		//얻은 값으로 공통 URL을 만든다.
		String commURL = protocol + domain + contextPath;
		
	      out.write("<!DOCTYPE html>\r\n");
	      out.write("<html>\r\n");
	      out.write("<head>\r\n");
	      out.write("<meta charset=\"UTF-8\">\r\n");
	      out.write("<title>Insert title here</title>\r\n");
	      out.write("<link rel=\"stylesheet\" type=\"text/css\"  href=\""+commURL+"common/main_v20230217.css\"/>\r\n");
	      out.write("<style type=\"text/css\">\r\n");
	      out.write("#wrap{ width: 1000px; height: 1200px;margin: 0px auto; }\r\n");
	      out.write("#header{  height: 200px; position: relative;\r\n");
	      out.write("	background: #FFFFFF url("+commURL+"common/images/header_bg.png)  repeat-x;}\r\n");
	      out.write("\r\n");
	      out.write("#logo{ position:absolute;top: 40px;left:100px; width: 150px; font-weight: bold; font-size: 40px;\r\n");
	      out.write("	font-family: 고딕 ;}	\r\n");
	      out.write("#naviBar{ position:absolute;top:140px;left:0px;height: 60px }	 \r\n");
	      out.write("#container{ height: 900px;position: relative; }	 \r\n");
	      out.write("\r\n");
	      out.write("#footer{ height: 100px;position: relative;  }	 \r\n");
	      out.write("#flogo{ position:absolute;top:20px;left:100px;height: 60px;font-weight: bold; font-size: 20px;\r\n");
	      out.write("	font-family: 고딕 ; color:#d7d7d7; text-align: right; width:100%;  }	 \r\n");
	      out.write("\r\n");
	      out.write("</style>\r\n");
	      out.write("<!-- bootstrap 시작-->\r\n");
	      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
	      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
	      out.write("<!-- bootstrap 끝-->\r\n");
	      out.write("<!-- jQuery CDN 시작 -->\r\n");
	      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\r\n");
	      out.write("<!-- jQuery CDN 끝 -->\r\n");
	      out.write("<script type=\"text/javascript\">\r\n");
	      out.write("$(function(){\r\n");
	      out.write("	\r\n");
	      out.write("});\r\n");
	      out.write("</script>\r\n");
	      out.write("\r\n");
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      out.write("<div id=\"wrap\"> \r\n");
	      out.write("<div id=\"header\">  \r\n");
	      out.write("	<div id=\"logo\">Class 4.</div>\r\n");
	      out.write("	<div id=\"naviBar\">navi ( 1000 x 60)</div>\r\n");
	      out.write("</div>\r\n");
	      out.write("<div id=\"container\">\r\n");
	      
	      out.print(commURL);
	      
	      out.write("Hello Servlet!!!\r\n");
	      out.write("</div>\r\n");
	      out.write("<div id=\"footer\">footer ( 1000 x 100)\r\n");
	      out.write("	<div id=\"flogo\"> Copyright &copy; Class 4. All rights reserved.</div>\r\n");
	      out.write("</div>\r\n");
	      out.write("</div>\r\n");
	      out.write("</body>\r\n");
	      out.write("</html>\r\n");
		
	}//doGet

}//class
