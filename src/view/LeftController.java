package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import main.MainApp;

/**
 * Controller for left pane of root layout
 * @author Corbin Staaben
 * @version 1.0
 */
public class LeftController {
	@FXML
	private VBox leftLayoutBox;
	@FXML
	private Label spellbookChoiceBoxLbl;
	@FXML
	private HBox spellbookChoiceHBox;
	@FXML
	private ChoiceBox<String> spellbookChoiceBox;
	@FXML
	private Button viewAllSpellsBtn;
	@FXML
	private Text filtersText;
	@FXML
	private Label classFilterLbl;
	@FXML
	private GridPane classFiltersGridPane;
	@FXML
	private CheckBox bardClassCheckBox;
	@FXML
	private CheckBox clericClassCheckBox;
	@FXML
	private CheckBox druidClassCheckBox;
	@FXML
	private CheckBox palClassCheckBox;
	@FXML
	private CheckBox rangerClassCheckBox;
	@FXML
	private CheckBox sorcClassCheckBox;
	@FXML
	private CheckBox warlockClassCheckBox;
	@FXML
	private CheckBox wizClassCheckBox;
	@FXML
	private HBox spellLvlHBox;
	@FXML
	private Label spellLvlLbl;
	@FXML
	private ComboBox<String> spellLvlComboBox;
	@FXML
	private Label schoolFilterLbl;
	@FXML
	private GridPane schoolFilterGridPane;
	@FXML
	private CheckBox abjurSchoolCheckBox;
	@FXML
	private CheckBox conjSchoolCheckBox;
	@FXML
	private CheckBox divSchoolCheckBox;
	@FXML
	private CheckBox enchSchoolCheckBox;
	@FXML
	private CheckBox evocSchoolCheckBox;
	@FXML
	private CheckBox illuSchoolCheckBox;
	@FXML
	private CheckBox necroSchoolCheckBox;
	@FXML
	private CheckBox transSchoolCheckBox;
	@FXML
	private Label compFilterLbl;
	@FXML
	private HBox compFilterHBox;
	@FXML
	private CheckBox matCompCheckBox;
	@FXML
	private CheckBox somCompCheckBox;
	@FXML
	private CheckBox verbCompCheckBox;
	@FXML
	private CheckBox ritCheckBox;
	@FXML
	private CheckBox concCheckBox;
	
	private MainApp main;
	
	public LeftController() {}
	
	public void setMainApp(MainApp main) {
		this.main = main;
	}
	
	@FXML
	public void initialize() {
		spellbookChoiceBox.getItems().add("Create spellbook...");
		spellLvlComboBox.getItems().addAll("Cantrip", "1", "2", "3", "4", "5", "6", "7", "8", "9");
	}
}
