package com.tinesoft.quizzer.client.widget.interfaces;

public interface IGrid extends IWidget {

	public void setText(int row, int col, String text);
	public void setWidget(int row, int col, IWidget widget);
}
