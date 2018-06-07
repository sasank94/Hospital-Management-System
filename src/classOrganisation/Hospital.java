package classOrganisation;

import java.util.ArrayList;

public class Hospital {
	public String name(String id){
		return id;
	}
	private ArrayList<Person> person = new ArrayList<Person>();
	public String address;
	public String phone;
	public Hospital()
    {
       this.address = address;
       this.phone = phone;
    }
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ArrayList<Person> getPerson() {
		return person;
	}

	public void setPerson(ArrayList<Person> person) {
		this.person = person;
	}
	 private Department d1 ;
	    Hospital(String name, Department d1) {
	        this.d1 = d1 ;
	    }
	  void hospital() {
	      Ward ward = new Ward() ;
	  }
	    
}
