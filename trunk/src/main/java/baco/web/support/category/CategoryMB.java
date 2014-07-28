package baco.web.support.category;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import baco.web.model.CategoryEntity;
import baco.web.model.repositories.ICategoryRepository;
import baco.web.model.utils.BaseBeans;



@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value = "categoryMB")
public class CategoryMB extends BaseBeans {

	private static final long serialVersionUID = 1L;
	
	private Logger logger = Logger.getLogger(getClass());
	
	@Inject
	private ICategoryRepository categoryRepository;
	
	private List<CategoryEntity> categories;
	
	private CategoryEntity selectedCategory;
	
	private Long id;
	
	public void onLoad() {
		this.categories = this.categoryRepository.findAll();
	}
	
	public List<CategoryEntity> getCategories() {
		return categories;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
		
	public void setCategories(List<CategoryEntity> categories) {
		this.categories = categories;
	}
	
	// If the deleted row has relation with other tables, needs try catch to error tratment
	public void delete() {
		if (this.selectedCategory != null) {
			this.categoryRepository.delete(this.selectedCategory.getId());
		}
	}
	
	//rowSelect Ajax event on list.xhtml with event Select
	public void selectCategory(SelectEvent evt) {
		try {
			if (evt.getObject() != null) {
				this.selectedCategory = (CategoryEntity) evt.getObject();
			} else {
				this.selectedCategory = null;
			}
		} catch (Exception e) {
			this.selectedCategory = null;

			logger.error(e.getMessage(), e);
		}
	}
	
	
	public void unselectCategory() {
		this.selectedCategory = null;
	}

	public CategoryEntity getSelectedCategory() {
		return this.selectedCategory;
	}

	public void setSelectedCategory(CategoryEntity selectedCategory) {
		this.selectedCategory = selectedCategory;
	}
	
	
}