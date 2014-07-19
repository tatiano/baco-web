package baco.web.support.category;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import baco.web.model.CategoryEntity;
import baco.web.model.utils.BaseBeans;



@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value = "categoryMB")
public class CategoryMB extends BaseBeans {

	private static final long serialVersionUID = 1L;
	
	private List<CategoryEntity> categories;
	
	private CategoryEntity selectedCategory;
	
	public void onLoad() {
		this.categories = new ArrayList<CategoryEntity>(); 
		categories.add(new CategoryEntity(1L, "Category Name 1", "Description 1", null));
		categories.add(new CategoryEntity(2L, "Category Name 2", "Description 2", null));
		categories.add(new CategoryEntity(3L, "Category Name 3", "Description 3", null));
		categories.add(new CategoryEntity(4L, "Category Name 4", "Description 4", null));
		categories.add(new CategoryEntity(5L, "Category Name 5", "Description 5", null));
		categories.add(new CategoryEntity(6L, "Category Name 6", "Description 6", null));
		categories.add(new CategoryEntity(7L, "Category Name 7", "Description 7", null));
		categories.add(new CategoryEntity(8L, "Category Name 8", "Description 8", null));
		categories.add(new CategoryEntity(9L, "Category Name 9", "Description 9", null));
		categories.add(new CategoryEntity(10L, "Category Name 10", "Description 10", null));
		categories.add(new CategoryEntity(11L, "Category Name 10", "Description 11", null));
		categories.add(new CategoryEntity(12L, "Category Name 11", "Description 12", null));
		categories.add(new CategoryEntity(13L, "Category Name 12", "Description 13", null));
		categories.add(new CategoryEntity(14L, "Category Name 13", "Description 14", null));
		categories.add(new CategoryEntity(15L, "Category Name 14", "Description 15", null));
	}
	
	
	
	public List<CategoryEntity> getCategories() {
		return categories;
	}
	
	public void setCategories(List<CategoryEntity> categories) {
		this.categories = categories;
	}
	
	
	public void unselectCategory() {
		//this.selectedCategory = null;
	}

	public CategoryEntity getSelectedCategory() {
		return this.selectedCategory;
	}

	public void setSelectedCategory(CategoryEntity selectedCategory) {
		this.selectedCategory = selectedCategory;
	}
	
	
}