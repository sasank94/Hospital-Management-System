package classOrganisation;

import java.util.ArrayList;

public class OperationStaff extends Staff{

	public OperationStaff(String Name, String Gender, String Address, String Phone) {
		super(Name, Gender, Address, Phone);
	}
	private ArrayList<Patient> patient = new ArrayList<Patient>();
	public ArrayList<Patient> getPatient() {
		return patient;
	}
	public void setPatient(ArrayList<Patient> patient) {
		this.patient = patient;
	}
}
