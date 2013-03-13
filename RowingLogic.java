//There are different kinds of boats that have different names
//depending on the number of seats and the number of oars that
//each person has. Each kind of boat has a unique coded
//abbreviation that can be used as a variable.

//In Sweep rowing, each rower has one oar.
//In sculling each rower has two oars.
//Each boat may also have a coxswain (the person who steers) or not.

//This program is designed to ask the user (the rower),
//a series of questions and determine the type of boat they are in.

//Access System.out
import java.util.Scanner;

//Define class
public class RowingLogic{

//Begin execution
public static void main (String[]args){

//Declarations

Scanner in = new Scanner(System.in);

int oars;
int rowers;
String coxswain;

//Prompt User
        System.out.println("How many oars are in your hand?");
                 oars = in.nextInt();
        System.out.println("How many rowers are in your boat?");
                 rowers = in.nextInt();
        System.out.println("Do you have a Coxswain?");
                 coxswain = in.next();

        if( oars == 1){

                if( rowers == 2 ){
                        if( "yes".equals(coxswain) ){
                                System.out.println("There are no coxed pairs!");
                        }
                        else if( "no".equals(coxswain) ){
                                System.out.println("You are in a Pair, 2-");
                        }
                        else{
                                System.out.println("Nope");
                        }
   	}
                else if( rowers == 4 ){
                        if( "yes".equals(coxswain) ){
                                System.out.println("You are in a Four with, 4+");
                        }
                        else if( "no".equals(coxswain) ){
                                System.out.println("You are in a Straight Four, 4-");
                        }
                        else{
                                System.out.println("Nope");
                        }
                }
                else if( rowers == 8 ){
                        if( "yes".equals(coxswain) ){
                                System.out.println("You are in an Eight, 8+");
                        }
                        else if( "no".equals(coxswain) ){
                                System.out.println("Eight rowers and no coxswain? Yikes!");
                        }

                        else{
                                System.out.println("Nope");
                        }
                }
                else{
                                System.out.println("Nope");
                }
        }
        else if( oars == 2){

                if( rowers == 1 ){
                        if( "yes".equals(coxswain) ){
                                System.out.println("A coxed single? Sucks to be you!");
                        }
                        else if( "no".equals(coxswain) ){
                                System.out.println("You are in a Single, 1x");
                        }
                        else{
                                System.out.println("Nope");
                        }
                }
                else if( rowers == 2 ){
                        if( "yes".equals(coxswain) ){
                                System.out.println("A coxed double? No way!");
                        }
                        else if( "no".equals(coxswain) ){
                                System.out.println("You are in a Double, 2x");
                        }
                        else{
                                System.out.println("Nope");
 }
                }
                else if( rowers == 4 ){
                        if( "yes".equals(coxswain)  ){
                                System.out.println("You are in a Quad with, 4x+");
                        }
                        else if( "no".equals(coxswain) ){
                                System.out.println("You are in a Quad without, 4x-");
                        }
                        else{
                                System.out.println("Nope");
                        }

                }
                else if( rowers == 8 ){
                        if( "yes".equals(coxswain) ){
                                System.out.println("You are in an Oc, 8x+");
                        }
                        else if( "no".equals(coxswain) ){
                                System.out.println("OMG Who's steering this thing?! Ahhhhhh!");
                        }
                        else{
                                System.out.println("Nope");
                        }
                }
                else{
                                System.out.println("Nope");
                }
        }
        else{
                                System.out.println("How many hands do you have?");
        }
}
}
                                

