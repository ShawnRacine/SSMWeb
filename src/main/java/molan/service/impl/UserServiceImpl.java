package molan.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import molan.dao.IUserDao;
import molan.pojo.User;
import molan.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

	@Override
	public User getUserById(Map<String, String> map) {
		// TODO Auto-generated method stub
		return this.userDao.selectByKey(map);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return this.userDao.insert(user);
	}

}
