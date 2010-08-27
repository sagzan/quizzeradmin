package com.tinesoft.quizzer.server;

import java.util.ArrayList;

import com.tinesoft.quizzer.client.service.CategoryService;
import com.tinesoft.quizzer.model.dao.CategoryDAO;
import com.tinesoft.quizzer.model.dao.CategoryUpdateDAO;
import com.tinesoft.quizzer.model.dao.hibernate.CategoryDAOHib;
import com.tinesoft.quizzer.model.dao.hibernate.CategoryUpdateDAOHib;
import com.tinesoft.quizzer.model.domain.Category;
import com.tinesoft.quizzer.model.domain.CategoryUpdate;

public class CategoryServiceImpl extends GileadRemoteServiceServlet implements
		CategoryService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CategoryDAO categoryDAO = new CategoryDAOHib();

	private CategoryUpdateDAO categoryUpdateDAO = new CategoryUpdateDAOHib();

	@Override
	public ArrayList<Category> getCategories() {

		try {
			return new ArrayList<Category>(categoryDAO.loadAll());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Category createCategory(Category category) {

		try {
			categoryDAO.save(category);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return category;
	}

	@Override
	public boolean deleteCategory(Category category) {

		try {
			categoryDAO.delete(category);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteCategories(ArrayList<Category> categories) {

		boolean result = true;
		for (Category category : categories)
			try {
				categoryDAO.delete(category);
			} catch (Exception e) {
				result = false;
				e.printStackTrace();
			}
		return result;
	}

	@Override
	public boolean updateCategory(Category category) {

		try {
			categoryDAO.saveOrUpdate(category);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public ArrayList<CategoryUpdate> getCategoryUpdates() {

		try {
			return new ArrayList<CategoryUpdate>(categoryUpdateDAO.loadAll());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteCategoryUpdate(CategoryUpdate update) {

		try {
			categoryUpdateDAO.delete(update);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteCategoryUpdates(ArrayList<CategoryUpdate> updates) {

		boolean result = true;
		for (CategoryUpdate update : updates)
			try {
				categoryUpdateDAO .delete(update);
			} catch (Exception e) {
				result = false;
				e.printStackTrace();
			}
		return result;
	}

	@Override
	public boolean validateCategoryUpdate(CategoryUpdate update) {

		try {
			categoryDAO.save(new Category(update));
			categoryUpdateDAO.delete(update);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean validateCategoryUpdates(ArrayList<CategoryUpdate> updates) {
		boolean result = true;
		for (CategoryUpdate update : updates)
			try {
				categoryDAO .save(new Category(update));
				categoryUpdateDAO.delete(update);
			} catch (Exception e) {
				result = false;
				e.printStackTrace();
			}
		return result;
	}
}
