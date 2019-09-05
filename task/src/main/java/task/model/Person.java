package task.model;

public class Person {
	
	String name;
	String surname;
	String zipCode;
	String city;
	String contactNumber;
	Boolean error=false;
	
	
	public Person(String name, String surname, String zipCode, String city, String contactNumber) {
		super();
		this.name = name;
		this.surname = surname;
		this.zipCode = zipCode;
		this.city = city;
		this.contactNumber = contactNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Boolean getError() {
		return error;
	}
	public void setError(Boolean error) {
		this.error = error;
	}
	
	

}
