package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;
/**
 * �����û���Ϣ��servlet
 * @author ASUS
 *
 */
@WebServlet("/Add")
public class UserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//��������ı���
		req.setCharacterEncoding("UTF-8");
		//
		UserService us = new UserServiceImpl();
		User user = new User();
		//���ҳ���ϵ�����
		String name = req.getParameter("name");
		//ҳ���ϻ�õ��������ݶ���String����
		//
		int age = Integer.parseInt(req.getParameter("age"));
		user.setName("����");
		//����ʵ�����е�setter����Ϊ˽�е����Ը�ֵ
		user.setAge(20);
		
		us.save(user);
		
	}

}
