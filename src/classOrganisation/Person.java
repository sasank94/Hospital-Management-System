package classOrganisation;
import java.sql.Date;
import java.util.ArrayList;

public class Person {
public String title;
public String givenName;
public String middleName;
public String familyName;
public String name;
public Date birthDate;
public String Gender;
public String Phone;
public String homeAddress;

public Person(String Name, String Gender, String Address, String Phone)
{
	this.name=name;
	this.Gender=Gender;
	this.homeAddress=homeAddress;
	this.Phone=Phone;
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getGivenName() {
	return givenName;
}
public void setGivenName(String givenName) {
	this.givenName = givenName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getFamilyName() {
	return familyName;
}
public void setFamilyName(String familyName) {
	this.familyName = familyName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getBirthDate() {
	return birthDate;
}
public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	Phone = phone;
}
public String getHomeAddress() {
	return homeAddress;
}
public void setHomeAddress(String homeAddress) {
	this.homeAddress = homeAddress;
}
private ArrayList<Hospital> hospital = new ArrayList<Hospital>();
}
