package me.dodam.plan.test.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import me.dodam.plan.test.domain.User;

@Repository
public class UserRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public User findBySeq(Long seq){
		return entityManager.find(User.class, seq);
	}
	
	public List<User> findAll(){
		TypedQuery<User> result = entityManager.createQuery("select user from User user", User.class);
		
		if(result != null){
			return result.getResultList();
		}
		
		return null;
	}
	
	@Transactional
	public void insert(User user){
		entityManager.persist(user);
	}
	
	@Transactional
	public void update(User user){
		entityManager.merge(user);
	}
	
	@Transactional
	public void delete(Long seq){
		User user = entityManager.find(User.class, seq);
		
		entityManager.remove(user);
	}
}
