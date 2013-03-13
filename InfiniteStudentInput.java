import java.util.Scanner;

//I want you all to to ask the user how many students they want to enter. 
//Once they enter how many they want to create allow them to enter the student info. 
//That will allow you to store each one of their students info in an array and then print it out.
public class InfiniteStudentInput {
  //Main method.
	public static void main(String[] args) {

		//Instantiate Scanner
	Scanner scanner = new Scanner (System.in);
	//Ask user how many students they want to enter. Use that response to instantiate an object array.
	System.out.println("How many students would you like to enter?");
	int num = scanner.nextInt();
	
	//Instantiate an object Array
    Student [] studentInputArray = new Student [num];
	
    //use a for loop to:
    //1.Print the questions and store the answer in local variables.
    //2.Instantiate a new object of Student.
    //3.Assign the local variables in the object.
    //4.Store the object in an array.
	for(int i = 0; i < studentInputArray.length; i++){
	System.out.println("What is your first name?");
	String firstName = scanner.nextLine();
	System.out.println("What is your last name?");
	String lastName = scanner.nextLine();
	System.out.println("Where do you go to school?");
	String school = scanner.nextLine();
	System.out.println("What is your address?");
	String address = scanner.nextLine();
	System.out.println("How old are you?");
	int age = scanner.nextInt();
	System.out.println("What grade are you in?");
	int grade = scanner.nextInt();
	System.out.println("What is your phone number?");
	String phoneNumber = scanner.nextLine();
	System.out.println("What is your birthday?");
	String birthday = scanner.nextLine();
	
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
		
		//store the object in the array.
		studentInputArray[i] = studentObject;
	}
		//I use a for loop to print the values of all the arrays.
			    for (int i=0; i<studentInputArray.length; i++) { 
			    System.out.println(studentInputArray[i].getFirstName());
			    System.out.println(studentInputArray[i].getLastName());
			    System.out.println(studentInputArray[i].getSchool());
			    System.out.println(studentInputArray[i].getAddress());
			    System.out.println(studentInputArray[i].getPhoneNumber());		    
			    System.out.println(studentInputArray[i].getBirthday());
			    System.out.println(studentInputArray[i].getAge());
			    System.out.println(studentInputArray[i].getGrade());
			    
			    }
	
	}

}
