import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginForm{
	users user;
	Scene scene;
	MainMenu mainpage;
	Stage stage;
	
	public LoginForm(Stage stage) {
		this.stage=stage;
	}
	
	public void drawInitial() {
		user=new users();
		Label passwordLabel = new Label("Password: ");
		PasswordField passwordTF = new PasswordField();
		Button submit = new Button("Submit");
		Button b0 = new Button("0");
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		Label validitionLabel =new Label();
		GridPane grid = new GridPane();
		grid.add(passwordLabel,5,9);
		grid.add(passwordTF,6,9);
		grid.add(submit,7,9);
		grid.setVgap(10);
		grid.setHgap(35);
		grid.addRow(10, b1,b2,b3);
		grid.addRow(15, b4,b5,b6);
		grid.addRow(20, b7,b8,b9);
		grid.addRow(25, b0);
		grid.add(validitionLabel,6,10);
		b0.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= passwordTF.getText()+b0.getText();
				passwordTF.setText(s);
			}
			});
		b1.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= passwordTF.getText()+b1.getText();
				passwordTF.setText(s);
			}
			});
		b2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= passwordTF.getText()+b2.getText();
				passwordTF.setText(s);
			}
			});
		b3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= passwordTF.getText()+b3.getText();
				passwordTF.setText(s);
			}
			});
		b4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= passwordTF.getText()+b4.getText();
				passwordTF.setText(s);
			}
			});
		b5.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= passwordTF.getText()+b5.getText();
				passwordTF.setText(s);
			}
			});
		b6.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= passwordTF.getText()+b6.getText();
				passwordTF.setText(s);
			}
			});
		b7.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= passwordTF.getText()+b7.getText();
				passwordTF.setText(s);
			}
			});
		b8.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= passwordTF.getText()+b8.getText();
				passwordTF.setText(s);
			}
			});
		b9.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= passwordTF.getText()+b9.getText();
				passwordTF.setText(s);
			}
			});
		submit.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String password= passwordTF.getText();
				boolean valid= user.validate(password);
				passwordTF.setText("");
				if (valid) {
					stage.setScene(mainpage.getScene());
				}
				else {
					Alert wrong = new Alert(AlertType.ERROR);
					wrong.setTitle("Personal Account");
					wrong.setHeaderText(null);
					wrong.setContentText("Wrong Password");
					wrong.showAndWait();
				}
			}  
			}); 
		 scene = new Scene(grid,800,800);
	}
	
public Scene getScene() {
	return this.scene;
}

public void setMainpage(MainMenu mainpage) {
	this.mainpage = mainpage;
}


}
