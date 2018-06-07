package classOrganisation;

public class Surgeon extends Doctor {

	public Surgeon(String Name, String Gender, String Address, String Phone) {
		super(Name, Gender, Address, Phone);
		// TODO Auto-generated constructor stub
	}
public String SurgeonName;
public String getSurgeonName() {
	return SurgeonName;
}
public void setSurgeonName(String surgeonName) {
	SurgeonName = surgeonName;
}
}
