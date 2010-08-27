package com.tinesoft.quizzer.client.service;

import java.util.ArrayList;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.tinesoft.quizzer.model.domain.Category;
import com.tinesoft.quizzer.model.domain.CategoryUpdate;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface CategoryServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.CategoryService
     */
    void getCategories( AsyncCallback<java.util.ArrayList<Category>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.CategoryService
     */
    void getCategoryUpdates( AsyncCallback<java.util.ArrayList<CategoryUpdate>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.CategoryService
     */
    void createCategory( Category category, AsyncCallback<Category> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.CategoryService
     */
    void deleteCategory( Category category, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.CategoryService
     */
    void deleteCategoryUpdate( CategoryUpdate update, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.CategoryService
     */
    void validateCategoryUpdate( CategoryUpdate update, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.CategoryService
     */
    void deleteCategories( java.util.ArrayList<Category> categories, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.CategoryService
     */
    void deleteCategoryUpdates( java.util.ArrayList<CategoryUpdate> updates, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.CategoryService
     */
    void validateCategoryUpdates( java.util.ArrayList<CategoryUpdate> updates, AsyncCallback<java.lang.Boolean> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.tinesoft.quizzer.client.service.CategoryService
     */
    void updateCategory( Category category, AsyncCallback<java.lang.Boolean> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static CategoryServiceAsync instance;

        public static final CategoryServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (CategoryServiceAsync) GWT.create( CategoryService.class );
                ServiceDefTarget target = (ServiceDefTarget) instance;
                target.setServiceEntryPoint( GWT.getModuleBaseURL() + "categoryService" );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
