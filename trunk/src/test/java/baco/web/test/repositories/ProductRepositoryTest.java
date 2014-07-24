package baco.web.test.repositories;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import baco.web.model.ProductEntity;
import baco.web.model.repositories.IProductRepository;
import baco.web.test.AbstractDatabaseTest;

public class ProductRepositoryTest extends AbstractDatabaseTest {
	
	private static final Logger LOGGER = Logger.getLogger(ProductRepositoryTest.class);

	@Inject
	private IProductRepository productRepository;

	@Test
	public void testProductRepository() {
		List<ProductEntity> products = this.productRepository.findAll();

		LOGGER.info(products);
	}

}
