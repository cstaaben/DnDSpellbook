package main;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Spell;
import view.Controller;
import view.LeftController;

import java.io.IOException;

public class MainApp extends Application {
	
	private Stage primaryStage;
	private BorderPane rootLayout;
	
	private ObservableList<Spell> spellData = FXCollections.observableArrayList();
	
	public MainApp() {
		for (int i = 0; i < 10; i++) {
			spellData.add(new Spell("spell" + i, "school" + i, "castTime" + i, "rangeShape" + i,
					"componenents" + i, "duration" + i, "description" + i, "casterClass" + i, i, i));
		}
		
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage= primaryStage;
		this.primaryStage.setTitle("5e Spellbook");
		
		initRootLayout();
		showLeftLayout();
	}
	
	private void showLeftLayout() {
		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getClassLoader().getResource("view/leftLayout.fxml"));
			loader.setLocation(this.getClass().getClassLoader().getResource("view/leftLayout.fxml"));
			VBox leftRoot = (VBox)loader.load();
			
			LeftController lctrl = loader.getController();
			lctrl.setMainApp(this);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initRootLayout() {
	    try {
		    FXMLLoader loader = new FXMLLoader(this.getClass().getClassLoader().getResource("view/rootLayout.fxml"));
		    this.rootLayout = loader.load(getClass().getClassLoader().getResource("view/rootLayout.fxml"));
		    this.primaryStage.setScene(new Scene(this.rootLayout, 800, 600));
		    this.primaryStage.show();
		
		    Controller ctrl = loader.getController();
		    ctrl.setMainApp(this);
	    }
	    catch(IOException ioe) {
		    ioe.printStackTrace();
	    }
	    
    }

    public void showSpellList() {
	    try {
		    
	    }
	    catch(Exception e) {
		    e.printStackTrace();
	    }
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    public ObservableList<Spell> getSpellData() { return this.spellData; }
}
