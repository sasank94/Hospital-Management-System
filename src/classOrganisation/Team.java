package classOrganisation;
import java.util.ArrayList;

import com.sun.tools.javac.util.Name;
public class Team {
	public String name(String id){
		return id;
	}
	 Team() {
	        Name teamName = new Name() ;
}
	 public ArrayList<Patient> getPatient() {
		return Patient;
	}
	public void setPatient(ArrayList<Patient> patient) {
		Patient = patient;
	}
	private ArrayList<Patient> Patient = new ArrayList<Patient>();
	 private Doctor doctor ;
	 private ArrayList<ConsultantDoctor> ConsultantDoctor = new ArrayList<ConsultantDoctor>();
}