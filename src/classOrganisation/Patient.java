package classOrganisation;
import java.sql.Date;
import java.util.ArrayList;
public class Patient extends Person{
	public Patient(String Name, String Gender, String Address, String Phone) {
		super(Name, Gender, Address, Phone);
	}
	
	public String id(String id){
		return id;
	}
public Date accepted;
public String prescriptions;
public String allergies;
public String specialReqs;
public Date getAccepted() {
	return accepted;
}
public void setAccepted(Date accepted) {
	this.accepted = accepted;
}
public String getPrescriptions() {
	return prescriptions;
}
public void setPrescriptions(String prescriptions) {
	this.prescriptions = prescriptions;
}
public String getAllergies() {
	return allergies;
}
public void setAllergies(String allergies) {
	this.allergies = allergies;
}
public String getSpecialReqs() {
	return specialReqs;
}
public void setSpecialReqs(String specialReqs) {
	this.specialReqs = specialReqs;
}
private ArrayList<OperationStaff> OperationsStaff = new ArrayList<OperationStaff>();
private ArrayList<Team> Team = new ArrayList<Team>();
public ArrayList<OperationStaff> getOperationsStaff() {
	return OperationsStaff;
}

public void setOperationsStaff(ArrayList<OperationStaff> operationsStaff) {
	OperationsStaff = operationsStaff;
}

public ArrayList<Team> getTeam() {
	return Team;
}

public void setTeam(ArrayList<Team> team) {
	Team = team;
}
private ArrayList<Doctor> Doctor = new ArrayList<Doctor>();
private ArrayList<ConsultantDoctor> ConsultantDoctor = new ArrayList<ConsultantDoctor>();
}
