package NetWork;




import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

import application.SInformation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Controller implements Initializable  {

	
	@FXML
    private Button btnSearch;

    @FXML
    private TableColumn<Information, String> city = new TableColumn<Information, String>();

    @FXML
    private ComboBox<String> comboBox = new ComboBox<>();
    
    
    @FXML
    private ComboBox<String> comboBox_2 = new ComboBox<String>();

    @FXML
    private TableColumn<Information, String> district = new TableColumn<Information, String>();
    
    @FXML
    private TableColumn<Information, String> areaName = new TableColumn<Information, String>();
    @FXML
    private TableColumn<Information, String> manageName = new TableColumn<Information, String>();

    @FXML
    public TableView<Information> table = new TableView<>();
    
    @FXML
    private Button view_close_button;
    
   
    
    @FXML
    private TextField txtMsg;
    private static ObservableList<Information> trash_table = FXCollections.observableArrayList();
    private static ArrayList<SInformation> infoList;
    public Controller() {
    	
    }
    private ObservableList<String> list_2;
    
    @FXML
    void combobox1_event(ActionEvent event) {
    	String str = comboBox.getSelectionModel().getSelectedItem().toString();
    	if(str == "서울특별시")
    		list_2 = FXCollections.observableArrayList("영등포구", "강북구", "중랑구", "성동구", "광진구", "관악구", "용산구", "성북구", "서초구", "서대문구", "노원구",
    				"종로구", "동작구", "송파구", "금천구", "마포구", "구로구", "강남구", "강서구", "은평구", "중구", "양천구");
    	
    	if(str == "인천광역시")
    		list_2 = FXCollections.observableArrayList("남동구", "계양구", "부평구", "옹진군", "연수구", "동구", "서구", "미추홀구", "강화군", "중구");
    	
    	if(str == "대전광역시")
    		list_2 = FXCollections.observableArrayList("중구", "유성구", "서구", "대덕구");
    	
    	if(str == "광주광역시")
    		list_2 = FXCollections.observableArrayList("광산구", "동구", "서구", "북구");
    	
    	if(str == "부산광역시")
    		list_2 = FXCollections.observableArrayList("사상구", "기장군", "영도구", "서구", "부산진구", "동래구", "금정구", "사하구", "해운대구", "동구", "연제구",
    				"강서구", "북구", "수영구", "중구", "남구");
    	
    	if(str == "울산광역시")
    		list_2 = FXCollections.observableArrayList("동구", "북구", "울주군", "남구", "중구");
    	
    	if(str == "대구광역시")
    		list_2 = FXCollections.observableArrayList("달성군", "북구", "서구", "남구", "수성구", "동구", "달서구", "중구");
    	
    	if(str == "경기도")
    		list_2 = FXCollections.observableArrayList("이천시", "동두천", "광명시", "광주시", "평택시", "구리시", "김포시", "하남시", "가평군", "시흥시", "수원시",
    				"포천시", "양주시", "여주시", "안양시", "오산시", "남양주", "부천시", "파주시", "과천시", "안성시", "의정부시", "안산시", "군포시", "성남시", "의왕시",
    				"양평군");
    	
    	if(str == "강원도")
    		list_2 = FXCollections.observableArrayList("정선군", "고성군", "평창군", "홍천군", "인제군", "양구군", "강릉시", "삼척시", "태백시", "원주시", "횡성군",
    				"동해시", "영월군");
    	
    	if(str == "경상남도")
    		list_2 = FXCollections.observableArrayList("산청군", "거창군", "사천시", "창녕군", "통영시", "창원시", "진주시", "남해군", "의령군", "고성군", "합천군",
    				"거제시", "창원시", "함양군", "양산시", "김해시", "밀양시");
    	
    	if(str == "경상북도")
    		list_2 = FXCollections.observableArrayList("예천군", "울릉군", "청도군", "김천시", "의성군", "영주시", "경산시", "경주시", "청송군", "문경시", "성주군",
    				"안동시", "봉화군", "구미시", "영양군", "상주시", "울진군", "칠곡군", "영천시", "포항시");
    	
    	if(str == "전라남도")
    		list_2 = FXCollections.observableArrayList("영암군", "곡성군", "목포시", "정성군", "순천시", "완도군", "장흥군", "해남군", "보성군", "함평군", "구례군",
    				"강진군", "담양군", "여수시", "광양시", "화순군", "고흥군", "영광군");
    	
    	if(str == "전라북도")
    		list_2 = FXCollections.observableArrayList("장수군", "고창군", "군산시", "무주군", "완주군", "순창군", "부안군", "익산시", "임실군", "정읍시", "진안군",
    				"전주시");
    	
    	if(str == "충청남도")
    		list_2 = FXCollections.observableArrayList("청양군", "논산시", "부여군", "금산군", "보령시", "서산시", "홍성군", "당진시", "태안군", "예산군", "천안시",
    				"서천군");
    	
    	if(str == "충청북도")
    		list_2 = FXCollections.observableArrayList("단양군", "영동군", "옥천군", "보은군", "음성군", "괴산군", "충주시", "제천시", "증평군");

    	comboBox_2.setItems(list_2);
    }



    public void setTable(ArrayList<SInformation> al) {
    	
    	
    	trash_table.removeAll(trash_table);
    	try {
    	infoList = al;
    	Iterator it = infoList.iterator();
		int count = 0;
		while(it.hasNext()) {
			it.next();
			Information info = new Information();
			info.setPkNum(infoList.get(count).getPk());
			info.setCity(infoList.get(count).getCity());
			info.setDistrict(infoList.get(count).getDistrict());
			info.setManageName(infoList.get(count).getManageName());
			info.setAreaName(infoList.get(count).getAreaName());
			trash_table.add(info);
			count++;
		}
		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
    
    
    // search 버튼 이벤트
    @FXML
    void Search(ActionEvent event) {
    	String stCombo = comboBox.getValue();
    	String stCombo2 = comboBox_2.getValue();
    	String stTxt = txtMsg.getText();
    	
	try {
		SocketController ct = new SocketController();
		ct.sendSearch(stCombo,stCombo2,stTxt);
		this.infoList = ct.reciveObjectList();
		this.setTable(infoList);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	table.setItems(trash_table);
	city.setCellValueFactory(f -> f.getValue().cityProperty());
	district.setCellValueFactory(f -> f.getValue().districtProperty());
	areaName.setCellValueFactory(f -> f.getValue().areaNameProperty());
	manageName.setCellValueFactory(f -> f.getValue().manageNameProperty());
	
	table.setOnMouseClicked(new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent event) {
			if(event.getClickCount() > 1) {
				
    			Information tmp = table.getSelectionModel().getSelectedItem();
    			int i = tmp.getPkNum();
    			String tempStr = ""+i;
    			
    			new DataController(tempStr);
    			try {
    				DataController dd = new DataController();
    				dd.start(null);
    			} catch (Exception e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
			
		}
	}
		
	});
}
 // table에서 row를 더블클릭했을때
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	
    	comboBox.setItems(list);
    }
    private static Stage stage;
    public void start(Stage newStage) throws Exception {
		// TODO Auto-generated method stub
		if (newStage == null) {
			FXMLLoader dataLoader = new FXMLLoader();
			dataLoader.setLocation(getClass().getResource("View.fxml"));
			// window root
			this.stage = new Stage();
			AnchorPane mainLayoutAnchorPane = (AnchorPane) dataLoader.load();
			Scene mainScene = new Scene(mainLayoutAnchorPane);
			this.stage.initStyle(StageStyle.UNDECORATED); // 제목표시줄(타이틀바) 없애기
			this.stage.setTitle("ㅇㄹㅇ");
			this.stage.setScene(mainScene);
			this.stage.show();
		}
	}
    @FXML
    void view_close_action(ActionEvent event) {
    	
    	this.stage.close();
    	
    }
    
    private ObservableList<String> list = FXCollections.observableArrayList("서울특별시", "인천광역시", "부산광역시", "대전광역시", "광주광역시", "대구광역시", "경기도", "강원도", "경상북도", "경상남도", "전라북도", "전라남도", "충청북도", "충청남도");
    
   
}