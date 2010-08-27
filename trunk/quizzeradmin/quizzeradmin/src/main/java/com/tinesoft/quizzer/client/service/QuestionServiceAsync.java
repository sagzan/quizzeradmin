package com.tinesoft.quizzer.client.service;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.tinesoft.quizzer.model.domain.Question;
import com.tinesoft.quizzer.model.domain.QuestionUpdate;

public interface QuestionServiceAsync {

	void createQuestion(Question question, AsyncCallback<Question> callback);

	void deleteCategories(ArrayList<Question> categories,
			AsyncCallback<Boolean> callback);

	void deleteQuestion(Question question, AsyncCallback<Boolean> callback);

	void deleteQuestionUpdate(QuestionUpdate update,
			AsyncCallback<Boolean> callback);

	void deleteQuestionUpdates(ArrayList<QuestionUpdate> updates,
			AsyncCallback<Boolean> callback);

	void getCategories(AsyncCallback<ArrayList<Question>> callback);

	void getQuestionUpdates(AsyncCallback<ArrayList<QuestionUpdate>> callback);

	void updateQuestion(Question catgeory, AsyncCallback<Boolean> callback);

	void validateQuestionUpdate(QuestionUpdate update,
			AsyncCallback<Boolean> callback);

	void validateQuestionUpdates(ArrayList<QuestionUpdate> updates,
			AsyncCallback<Boolean> callback);

}
