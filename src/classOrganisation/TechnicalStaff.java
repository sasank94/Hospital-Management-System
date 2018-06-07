package classOrganisation;

public class TechnicalStaff extends Staff{

	public TechnicalStaff(String Name, String Gender, String Address, String Phone) {
		super(Name, Gender, Address, Phone);
		// TODO Auto-generated constructor stub
	}
public String tName;
public String gettName() {
	return tName;
}
public void settName(String tName) {
	this.tName = tName;
}

}
