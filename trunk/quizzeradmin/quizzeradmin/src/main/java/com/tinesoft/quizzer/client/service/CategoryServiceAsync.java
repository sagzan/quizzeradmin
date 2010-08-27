package com.tinesoft.quizzer.client.service;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.tinesoft.quizzer.model.domain.Category;
import com.tinesoft.quizzer.model.domain.CategoryUpdate;

public interface CategoryServiceAsync {

	void createCategory(Category category, AsyncCallback<Category> callback);

	void deleteCategories(ArrayList<Category> categories,
			AsyncCallback<Boolean> callback);

	void deleteCategory(Category category, AsyncCallback<Boolean> callback);

	void deleteCategoryUpdate(CategoryUpdate update,
			AsyncCallback<Boolean> callback);

	void deleteCategoryUpdates(ArrayList<CategoryUpdate> updates,
			AsyncCallback<Boolean> callback);

	void getCategories(AsyncCallback<ArrayList<Category>> callback);

	void getCategoryUpdates(AsyncCallback<ArrayList<CategoryUpdate>> callback);

	void updateCategory(Category category, AsyncCallback<Boolean> callback);

	void validateCategoryUpdate(CategoryUpdate update,
			AsyncCallback<Boolean> callback);

	void validateCategoryUpdates(ArrayList<CategoryUpdate> updates,
			AsyncCallback<Boolean> callback);

}
