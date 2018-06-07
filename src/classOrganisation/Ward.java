package classOrganisation;

import java.util.ArrayList;

public class Ward {
	public String name(String id){
		return id;
	}
	public String gender;
	public int capacity(int num){
		return num;
				}
	Ward() {
        Ward name = new Ward() ;
}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public ArrayList<Patient> getPatient() {
		return Patient;
	}
	public void setPatient(ArrayList<Patient> patient) {
		Patient = patient;
	}
	private ArrayList<Patient> Patient = new ArrayList<Patient>();
}