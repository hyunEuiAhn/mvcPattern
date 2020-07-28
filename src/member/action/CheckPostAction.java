package member.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.CommandProcess;

import member.bean.ZipcodeDTO;
import member.dao.MemberDAO;

public class CheckPostAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		String sido = request.getParameter("sido");
		String sigungu = request.getParameter("sigungu");
		String roadname = request.getParameter("roadname");

		System.out.println(sido+","+sigungu+","+roadname);
		//첫번 째 널일 때 값을 안 불러옴
		ArrayList<ZipcodeDTO> list = new ArrayList<ZipcodeDTO>();
		MemberDAO memberDAO = MemberDAO.getInstance();

		if(sido!=null && roadname!=null){
			if(sido!="" && roadname!=null){
				list = memberDAO.getZipcodeList(sido,sigungu,roadname);
			}
		}
		request.setAttribute("list",list);
		
		return "/member/checkPost.jsp";
	}

}
