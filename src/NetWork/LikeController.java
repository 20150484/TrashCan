package NetWork;

import java.io.IOException;
import java.util.Calendar;

import application.SInformation;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LikeController {
	private static final String System = null;
	private int i;
	private boolean life,food,recycle,temp;
	private Alert alert;
	@FXML
    private Button button;
	
	@FXML
	private Button button1;
	
	@FXML
	private Button button3;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;
    
    @FXML
    private TextField txt3;
    String str;
    
    @FXML
    private Button like_button;
	
	    public String Day() {
            Calendar cal = Calendar.getInstance();
            int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
            String korDayOfWeek = null;
            switch (dayOfWeek) {
                case 1: 
                    korDayOfWeek = "��";
                    break;
                case 2: 
                    korDayOfWeek = "��";
                    break;
                case 31: 
                    korDayOfWeek = "ȭ";
                    break;
                case 4: 
                    korDayOfWeek = "��";
                    break;
                case 5: 
                    korDayOfWeek = "��";
                    break;
                case 6: 
                    korDayOfWeek = "��";
                    break;
                case 7: 
                    korDayOfWeek = "��";
                    break;
            }
            return korDayOfWeek;
        }
	public LikeController() throws IOException {
		
	
	}
	
	@FXML
    void Go2(ActionEvent event) throws IOException {
		FileController fc = new FileController();
		SocketController st = new SocketController();
		i = fc.FileRead();
		if(i == 0) {
			alert = new Alert(AlertType.WARNING);
			alert.setTitle("���");
			alert.setHeaderText("��ϵ� �� ������ �����ϴ�.");
			alert.setContentText("�˻��Ͽ� ��� �� �� ����� �� �ֽ��ϴ�.");
			alert.showAndWait();
		}else {
		st.sendKey(i);
		SInformation info = st.reciveObject();
		String lifeDay = info.getLifeDay();
		String foodDay = info.getLifeDay();
		String recycleDay = info.getLifeDay();
        String lifeDayArray[] = lifeDay.split("\\+");
        String foodDayArray[] = foodDay.split("\\+");
        String recycleDayArray[] = recycleDay.split("\\+");
        String korDayOfWeek = Day();
        String lifeTxt = " ";
        String foodTxt = " ";
        String recycleTxt = " ";
        for(int i = 0; i<lifeDayArray.length; i++) {
        	if(korDayOfWeek.equals(lifeDayArray[i])) {
        		life = true;
        		lifeTxt = "��Ȱ������ ";
        	}
        	else
        		life = false;
        }
        for(int i = 0; i<foodDayArray.length; i++) {
        	if(korDayOfWeek.equals(foodDayArray[i])) {
        		food = true;
        		foodTxt = "���Ĺ������� ";
        	}
        	else
        		food = false;
        }
        for(int i = 0; i<recycleDayArray.length; i++) {
        	if(korDayOfWeek.equals(recycleDayArray[i])) {
        		recycle = true;
        		recycleTxt = "��Ȱ��ǰ ";
        	}
        	else
        		recycle = false;
        }
        if(life == false && food == false && recycle == false) {
        	txt3.setText("������ �̼����� �Դϴ�.");
        }else {
        this.txt3.setText("������ " + lifeTxt + foodTxt + recycleTxt + " �����ϴ� �� �Դϴ�.");
       
        }
        this.txt1.setText(info.getDistrict());
        this.txt2.setText(korDayOfWeek + "����");
		}
    }
	
	
    @FXML
    void Go(ActionEvent event) throws Exception {
    	Controller con = new Controller();
    	con.start(null);
    	/*View view = new View();
    	view.start(null);*/
    	txt3.setText(str);
    }
    
    @FXML
    void like_button_event(ActionEvent event) {
    	Platform.exit();
    }
    
    @FXML
    void Go3(ActionEvent event) throws Exception {
    	FileController fc = new FileController();
    	int i = fc.FileRead();
    	if(i ==0) {
    		alert = new Alert(AlertType.WARNING);
			alert.setTitle("���");
			alert.setHeaderText("��ϵ� �� ������ �����ϴ�.");
			alert.setContentText("�˻��Ͽ� ��� �� �� ����� �� �ֽ��ϴ�.");
			alert.showAndWait();
    	}
    	else {
    	String temp = Integer.toString(i);
    	DataController dc = new DataController(temp);
    	dc.start(null);
    	}
    }
}