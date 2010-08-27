package com.tinesoft.quizzer.client.view;

import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.tinesoft.quizzer.client.presenter.PlayerProfilePresenter.IPlayerProfileView;
import com.tinesoft.quizzer.client.widget.gwt.MyButton;
import com.tinesoft.quizzer.client.widget.gwt.MyCheckBox;
import com.tinesoft.quizzer.client.widget.gwt.MyLabel;
import com.tinesoft.quizzer.client.widget.gwt.MyPasswordTextBox;
import com.tinesoft.quizzer.client.widget.gwt.MyTable;
import com.tinesoft.quizzer.client.widget.gwt.MyTextBox;
import com.tinesoft.quizzer.client.widget.interfaces.IButton;
import com.tinesoft.quizzer.client.widget.interfaces.ICheckBox;
import com.tinesoft.quizzer.client.widget.interfaces.ITextBox;
import com.tinesoft.quizzer.client.widget.interfaces.IWidget;

public class PlayerProfileView extends Composite implements IPlayerProfileView {

	private MyTextBox firstName = new MyTextBox();
	private MyTextBox lastName = new MyTextBox();
	private MyTextBox email = new MyTextBox();
	private MyTextBox login = new MyTextBox();
	private MyPasswordTextBox password = new MyPasswordTextBox();
	private MyTextBox birthDate = new MyTextBox();

	private MyButton update = new MyButton();
	private MyButton cancel = new MyButton("Cancel");
	private MyCheckBox admin = new MyCheckBox("");
	private MyLabel dateFormat = new MyLabel("");

	public PlayerProfileView() {
		CaptionPanel cpPanel = new CaptionPanel("Player Profile");
		cpPanel.setStyleName("gwt-CaptionPanel");
		
		MyTable table = new MyTable();

		table.setText(0, 0, "First Name");
		table.setText(1, 0, "Last Name");
		table.setText(2, 0, "Birth Date");
		table.setText(3, 0, "Login *");
		table.setText(4, 0, "Password *");
		table.setText(5, 0, "Email");
		table.setText(6, 0, "Admin ?");

		table.setWidget(0, 1, firstName.getMyWidget());
		table.setWidget(1, 1, lastName.getMyWidget());
		table.setWidget(2, 1, birthDate.getMyWidget());
		table.setWidget(2, 2, dateFormat.getMyWidget());
		table.setWidget(3, 1, login.getMyWidget());
		table.setWidget(4, 1, password.getMyWidget());
		table.setWidget(5, 1, email.getMyWidget());
		table.setWidget(6, 1, admin.getMyWidget());

		table.setWidget(7, 0, update.getMyWidget());
		table.setWidget(7, 1, cancel.getMyWidget());

		cpPanel.add(table);

		initWidget(cpPanel);
	}

	public IWidget getViewWidget() {
		return this;
	}

	@Override
	public IButton getCancelButton() {
		return cancel;
	}

	@Override
	public ITextBox getEmail() {
		return email;
	}

	@Override
	public ITextBox getFirstName() {
		return firstName;
	}

	@Override
	public ITextBox getLastName() {
		return lastName;
	}

	@Override
	public ITextBox getPassword() {
		return password;
	}

	@Override
	public IButton getUpdateButton() {
		return update;
	}

	@Override
	public ITextBox getLogin() {
		return login;
	}

	@Override
	public Widget getMyWidget() {
		return this;
	}

	@Override
	public void showAddMode() {
		update.setText("Add Player");
	}

	@Override
	public void showUpdateMode() {
		update.setText("Update");
	}

	@Override
	public ITextBox getBirthDate() {
		return birthDate;
	}

	@Override
	public ICheckBox getAdmin() {
		return admin;
	}

	@Override
	public void setDateFormat(String format) {
		dateFormat.setText(format);

	}

}
