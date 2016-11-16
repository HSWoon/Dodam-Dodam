package me.dodam.plan.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dodam.plan.test.domain.User;
import me.dodam.plan.test.repository.user.UserRepository;
import me.dodam.plan.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findBySeq(Long seq) {
		return repository.findOne(seq);
	}

	public void save(User user){
		repository.save(user);
	}
	
	public void delete(Long seq){
		repository.delete(seq);
	}
}
