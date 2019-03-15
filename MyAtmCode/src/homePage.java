import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class homePage extends Application  {
	public static void main(String[]args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("ATM Machine");
		
		
		LoginForm loginform = new LoginForm(primaryStage);
		MainMenu mainpage = new MainMenu(primaryStage);
		Withdraw withdraw =new Withdraw(primaryStage);
		Deposit deposit = new Deposit(primaryStage);
		BalanceINQ bal = new BalanceINQ(primaryStage);
		loginform.setMainpage(mainpage);
		mainpage.setWithpg(withdraw);
		withdraw.setMainpage(mainpage);
		mainpage.setDeposit(deposit);
		deposit.setMainpage(mainpage);
		mainpage.setBalance(bal);
		bal.setMainpage(mainpage);
		mainpage.setLoginform(loginform);
		loginform.drawInitial();
		mainpage.drawMain();
		withdraw.preparedraw();
		deposit.preparedraw();
		bal.bascene();
		primaryStage.setScene(loginform.getScene());
		primaryStage.show();
	}
}
