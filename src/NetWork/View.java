package NetWork;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class View extends Application {
	
	public void start(Stage newStage) throws Exception {
		// TODO Auto-generated method stub
		if (newStage == null) {
		FXMLLoader dataLoader = new FXMLLoader(getClass().getResource("View.fxml"));
		Parent root = dataLoader.load();
		Stage stage = new Stage();
		stage.initStyle(StageStyle.UNDECORATED); // 제목표시줄(타이틀바) 없애기
		stage.setScene(new Scene(root));
		stage.setTitle("테이블뷰");
		stage.show();
		}
	}
}