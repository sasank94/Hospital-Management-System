package classOrganisation;

public class AdministrativeStaff extends Staff{

	public AdministrativeStaff(String Name, String Gender, String Address, String Phone) {
		super(Name, Gender, Address, Phone);
		// TODO Auto-generated constructor stub
	}
public String staffName;
public String getStaffName() {
	return staffName;
}
public void setStaffName(String staffName) {
	this.staffName = staffName;
}

}
