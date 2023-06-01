package NetWork;

import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import application.SInformation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.Alert.AlertType;

public class DataController implements Initializable {
		private static String dischargeType,dischargePlace,lifeWay,foodWay,recycleWay,tempWay,
		tempPlace,phoneNum,lifeDay,foodDay,recycleDay,lifeStartTime,foodStartTime,recycleStartTime,
		tempStartTime,lifeEndTime,foodEndTime,recycleEndTime,tempEndTime,uncollectedDate,Department;
		private static int key;
		private Alert alert;
		@FXML
	    private Button button_food;

	    @FXML
	    private Button button_life;

	    @FXML
	    private Button button_recycle;

	    @FXML
	    private Button temp_button;
	    @FXML
	    private Button button_bookmark;
		@FXML
	    private TextField txt1 ;
	    @FXML
	    private TextField txt2;
	    @FXML
	    private TextField txt3;

	    @FXML
	    private TextField txt4;

	    @FXML
	    private TextField txt5;

	    @FXML
	    private TextField txt6;

	    @FXML
	    private TextField txt7;

	    @FXML
	    private TextField txt8;

	    @FXML
	    private TextField txt9;
	    
	    @FXML
	    private TextField txt10;
	    @FXML
	    private ImageView recycle;
	    private static String keyVal;
	    private static SocketController ct = new SocketController();
	    private static Stage stage;
	    public DataController() {
			
	    	
	    }
	    public void dataView(SInformation info) {
	    	this.stage = new Stage();
	    	this.key = info.getPk();
	        this.dischargeType = info.getDischargeType();
	        this.dischargePlace = info.getDischargePlace();
	        this.lifeWay = info.getLifeWay();
	        this.foodWay = info.getFoodWay();
	        this.recycleWay = info.getRecycleWay();
	        this.tempWay = info.getTempWay();
	        this.tempPlace = info.getTempPlace();
	        this.phoneNum = info.getPhoneNum();
	        this.lifeDay = info.getLifeDay();
	        this.foodDay = info.getFoodDay();
	        this.recycleDay = info.getRecycleDay();
	        this.lifeStartTime = info.getLifeStartTime();
	        this.foodStartTime = info.getFoodStartTime();
	        this.recycleStartTime = info.getLifeStartTime();
	        this.tempStartTime = info.getTempStartTime(); 
	        this.lifeEndTime = info.getLifeEndTime();
	        this.foodEndTime = info.getFoodEndTime();
	        this.recycleEndTime = info.getRecycleEndTime();
	        this.tempEndTime = info.getTempEndTime();
	        this.uncollectedDate = info.getUncollectedDate();
	        this.Department = info.getDepartment();
	    }
	    
	    public DataController(String str) {
	    	keyVal = str;
	    	
	    	try {
    	    	int i = Integer.parseInt(keyVal);
    			ct.sendKey(i);
    			SInformation info = ct.reciveObject();
    			dataView(info);
    			}catch(Exception e){
    				e.printStackTrace();
    			}
	    }
	 
	    @FXML
	    void button_food_event(ActionEvent event) {
	    	
	    
	    	txt1.setText(dischargeType);
	    	txt2.setText(dischargePlace);
	    	txt3.setText(foodWay);
	    	txt4.setText(foodDay);
	    	txt5.setText(foodStartTime);
	    	txt6.setText(foodEndTime);
	    	txt7.setText(uncollectedDate);
	    	txt8.setText(phoneNum);
	    	txt9.setText(Department);
	    	txt10.setText(tempPlace);
	    }
	    

	    @FXML
	    void button_life_event(ActionEvent event) {
	    	
	    
	    	txt1.setText(dischargeType);
	    	txt2.setText(dischargePlace);
	    	txt3.setText(lifeWay);
	    	txt4.setText(lifeDay);
	    	txt5.setText(lifeStartTime);
	    	txt6.setText(lifeEndTime);
	    	txt7.setText(uncollectedDate);
	    	txt8.setText(phoneNum);
	    	txt9.setText(Department);
	    	txt10.setText(tempPlace);
	    }

	    @FXML
	    void button_recycle_event(ActionEvent event) {
	    	
	    	
	    	txt1.setText(dischargeType);
	    	txt2.setText(dischargePlace);
	    	txt3.setText(recycleWay);
	    	txt4.setText(recycleDay);
	    	txt5.setText(recycleStartTime);
	    	txt6.setText(recycleEndTime);
	    	txt7.setText(uncollectedDate);
	    	txt8.setText(phoneNum);
	    	txt9.setText(Department);
	    	txt10.setText(tempPlace);
	    }

	    @FXML
	    void temp_button_event(ActionEvent event) {
	    	
	    
	    	txt1.setText(dischargeType);
	    	txt2.setText(dischargePlace);
	    	txt3.setText(tempWay);
	    	txt4.setText("상시");
	    	txt5.setText(tempStartTime);
	    	txt6.setText(tempEndTime);
	    	txt7.setText(uncollectedDate);
	    	txt8.setText(phoneNum);
	    	txt9.setText(Department);
	    	txt10.setText(tempPlace);
	    }
	    
	    @FXML
	    void bookmarkEvent(ActionEvent event) throws IOException {
	    	
	    	FileController fc = new FileController();
	    	fc.FileSet(key);
	    	alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("내 지역 등록완료");
			alert.setHeaderText("내 지역에 등록되었습니다.");
			alert.setContentText("첫 화면에서 불러오기 버튼을 누르면 조회됩니다.");
			alert.showAndWait();
	    }
	    

	
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
		
		 public void start(Stage newStage) throws Exception {
				// TODO Auto-generated method stub
				if(newStage == null) {
				FXMLLoader mainLoader = new FXMLLoader();
				mainLoader.setLocation(getClass().getResource("dataDetail.fxml"));
				// window root
				this.stage = new Stage();
				AnchorPane mainLayoutAnchorPane = (AnchorPane) mainLoader.load();
				Scene mainScene = new Scene(mainLayoutAnchorPane);
				mainScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				this.stage.initStyle(StageStyle.UNDECORATED); // 제목표시줄(타이틀바) 없애기
				this.stage.setTitle("상세정보");
				this.stage.setScene(mainScene);
				this.stage.show();
				}
				
			}
		    @FXML
		    void exitEvent(ActionEvent event) {
		    	this.stage.close();
		    }
}