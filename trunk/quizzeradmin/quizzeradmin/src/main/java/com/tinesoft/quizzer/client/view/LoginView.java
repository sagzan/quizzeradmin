package com.tinesoft.quizzer.client.view;

import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.presenter.LoginPresenter.ILoginView;
import com.tinesoft.quizzer.client.widget.gwt.MyButton;
import com.tinesoft.quizzer.client.widget.gwt.MyLabel;
import com.tinesoft.quizzer.client.widget.gwt.MyPasswordTextBox;
import com.tinesoft.quizzer.client.widget.gwt.MyTextBox;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.ITextBox;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;

public class LoginView extends Composite implements ILoginView{

	private MyTextBox login;
	private MyPasswordTextBox password;
	private MyButton okButton;
	private MyButton resetButton;
	private MyLabel message;

	public LoginView() {
		login = new MyTextBox();
		password = new MyPasswordTextBox();
		okButton = new MyButton("OK");
		resetButton = new MyButton("Reset");
		message = new MyLabel("");
		
		VerticalPanel mainPanel = new VerticalPanel();
		
		CaptionPanel cpPanel = new CaptionPanel( "Administrator Login" );
		cpPanel.setStyleName("gwt-CaptionPanel");
		
		HTML title = new HTML("<h1>Welcome on Quizzer!</h1>");
		
		FlexTable table = new FlexTable();
		FlexCellFormatter formatter = table.getFlexCellFormatter();
		
		formatter.setColSpan(0, 0, 2);
		formatter.setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_CENTER);
		
		table.setWidget( 0, 0, message.getMyWidget() );
		
		table.setText( 1, 0, "Login" );
		table.setText( 2, 0, "Password" );

		table.setWidget( 1, 1, login);
		table.setWidget( 2, 1, password);

		table.setWidget( 3, 0, okButton);
		table.setWidget( 3, 1, resetButton);

		title.setStyleName("welcome title");
		
		cpPanel.add(table);

		mainPanel.add(title);
		mainPanel.add(cpPanel);
		
		initWidget( mainPanel );
		
	}


	public IWidget getViewWidget() {
		return this;
	}

	@Override
	public Widget getMyWidget() {
		return this;
	}

	@Override
	public ITextBox getLoginTextBox() {
		return login;
	}

	@Override
	public ITextBox getPasswordTextBox() {
		return password;
	}

	@Override
	public IButton getOkButton() {
		return okButton;
	}

	@Override
	public IButton getResetButton() {
		return resetButton;
	}

	@Override
	public void showLoginMode() {
		okButton.setText("Log me in!");
		resetButton.setVisible(true);
		login.setEnabled(true);
		password.setEnabled(true);
		
	}

	@Override
	public void showLogoutMode() {
		okButton.setText("Log me out!");
		resetButton.setVisible(false);
		login.setEnabled(false);
		password.setEnabled(false);
		
	}
	
	@Override
	public void showMessage(String message, String type) {
		this.message.setVisible(true);
		this.message.setStyleName(type);
		this.message.setText(message);
		
	}
	
	@Override
	public void hideMessage()
	{
		this.message.setVisible(false);
	}

}
