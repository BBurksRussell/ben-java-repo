//BBR 31 July 2012
//The new assignment is to store the student info in a HashMap.
//I should use the SSN as the key.

import java.util.*;
import java.io.*;
import java.util.Scanner;

//Ask the user to enter their student's info and then print it out.
//The main difference between this class and StudentInputArrayListBuffered is that I should use HashMap.
//to populate the student object.

//Name the class.
public class StudentInputHashMap {
//Main method.
public static void main(String[] args) {


//Instantiate an object of BufferedReader, called br.
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//Instantiate an object of HashMap, called hm.
HashMap<String, Student> hm = new HashMap<String, Student>();
//Ask user how many students they want to enter. This will
//set the number of times that the data input questions will be asked.
try{ //I don't understand what this is.

System.out.println("How many students would you like to enter?");
int num = Integer.parseInt(br.readLine());
//use a for loop to:
   //1.Print the questions and store the answers in scanner objects.
   //2.Instantiate a new object of Student.
   //3.Assign the local variables in the object. 
   //4.Store the object in an array.
for (int i = 0; i< num; i++){
  System.out.println("What is your Social Security Number?");
	String ssn = br.readLine();
	System.out.println("What is your first name?");
	String firstName = br.readLine();
	System.out.println("What is your last name?");
	String lastName = br.readLine();
	System.out.println("Where do you go to school?");
	String school = br.readLine();
	System.out.println("What is your address?");
	String address = br.readLine();
	System.out.println("How old are you?");
	int age = Integer.parseInt(br.readLine());
	System.out.println("What grade are you in?");
	int grade = Integer.parseInt(br.readLine());
	System.out.println("What is your phone number?");
	String phoneNumber = br.readLine();
	System.out.println("What is your birthday?");
	String birthday = br.readLine();
	
	//Instantiate an object of Student class.
	Student studentObject = new Student();	
	
	//populate the object with the values from scanner.
	studentObject.setFirstName(firstName);
	studentObject.setLastName(lastName);
	studentObject.setSchool(school);
	studentObject.setAddress(address);
	studentObject.setAge(age);
	studentObject.setGrade(grade);
	studentObject.setPhoneNumber(phoneNumber);
	studentObject.setBirthday(birthday);
	studentObject.setSsn(ssn);
	
	//store the object that contains all the student information in a HashMap by using the put method.
	//it uses the ssn as a key value.
	hm.put(ssn, studentObject);

}//end first loop that stores data into objects and hashmap

} catch (IOException ioe) {
	ioe.printStackTrace();
         System.out.println("IO error trying to read your name!");
         System.exit(1);
      }//this is part of exception handling. Apparently, I have to use this when I use BufferedReader,
	   //but Marco won't explain it to me yet, so I will just use Scanner below to take the input from the user.

//instantiate a new Scanner Object
Scanner scanner = new Scanner(System.in);

//ask the user which student they want.
System.out.println("Enter the SSN of the student whose information you would like.");
String studentSsn = scanner.nextLine();//scanner stores the ssn as the local String variable, studentSsn.

//Instantiate a new student object, s, which is equal to that hashmap value which corresponds
//to the key which is the local String variable, studentSsn.
Student s = hm.get(studentSsn);
//I call each of the properties that I want by calling the getter of each variable in the Student object, s.
System.out.println(s.getFirstName());
 System.out.println(s.getLastName());
 System.out.println(s.getSchool());
 System.out.println(s.getAddress());
 System.out.println(s.getPhoneNumber());	   
 System.out.println(s.getBirthday());
 System.out.println(s.getAge());
 System.out.println(s.getGrade());

}//close main
}//close class
