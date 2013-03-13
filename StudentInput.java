//Good Job on the last assignment guys.

//Next assignment will consist of making sure you have a deep understanding about arrays. We are going to build on top of the classes in the last assignment.
//( Student and StudentTest). Now I would like you to modify StudentTest to prompt the user for information to populate the Student object. 
//Use the Scanner class to read the input from the terminal. Then print it out. Once this is done. I will send you the next piece of the puzzle.
//Here is an example of how to read input from the terminal using the Scanner class.
//Scanner scanner = new Scanner(System.in);
//System.out.println("Enter your name");
//String name = scanner.nextLine();
//Remember, use the Student object to store all the information.

//import the scanner class.
import java.util.Scanner;
//name the class, StudentInput.
public class StudentInput {
  public static void main(String[] args) {

	
	//create an instance(or copy) of the Student class.
	Student studentObject = new Student();
	//create and instance of the Scanner class, called scanner.
	Scanner scanner = new Scanner(System.in);
	
	//using scanner, pass the user input to local variables.
	System.out.println("Enter your name. Do it.");
	String first = scanner.nextLine();
	System.out.println("Now enter your last name.");
	String last = scanner.nextLine();
	System.out.println("Where do you go to school?");
	String skoolio = scanner.nextLine();
	System.out.println("Enter your address.");
	String addy = scanner.nextLine();
	System.out.println("Enter your age.");
	int howOld = scanner.nextInt();
	System.out.println("Enter your grade.");
	int grade = scanner.nextInt();
	System.out.println("What is your phone number?");
	String digits = scanner.nextLine();
	System.out.println("Enter your birthday.");
	String bornDay = scanner.nextLine();
	
	//give values to initialized variables. Whatever arguments
	//are passed in these setter methods will populate the corresponding
	//variables in the instance of the Student class, called StudentObject.
	studentObject.setFirstName(first);
	studentObject.setLastName(last);
	studentObject.setSchool(skoolio);
	studentObject.setAddress(addy);
	studentObject.setAge(howOld);
	studentObject.setGrade(grade);
	studentObject.setPhoneNumber(digits);
	studentObject.setBirthday(bornDay);

	//print values of variables. I can print the value of any 
	//anything in a class I have instantiated.
	System.out.println(studentObject.getFirstName());
	System.out.println(studentObject.getLastName());
	System.out.println(studentObject.getSchool());
	System.out.println(studentObject.getAddress());
	System.out.println(studentObject.getPhoneNumber());
	System.out.println(studentObject.getBirthday());
	System.out.println(studentObject.getAge());
	System.out.println(studentObject.getGrade());

	
	}	
}
