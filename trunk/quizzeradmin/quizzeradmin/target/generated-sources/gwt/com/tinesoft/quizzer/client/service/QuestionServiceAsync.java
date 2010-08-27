package com.tinesoft.quizzer.client.service;

import java.util.ArrayList;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tinesoft.quizzer.model.domain.Question;
import com.tinesoft.quizzer.model.domain.QuestionUpdate;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface QuestionServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.QuestionService
     */
    void getCategories( AsyncCallback<java.util.ArrayList<Question>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.QuestionService
     */
    void getQuestionUpdates( AsyncCallback<java.util.ArrayList<QuestionUpdate>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.QuestionService
     */
    void createQuestion( Question question, AsyncCallback<Question> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.QuestionService
     */
    void deleteQuestion( Question question, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.QuestionService
     */
    void deleteQuestionUpdate( QuestionUpdate update, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.QuestionService
     */
    void validateQuestionUpdate( QuestionUpdate update, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.QuestionService
     */
    void deleteCategories( java.util.ArrayList<Question> categories, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.QuestionService
     */
    void deleteQuestionUpdates( java.util.ArrayList<QuestionUpdate> updates, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.QuestionService
     */
    void validateQuestionUpdates( java.util.ArrayList<QuestionUpdate> updates, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.QuestionService
     */
    void updateQuestion( Question question, AsyncCallback<java.lang.Boolean> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static QuestionServiceAsync instance;

        public static final QuestionServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (QuestionServiceAsync) GWT.create( QuestionService.class );
                ServiceDefTarget target = (ServiceDefTarget) instance;
                target.setServiceEntryPoint( GWT.getModuleBaseURL() + "questionService" );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
