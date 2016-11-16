package me.dodam.plan.test.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dodam.plan.test.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
