//Student class, BBR, 28 May 2012.
public class Student {
  
	//declarations.
		String ssn = null;
		String firstName = null;
		String lastName = null;
		String school = null;
		String address = null;
		String phoneNumber = null;
		String birthday = null;
		int age = 0;
		int grade = 0;
				

	//getters and setters. In the code below, the getter method, 
	//called getFirstName, returns a public value, of type String, 
	//as a variable, firstName. The setter method, called setFirstName,
	//is passed an argument of type String, called firstName, from another
	//class. The local value of firstName is then set to the passed in.
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
