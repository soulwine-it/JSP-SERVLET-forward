package sec01.ex06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String address = (String)request.getAttribute("address");
		
		out.print("<html><body>");
		out.print("주소:" + address);
		out.print("<br>");
		out.println("redirect를 이용한 바인딩 실습입니다.");
		out.println("</body></html>");
		
	}

}
