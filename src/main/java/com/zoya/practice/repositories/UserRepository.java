package com.zoya.practice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.zoya.practice.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);

}
