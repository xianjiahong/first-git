package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {
	//ҵ���������ݷ��ʲ������
	UserDao dao = new UserDaoImpl();
	@Override
	public void save(User user) {
		// ʹ�����ݷ��ʲ���࣬�������ķ�����ʵ�����ݵ����
		dao.save(user);
	}
	
}
