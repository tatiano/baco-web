package baco.web.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import baco.web.model.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, Long>{
	
	public UserEntity findByUsernameAndPassword(String username, String password);

}


