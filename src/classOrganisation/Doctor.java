package classOrganisation;

import java.util.ArrayList;

public class Doctor extends OperationStaff{
public Doctor(String Name, String Gender, String Address, String Phone) {
		super(Name, Gender, Address, Phone);
	}
public String speciality;
public String location;
public String getSpeciality() {
	return speciality;
}
public void setSpeciality(String speciality) {
	this.speciality = speciality;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
private String doctorName;
void writePrescription(){}
void updatePrescription(Prescription p){}
    String name = new String() ;
    private ArrayList<Patient> Patient = new ArrayList<Patient>();
}
