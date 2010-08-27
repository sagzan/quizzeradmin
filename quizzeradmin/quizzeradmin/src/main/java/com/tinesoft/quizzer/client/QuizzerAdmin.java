package com.tinesoft.quizzer.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.DeferredCommand;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.IncrementalCommand;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.Mvp4gModule;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class QuizzerAdmin implements EntryPoint {

	private enum StartupTask {
		REMOVE_LOADING_MESSAGE_TASK, LOAD_MODULE_TASK
	};

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		//we use both DefferedCommmand and IncrementalCommand to 
		//progressively load the application without freezing it
		DeferredCommand.addCommand(new IncrementalCommand() {
			StartupTask current = StartupTask.LOAD_MODULE_TASK;

			public boolean execute() {
				switch (current) {
				case LOAD_MODULE_TASK:
					loadModule();
					current = StartupTask.REMOVE_LOADING_MESSAGE_TASK;
					break;
				case REMOVE_LOADING_MESSAGE_TASK :
					 removeLoadingMessage();
					current = null;

				}
				return current != null;
			}

		});

	}
	public void removeLoadingMessage() {
		// Remove the Loading Message
		Element parent = RootPanel.get().getElement();
		Element child = RootPanel.get("Loading-Message").getElement();
		DOM.removeChild(parent, child);
	}

	public void loadModule() {

		Mvp4gModule module = (Mvp4gModule) GWT.create(Mvp4gModule.class);
		module.createAndStartModule();
		RootPanel.get().add((Widget) module.getStartView());
	}
}
