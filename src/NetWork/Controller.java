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
    	if(str == "����Ư����")
    		list_2 = FXCollections.observableArrayList("��������", "���ϱ�", "�߶���", "������", "������", "���Ǳ�", "��걸", "���ϱ�", "���ʱ�", "���빮��", "�����",
    				"���α�", "���۱�", "���ı�", "��õ��", "������", "���α�", "������", "������", "����", "�߱�", "��õ��");
    	
    	if(str == "��õ������")
    		list_2 = FXCollections.observableArrayList("������", "��籸", "����", "������", "������", "����", "����", "����Ȧ��", "��ȭ��", "�߱�");
    	
    	if(str == "����������")
    		list_2 = FXCollections.observableArrayList("�߱�", "������", "����", "�����");
    	
    	if(str == "���ֱ�����")
    		list_2 = FXCollections.observableArrayList("���걸", "����", "����", "�ϱ�");
    	
    	if(str == "�λ걤����")
    		list_2 = FXCollections.observableArrayList("���", "���屺", "������", "����", "�λ�����", "������", "������", "���ϱ�", "�ؿ�뱸", "����", "������",
    				"������", "�ϱ�", "������", "�߱�", "����");
    	
    	if(str == "��걤����")
    		list_2 = FXCollections.observableArrayList("����", "�ϱ�", "���ֱ�", "����", "�߱�");
    	
    	if(str == "�뱸������")
    		list_2 = FXCollections.observableArrayList("�޼���", "�ϱ�", "����", "����", "������", "����", "�޼���", "�߱�");
    	
    	if(str == "��⵵")
    		list_2 = FXCollections.observableArrayList("��õ��", "����õ", "�����", "���ֽ�", "���ý�", "������", "������", "�ϳ���", "����", "�����", "������",
    				"��õ��", "���ֽ�", "���ֽ�", "�Ⱦ��", "�����", "������", "��õ��", "���ֽ�", "��õ��", "�ȼ���", "�����ν�", "�Ȼ��", "������", "������", "�ǿս�",
    				"����");
    	
    	if(str == "������")
    		list_2 = FXCollections.observableArrayList("������", "����", "��â��", "ȫõ��", "������", "�籸��", "������", "��ô��", "�¹��", "���ֽ�", "Ⱦ����",
    				"���ؽ�", "������");
    	
    	if(str == "��󳲵�")
    		list_2 = FXCollections.observableArrayList("��û��", "��â��", "��õ��", "â�籺", "�뿵��", "â����", "���ֽ�", "���ر�", "�Ƿɱ�", "����", "��õ��",
    				"������", "â����", "�Ծ籺", "����", "���ؽ�", "�о��");
    	
    	if(str == "���ϵ�")
    		list_2 = FXCollections.observableArrayList("��õ��", "�︪��", "û����", "��õ��", "�Ǽ���", "���ֽ�", "����", "���ֽ�", "û�۱�", "�����", "���ֱ�",
    				"�ȵ���", "��ȭ��", "���̽�", "���籺", "���ֽ�", "������", "ĥ�", "��õ��", "���׽�");
    	
    	if(str == "���󳲵�")
    		list_2 = FXCollections.observableArrayList("���ϱ�", "���", "������", "������", "��õ��", "�ϵ���", "���ﱺ", "�س���", "������", "����", "���ʱ�",
    				"������", "��籺", "������", "�����", "ȭ����", "���ﱺ", "������");
    	
    	if(str == "����ϵ�")
    		list_2 = FXCollections.observableArrayList("�����", "��â��", "�����", "���ֱ�", "���ֱ�", "��â��", "�ξȱ�", "�ͻ��", "�ӽǱ�", "������", "���ȱ�",
    				"���ֽ�");
    	
    	if(str == "��û����")
    		list_2 = FXCollections.observableArrayList("û�籺", "����", "�ο���", "�ݻ걺", "���ɽ�", "�����", "ȫ����", "������", "�¾ȱ�", "���걺", "õ�Ƚ�",
    				"��õ��");
    	
    	if(str == "��û�ϵ�")
    		list_2 = FXCollections.observableArrayList("�ܾ籺", "������", "��õ��", "������", "������", "���걺", "���ֽ�", "��õ��", "����");

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
    
    
    // search ��ư �̺�Ʈ
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
 // table���� row�� ����Ŭ��������
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
			this.stage.initStyle(StageStyle.UNDECORATED); // ����ǥ����(Ÿ��Ʋ��) ���ֱ�
			this.stage.setTitle("������");
			this.stage.setScene(mainScene);
			this.stage.show();
		}
	}
    @FXML
    void view_close_action(ActionEvent event) {
    	
    	this.stage.close();
    	
    }
    
    private ObservableList<String> list = FXCollections.observableArrayList("����Ư����", "��õ������", "�λ걤����", "����������", "���ֱ�����", "�뱸������", "��⵵", "������", "���ϵ�", "��󳲵�", "����ϵ�", "���󳲵�", "��û�ϵ�", "��û����");
    
   
}