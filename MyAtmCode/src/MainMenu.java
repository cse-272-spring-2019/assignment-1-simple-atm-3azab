import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainMenu {
Scene scene;
LoginForm loginform; 
Withdraw withpg;
Deposit deposit;
Stage stage;
BalanceINQ balance;
transactions tr = new transactions();

public MainMenu(Stage stage) {
	this.stage=stage;
}

public void drawMain() {
	Label welcome = new Label("Welcome");
	Label welcome1 = new Label("Please Choose An Operation");
	Label history = new Label("");
	Button Withdraw = new Button("WithDraw");
	Button BalanceInquiry = new Button("BalanceInquiry");
	Button Deposit = new Button("Deposit");
	Button Previous = new Button("Previous");
	Button Next = new Button("Next");
	Button logout = new Button("Logout");
	GridPane gridpane = new GridPane();
	gridpane.add(welcome, 0, 0);
	gridpane.add(welcome1, 0, 1);
	gridpane.add(Withdraw, 5, 2);
	gridpane.add(BalanceInquiry, 15, 9);
	gridpane.add(Deposit, 25, 2);
	gridpane.add(Previous, 5,15 );
	gridpane.add(Next, 25, 15);
	gridpane.add(history, 50, 50);
	gridpane.add(logout, 70, 70);
	Withdraw.setOnAction(new EventHandler<ActionEvent>(){
		public void handle (ActionEvent event) {
			history.setText("");
			stage.setScene(withpg.getScene());
		}
	});
	Deposit.setOnAction(new EventHandler<ActionEvent>(){
		public void handle (ActionEvent event) {
			history.setText("");
			stage.setScene(deposit.getScene());
		}
	});
	BalanceInquiry.setOnAction(new EventHandler<ActionEvent>(){
		public void handle (ActionEvent event) {
			tr.balanceInq();
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Balance Inquiry");
			alert.setHeaderText(null);
			String money = String.valueOf(tr.balanceInq());
			alert.setContentText("Your balance is : "+money);
			alert.showAndWait();
		}
		});
	Next.setOnAction(new EventHandler<ActionEvent>(){
		public void handle (ActionEvent event) {
			history.setText(tr.getNext());

		}
	});
	Previous.setOnAction(new EventHandler<ActionEvent>(){
		public void handle (ActionEvent event) {
			history.setText(tr.getPrevious());

		}
	});
	logout.setOnAction(new EventHandler<ActionEvent>(){
		public void handle (ActionEvent event) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("ATM Services");
			alert.setHeaderText(null);
			alert.setContentText("WE HOPE YOU ENJOYED OUR SERVICES");
			alert.showAndWait();
			stage.setScene(loginform.getScene());
		}
		});
	scene = new Scene(gridpane,800,800);
}
public Scene getScene() {
	return scene;
}
public void setLoginform(LoginForm loginform) {
	this.loginform = loginform;
}

public void setWithpg(Withdraw withpg) {
	this.withpg = withpg;
}

public void setDeposit(Deposit deposit) {
	this.deposit = deposit;
}

public void setBalance(BalanceINQ balance) {
	this.balance = balance;
}

}
