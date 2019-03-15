import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BalanceINQ {
	Scene scene;
	Stage stage;
	transactions tr = new transactions();
	users user = new users();
	MainMenu mainpage;
	public BalanceINQ (Stage stage) {
		this.stage=stage;
	}
public void bascene() {
	Label bal = new Label("Your Current Balance is : ");
	Button back = new Button("Back");
	Label current = new Label();
	GridPane grid = new GridPane();
	grid.add(bal, 50, 50);
	grid.add(current, 60, 50);
	grid.add(back, 0, 1000);
	scene = new Scene(grid,600,600);
	back.setOnAction(new EventHandler<ActionEvent>(){
		public void handle (ActionEvent event) {
			stage.setScene(mainpage.getScene());
			String money = String.valueOf(tr.balanceInq());
			current.setText(money);
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
