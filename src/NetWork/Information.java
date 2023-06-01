package NetWork;

import java.io.Serializable;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class Information implements Serializable {
	private  StringProperty city;					// 시도명
	private  StringProperty district;				// 시군구명
	private  StringProperty areaName;				// 관리구역명
	private  StringProperty manageName;				// 관리구역명
	private  StringProperty dischargeType; 			// 배출장소유형
	private  StringProperty dischargePlace;			// 배출장소
	private  StringProperty lifeWay;		 		// 생활쓰레기배출방법
	private  StringProperty foodWay;				// 음식물쓰레기배출방법
	private  StringProperty recycleWay;				// 재활용쓰레기배출방법
	private  StringProperty tempWay;				// 일시적다량쓰레기배출방법
	private  StringProperty tempPlace;				// 일시적다량쓰레기배출장소
	private  StringProperty phoneNum;				// 관리부서전화번호
	private  SimpleIntegerProperty pk;	
	static final long serialVersionUID = 1L;		// 번호
	
	public Information() {
		this.city = new SimpleStringProperty(null);
		this.district = new SimpleStringProperty(null);
		this.manageName = new SimpleStringProperty( null);
		this.areaName = new SimpleStringProperty( null);
		this.pk = new SimpleIntegerProperty(0);
		this.dischargeType = new SimpleStringProperty(null);
		this.dischargePlace = new SimpleStringProperty(null);
		this.lifeWay = new SimpleStringProperty(null);
		this.foodWay = new SimpleStringProperty(null);
		this.recycleWay = new SimpleStringProperty(null);
		this.tempWay = new SimpleStringProperty(null);
		this.tempPlace = new SimpleStringProperty(null);
		this.phoneNum = new SimpleStringProperty(null);
	}
	public StringProperty cityProperty() {return city;}
	public String getCity() {return city.get();}
	public void setCity(String str) {city.set(str);}
	
	public StringProperty districtProperty() {return district;}
	public String getDistrict() {return district.get();}
	public void setDistrict(String str) {district.set(str);}
	
	public StringProperty areaNameProperty() {return areaName;}
	public String getAreaName() {return areaName.get();}
	public void setAreaName(String str) {areaName.set(str);}
	
	public StringProperty manageNameProperty() {return manageName;}
	public String getManageName() {return manageName.get();}
	public void setManageName(String str) {manageName.set(str);}
	
	public StringProperty dischargePlaceProperty() {return dischargePlace;}
	public String getDischargePlace() {return dischargePlace.get();}
	public void setDischargePlace(String str) {dischargePlace.set(str);}
	
	public StringProperty dischargeTypeProperty() {return dischargeType;}
	public String getDischargeType() {return dischargeType.get();}
	public void setDischargeType(String str) {dischargeType.set(str);}
	
	public StringProperty lifeWayProperty() {return lifeWay;}
	public String getLifeWay() {return lifeWay.get();}
	public void setLifeWay(String str) {lifeWay.set(str);}
	
	public StringProperty foodWayProperty() {return foodWay;}
	public String getFoodWay() {return foodWay.get();}
	public void setFoodWay(String str) {foodWay.set(str);}
	
	public StringProperty recycleWayProperty() {return recycleWay;}
	public String getRecycleWay() {return recycleWay.get();}
	public void setRecycleWay(String str) {recycleWay.set(str);}
	
	public StringProperty tempWayProperty() {return tempWay;}
	public String getTempWay() {return tempWay.get();}
	public void setTempWay(String str) {tempWay.set(str);}
	
	public StringProperty tempPlaceProperty() {return tempPlace;}
	public String getTempPlace() {return tempPlace.get();}
	public void setTempPlace(String str) {tempPlace.set(str);}
	
	public StringProperty phoneNumProperty() {return phoneNum;}
	public String getPhoneNum() {return phoneNum.get();}
	public void setPhoneNum(String str) {phoneNum.set(str);}
	
	public SimpleIntegerProperty pkNumProperty() {return pk;}
	public int getPkNum() {return pk.get();}
	public void setPkNum(int i) {pk.set(i);}
}
