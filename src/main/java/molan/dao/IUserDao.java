package molan.dao;

import java.util.Map;

import molan.pojo.User;

public interface IUserDao {
	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	User selectByKey(Map<String, String> map);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}