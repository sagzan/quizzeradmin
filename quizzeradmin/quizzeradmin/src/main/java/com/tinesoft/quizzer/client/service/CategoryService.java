package com.tinesoft.quizzer.client.service;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tinesoft.quizzer.model.domain.Category;
import com.tinesoft.quizzer.model.domain.CategoryUpdate;

@RemoteServiceRelativePath("categoryService")
public interface CategoryService extends RemoteService {

	public ArrayList<Category> getCategories();
	
	public ArrayList<CategoryUpdate> getCategoryUpdates();

	public Category createCategory(Category category);			

	public boolean deleteCategory(Category category) ;
	
	public boolean deleteCategoryUpdate(CategoryUpdate update) ;
	
	public boolean validateCategoryUpdate(CategoryUpdate update) ;

	public boolean deleteCategories(ArrayList<Category> categories);
	
	public boolean deleteCategoryUpdates(ArrayList<CategoryUpdate> updates);
	
	public boolean validateCategoryUpdates(ArrayList<CategoryUpdate> updates);

	public boolean updateCategory(Category category) ;

}
