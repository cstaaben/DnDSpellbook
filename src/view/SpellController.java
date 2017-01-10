package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import main.MainApp;

public class SpellController {

	@FXML
	private Text spellSchoolText;
	@FXML
	private Label spellCastTimeLbl;
	@FXML
	private Label spellDurLbl;
	@FXML
	private Label spellCompsLbl;
	@FXML
	private Label spellMatsLbl;
	@FXML
	private Text spellMatsText;
	@FXML
	private Text spellDescText;
	@FXML
	private Text spellRangeText;

	private MainApp main;
	
	public void setMainApp(MainApp main) { this.main = main; }
	
	
	
}
