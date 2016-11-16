package me.dodam.plan.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dodam.plan.test.domain.User;
import me.dodam.plan.test.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User findBySeq(Long seq) {
		return repository.findBySeq(seq);
	}

	public List<User> findAll() {
		return repository.findAll();
	}

	public void save(User user){
		if(user.getSeq() == null){
			repository.insert(user);
		}else{
			repository.update(user);
		}
	}
	
	public void delete(Long seq){
		repository.delete(seq);
	}
}
