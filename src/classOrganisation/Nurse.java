package classOrganisation;

public class Nurse extends OperationStaff{

	public Nurse(String Name, String Gender, String Address, String Phone) {
		super(Name, Gender, Address, Phone);
		// TODO Auto-generated constructor stub
	}
public String nName;
public String getnName() {
	return nName;
}
public void setnName(String nName) {
	this.nName = nName;
}

}
