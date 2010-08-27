package com.tinesoft.quizzer.server;

import java.util.ArrayList;

import com.tinesoft.quizzer.client.service.QuestionService;
import com.tinesoft.quizzer.model.dao.QuestionDAO;
import com.tinesoft.quizzer.model.dao.QuestionUpdateDAO;
import com.tinesoft.quizzer.model.dao.hibernate.QuestionDAOHib;
import com.tinesoft.quizzer.model.dao.hibernate.QuestionUpdateDAOHib;
import com.tinesoft.quizzer.model.domain.Question;
import com.tinesoft.quizzer.model.domain.QuestionUpdate;

public class QuestionServiceImpl extends GileadRemoteServiceServlet implements
		QuestionService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private QuestionDAO questionDAO = new QuestionDAOHib();

	private QuestionUpdateDAO questionUpdateDAO = new QuestionUpdateDAOHib();

	@Override
	public ArrayList<Question> getCategories() {

		try {
			return new ArrayList<Question>(questionDAO.loadAll());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Question createQuestion(Question question) {

		try {
			questionDAO.save(question);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return question;
	}

	@Override
	public boolean deleteQuestion(Question question) {

		try {
			questionDAO.delete(question);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteCategories(ArrayList<Question> categories) {

		boolean result = true;
		for (Question question : categories)
			try {
				questionDAO.delete(question);
			} catch (Exception e) {
				result = false;
				e.printStackTrace();
			}
		return result;
	}

	@Override
	public boolean updateQuestion(Question question) {

		try {
			questionDAO.saveOrUpdate(question);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public ArrayList<QuestionUpdate> getQuestionUpdates() {

		try {
			return new ArrayList<QuestionUpdate>(questionUpdateDAO.loadAll());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteQuestionUpdate(QuestionUpdate update) {

		try {
			questionUpdateDAO.delete(update);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteQuestionUpdates(ArrayList<QuestionUpdate> updates) {

		boolean result = true;
		for (QuestionUpdate update : updates)
			try {
				questionUpdateDAO .delete(update);
			} catch (Exception e) {
				result = false;
				e.printStackTrace();
			}
		return result;
	}

	@Override
	public boolean validateQuestionUpdate(QuestionUpdate update) {

		try {
			questionDAO.save(new Question(update));
			questionUpdateDAO.delete(update);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean validateQuestionUpdates(ArrayList<QuestionUpdate> updates) {
		boolean result = true;
		for (QuestionUpdate update : updates)
			try {
				questionDAO .save(new Question(update));
				questionUpdateDAO.delete(update);
			} catch (Exception e) {
				result = false;
				e.printStackTrace();
			}
		return result;
	}
}
