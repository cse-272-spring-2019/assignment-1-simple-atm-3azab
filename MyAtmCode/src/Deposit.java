import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Deposit {
	Scene scene;
	Stage stage;
	MainMenu mainpage;
	users user=new users();
	transactions tr=new transactions();
	public  Deposit(Stage stage) {
		this.stage=stage;
	}
	public void preparedraw() {
		Label amount = new Label("Enter the amount ");
		TextField cashTF = new TextField();
		Button back = new Button("Back");
		Button submit = new Button("Submit");
		Label done = new Label();
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
		GridPane grid = new GridPane();
		grid.add(amount,3,6);
		grid.add(cashTF,4,6);
		grid.add(submit,5,6);
		grid.add(back, 4, 8);
		grid.setVgap(10);
		grid.setHgap(35);
		grid.addRow(10, b1,b2,b3);
		grid.addRow(15, b4,b5,b6);
		grid.addRow(20, b7,b8,b9);
		grid.addRow(25, b0);
		scene = new Scene(grid,800,800);
		b0.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= cashTF.getText()+b0.getText();
				cashTF.setText(s);
			}
			});
		b1.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= cashTF.getText()+b1.getText();
				cashTF.setText(s);
			}
			});
		b2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= cashTF.getText()+b2.getText();
				cashTF.setText(s);
			}
			});
		b3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= cashTF.getText()+b3.getText();
				cashTF.setText(s);
			}
			});
		b4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= cashTF.getText()+b4.getText();
				cashTF.setText(s);
			}
			});
		b5.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= cashTF.getText()+b5.getText();
				cashTF.setText(s);
			}
			});
		b6.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= cashTF.getText()+b6.getText();
				cashTF.setText(s);
			}
			});
		b7.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= cashTF.getText()+b7.getText();
				cashTF.setText(s);
			}
			});
		b8.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= cashTF.getText()+b8.getText();
				cashTF.setText(s);
			}
			});
		b9.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {	
				String s= cashTF.getText()+b9.getText();
				cashTF.setText(s);
			}
			});
		back.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {
				stage.setScene(mainpage.getScene());
				done.setText("");
			}
		});
		submit.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event) {
				String amcash = cashTF.getText();
				double money = Double.parseDouble(amcash);
				tr.DepositBalance(money);
				cashTF.setText("");
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Deposit account");
				alert.setHeaderText(null);
				alert.setContentText("You have Deposited "+amcash+"$");
				alert.showAndWait();

			}
			});
}
	public Scene getScene() {
		return scene;
	}
public void setMainpage(MainMenu mainpage) {
	this.mainpage = mainpage;
}
}