package molan.service;

import java.util.Map;

import molan.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	public User getUserById(Map<String, String> map);
	public int addUser(User user);
}
