package classOrganisation;

public class Receptionist extends FrontDeskStaff{

	public Receptionist(String Name, String Gender, String Address, String Phone) {
		super(Name, Gender, Address, Phone);
	
	}
public String rName;
public String getrName() {
	return rName;
}
public void setrName(String rName) {
	this.rName = rName;
}

}
