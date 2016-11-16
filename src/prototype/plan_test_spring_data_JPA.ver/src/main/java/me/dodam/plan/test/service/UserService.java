package me.dodam.plan.test.service;

import java.util.List;

import me.dodam.plan.test.domain.User;

public interface UserService {

	List<User> findAll();
	
	User findBySeq(Long seq);
	
	void save(User user);
	
	void delete(Long seq);
} 
