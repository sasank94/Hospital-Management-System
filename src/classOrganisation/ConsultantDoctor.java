package classOrganisation;

import java.util.ArrayList;

public class ConsultantDoctor extends Doctor{
public ConsultantDoctor(String Name, String Gender, String Address, String Phone) {
		super(Name, Gender, Address, Phone);
		// TODO Auto-generated constructor stub
	}

public String cdName;

public String getCdName() {
	return cdName;
}

public void setCdName(String cdName) {
	this.cdName = cdName;
}
private ArrayList<Team> Team = new ArrayList<Team>();
}
