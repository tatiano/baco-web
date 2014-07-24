package baco.web.test.repositories;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import baco.web.model.UserEntity;
import baco.web.model.repositories.IUserRepository;
import baco.web.test.AbstractDatabaseTest;

public class UserRepositoryTest extends AbstractDatabaseTest {
	
	private static final Logger LOGGER = Logger.getLogger(UserRepositoryTest.class);

	@Inject
	private IUserRepository userRepository;

	@Test
	public void testUserRepository() {
		List<UserEntity> users = this.userRepository.findAll();

		LOGGER.info(users);
	}

}
