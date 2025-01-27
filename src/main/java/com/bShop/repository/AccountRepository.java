package com.bShop.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bShop.model.UserEntity;

public interface AccountRepository extends CrudRepository<UserEntity, Long>{

	@Query("SELECT u FROM UserEntity u WHERE u.username = :username")
	public UserEntity getUserByUsername(@Param("username") String username);


	UserEntity findByUsername(String username);
	
}
