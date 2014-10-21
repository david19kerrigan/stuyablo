import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[]args){
	String job="";
	String s="";
	String d="";
	Scanner sc = new Scanner(System.in);
	System.out.println("Are you a Warrior or a Mage?");
	job=sc.nextLine();
	if (job.equals("Warrior")){
	    System.out.println("You are a Warrior.");
	    }
	if (job.equals("Mage")){
	    System.out.println("You are a Mage.");
	}
	//Assuming the player does not type in an invalid class.
	//Case sensitive
	System.out.println("A knight clad in black stands in your way.");
	s=sc.nextLine();
	System.out.println("None shall pass, he says.");
	d=sc.nextLine();
	System.out.println("I move for no man, says the knight.");

    }
}
