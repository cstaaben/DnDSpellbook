package view;

import main.MainApp;

public class Controller {
	private LeftController leftLayoutBoxController;
	private MainApp main;
	
	public Controller() {}
	
	public void setLeftLayoutBoxController(LeftController leftLayoutBoxController) {
		this.leftLayoutBoxController = leftLayoutBoxController;
	}
	
	public void setMainApp(MainApp main) { this.main = main; }
}
