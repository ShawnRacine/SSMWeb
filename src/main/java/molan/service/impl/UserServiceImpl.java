package molan.service.impl;

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

}
