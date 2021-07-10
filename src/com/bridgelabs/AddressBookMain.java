/****************************************************************
 * Purpose : To create a address book of a user.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;
import java.util.ArrayList;
import java.util.Scanner;
class contactInfo {
	private String firstName, lastName, address, city, state, email;
	private long zip, phoneNumber;
	
	public String toString() {
		return "First name= "+firstName + " Last name= " +lastName+" Address= "+address+" City= "+city+" State= "+state
				+" Zip= "+zip+" Phone Number= "+phoneNumber+" E-mail= "+email;
	}

	/* Generating setters and getters for class */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

public class AddressBookMain {
	private static Scanner sc = new Scanner(System.in);
	ArrayList<contactInfo> arrayPersonDetails = new ArrayList<>();
	
	public void addDetails() {
		contactInfo contact_details = new contactInfo();
		
		System.out.println("Enter First name: ");
		contact_details.setFirstName(sc.next());
		System.out.println("Enter Last name: ");
		contact_details.setLastName(sc.next());
		System.out.println("Enter Address: ");
		contact_details.setAddress(sc.next());
		System.out.println("Enter your City: ");
		contact_details.setCity(sc.next());
		System.out.println("Enter your State: ");
		contact_details.setState(sc.next());
		System.out.println("Enter Zip code: ");
		contact_details.setZip(sc.nextLong());
		System.out.println("Enter your Phone Number: ");
		contact_details.setPhoneNumber(sc.nextLong());
		System.out.println("Enter your E-mail: ");
		contact_details.setEmail(sc.next());
		
		arrayPersonDetails.add(contact_details);
		System.out.println(arrayPersonDetails);
		int i = 1;
		arrayPersonDetails.get(i);
		
	}
	

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book program ");
		
		AddressBookMain final_details = new AddressBookMain();
		
		final_details.addDetails();

	}

}
