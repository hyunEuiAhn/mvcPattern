package member.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.control.CommandProcess;

import member.dao.MemberDAO;

public class LoginAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		//데이터
		request.setCharacterEncoding("UTF-8");
		String id =request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//DB
		MemberDAO memberDAO = MemberDAO.getInstance();
		Map<String,String> map = memberDAO.login(id, pwd);
		
		//응답
		if(map==null)
			return "/member/loginFail.jsp";
		else {
			HttpSession session = request.getSession();
			session.setAttribute("memName", map.get("name"));
			session.setAttribute("memId", map.get("id"));
			session.setAttribute("memEmail", map.get("Email"));

			return "/member/loginOk.jsp";
		}
		
	}

}
