package baco.web.test.repositories;


import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import baco.web.model.CategoryEntity;
import baco.web.model.repositories.ICategoryRepository;
import baco.web.test.AbstractDatabaseTest;

public class CategoryRepositoryTest extends AbstractDatabaseTest {

	private static final Logger LOGGER = Logger.getLogger(CategoryRepositoryTest.class);

	@Inject
	private ICategoryRepository categoryRepository;

	@Test
	public void testCategoryRepository() {
		List<CategoryEntity> categories = this.categoryRepository.findAll();

		LOGGER.info(categories);
	}

}
