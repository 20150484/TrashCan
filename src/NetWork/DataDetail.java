package NetWork;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DataDetail extends Application{
	
	public DataDetail() {
		
	}
	@Override
	public void start(Stage newStage) throws Exception {
		// TODO Auto-generated method stub
		if(newStage == null) {
		FXMLLoader mainLoader = new FXMLLoader();
		mainLoader.setLocation(getClass().getResource("dataDetail.fxml"));
		// window root
		newStage = new Stage();
		AnchorPane mainLayoutAnchorPane = (AnchorPane) mainLoader.load();
		Scene mainScene = new Scene(mainLayoutAnchorPane);
		mainScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		newStage.initStyle(StageStyle.UNDECORATED); // ����ǥ����(Ÿ��Ʋ��) ���ֱ�
		newStage.setTitle("������");
		newStage.setScene(mainScene);
		newStage.show();

		}
	}
}