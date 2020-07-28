package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.CommandProcess;

import member.bean.MemberDTO;
import member.dao.MemberDAO;

public class CheckIdAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		
		MemberDAO memberDAO = MemberDAO.getInstance();
		MemberDTO memberDTO = memberDAO.getDTO(id);
		
		request.setAttribute("id", id);
		if(memberDTO.getId()==null) {
			return "/member/checkIdOk.jsp?id="+id;
		}
		else return "/member/checkIdFail.jsp?id="+id;
	}

}
