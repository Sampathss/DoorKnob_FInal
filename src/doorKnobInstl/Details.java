package doorKnobInstl;

public abstract class Details {
	String PersonName;
	double cost;
	String description;
	int doorKnobNum;
	String MobileNum;
	String Email;
	String City;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	String Street;
	
	
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public String getMobileNum() {
		return MobileNum;
	}
	public void setMobileNum(String mobileNum) {
		MobileNum = mobileNum;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getDoorKnobNum() {
		return doorKnobNum;
	}
	public void setDoorKnobNum(int doorKnobNum) {
		this.doorKnobNum = doorKnobNum;
	}
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	


}
