package day0426;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
//1.HttpServlet 상속
public class HelloServlet extends HttpServlet {
   
//2.요청방식을 처리할 수 있는 method의 Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      //3.응답방식 설정
      response.setContentType("text/html;charset=UTF-8");
      
      //4.응답할 내용을 내보낼 출력 스트림 얻기
      PrintWriter out=response.getWriter();
      
      //5.응답내용 생성
      out.write("\r\n");
         out.write("<!DOCTYPE html>\r\n");
         out.write("<html>\r\n");
         out.write("<head>\r\n");
         out.write("<meta charset=\"UTF-8\">\r\n");
         out.write("<title>Insert title here</title>\r\n");
         out.write("\r\n");
         out.write("<link rel=\"stylesheet\" type=\"text/css\"  href=\"http://localhost/jsp_prj/common/main_v20230217.css\"/>\r\n");
         out.write("\r\n");
         out.write("<style type=\"text/css\">\r\n");
         out.write("\r\n");
         out.write("#wrap{ width: 1000px; height: 1200px;margin: 0px auto; }\r\n");
         out.write("#header{  height: 200px; position: relative; background: #FFFFFF url(http://localhost/jsp_prj/common/images/header_bg.png)  repeat-x;}\r\n");
         out.write("\r\n");
         out.write("#logo{ position:absolute;top: 40px;left:100px; width: 150px; font-weight: bold; font-size: 40px;   font-family: 고딕 ;}   \r\n");
         out.write("#naviBar{ position:absolute;top:140px;left:0px;height: 60px }    \r\n");
         out.write("#container{ height: 900px;position: relative; }    \r\n");
         out.write("\r\n");
         out.write("#footer{ height: 100px;position: relative;  }    \r\n");
         out.write("#flogo{ position:absolute;top:20px;left:100px;height: 60px;font-weight: bold; font-size: 20px; font-family: 고딕 ; color:#d7d7d7; text-align: right; width:100%;  }    \r\n");
         out.write("\r\n");
         out.write("</style>\r\n");
         out.write("\r\n");
         out.write("<!-- jQuery CDN 시작 -->\r\n");
         out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\r\n");
         out.write("<!-- jQuery CDN 끝 -->\r\n");
         out.write("\r\n");
         out.write("<!-- bootstrap 시작-->\r\n");
         out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
         out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
         out.write("<!-- bootstrap 끝-->\r\n");
         out.write("\r\n");
         out.write("<script type=\"text/javascript\">\r\n");
         
         out.write("$(function(){\r\n");
         
         out.println("   $('#btn').click(function(){");
         out.println("   alert('Hello Servlet!!');");
         out.println("});");
         
         out.write("});");
         
         out.write("\r\n");
         out.write("$(function() {\r\n");
         out.write("   \r\n");
         out.write("});//ready\r\n");
         out.write("\r\n");
         out.write("</script>\r\n");
         out.write("\r\n");
         out.write("</head>\r\n");
         out.write("<body>\r\n");
         out.write("\r\n");
         out.write("<div id=\"wrap\">\r\n");
         out.write("\r\n");
         out.write("   <div id=\"header\">\r\n");
         out.write("      <div id=\"logo\">Class 4.</div>\r\n");
         out.write("      <div id=\"naviBar\">navi ( 1000 x 60)</div>\r\n");
         out.write("   </div>\r\n");
         out.write("   \r\n");
         out.write("   <div id=\"container\">\r\n");
         out.write("   Hello Servlet!!\r\n");
         out.println("<input type='button' value='클릭' id='btn' class='btn btn-success'/>");
         
         out.write("   </div>\r\n");
         out.write("   \r\n");
         out.write("   <div id=\"footer\">footer ( 1000 x 100)\r\n");
         out.write("      <div id=\"flogo\"> Copyright &copy; Class 4. All rights reserved.</div>\r\n");
         out.write("   </div>\r\n");
         out.write("   \r\n");
         out.write("</div>\r\n");
         out.write("\r\n");
         out.write("</body>\r\n");
         out.write("</html>\r\n");
      
   }//do get

}//class