package com.tinesoft.quizzer.client.service;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tinesoft.quizzer.model.domain.Question;
import com.tinesoft.quizzer.model.domain.QuestionUpdate;

@RemoteServiceRelativePath("questionService")
public interface QuestionService extends RemoteService {

	public ArrayList<Question> getCategories();
	
	public ArrayList<QuestionUpdate> getQuestionUpdates();

	public Question createQuestion(Question question);			

	public boolean deleteQuestion(Question question) ;
	
	public boolean deleteQuestionUpdate(QuestionUpdate update) ;
	
	public boolean validateQuestionUpdate(QuestionUpdate update) ;

	public boolean deleteCategories(ArrayList<Question> categories);
	
	public boolean deleteQuestionUpdates(ArrayList<QuestionUpdate> updates);
	
	public boolean validateQuestionUpdates(ArrayList<QuestionUpdate> updates);

	public boolean updateQuestion(Question question) ;

}
