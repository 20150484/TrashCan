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
		stage.initStyle(StageStyle.UNDECORATED); // ����ǥ����(Ÿ��Ʋ��) ���ֱ�
		stage.setScene(new Scene(root));
		stage.setTitle("���̺��");
		stage.show();
		}
	}
}