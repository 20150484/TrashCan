package NetWork;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Like extends Application{

	@Override
	public void start(Stage newStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader mainLoader = new FXMLLoader();
		mainLoader.setLocation(getClass().getResource("Like.fxml"));
		// window root
		AnchorPane mainLayoutAnchorPane = (AnchorPane) mainLoader.load();
		Scene mainScene = new Scene(mainLayoutAnchorPane);
		mainScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		newStage.initStyle(StageStyle.UNDECORATED); // ����ǥ����(Ÿ��Ʋ��) ���ֱ�
		newStage.setTitle("���ã��");
		newStage.setScene(mainScene);
		newStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}