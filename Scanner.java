import java.util.*;
import java.io.*;

public class Scanner{
    public static void main(String[]args){
	String job="";
	String s="";
	String d="";
	Scanner sc = new Scanner(System.in);
	System.out.println("Are you a Warrior or a Mage?");
	job=sc.nextLine();
	if (job.equals("Warrior")){
	    System.out.println("You are a Warrior.");
	    name=sc.nextLine();
	    Warrior player = new Warrior(name);
	    }
	if (job.equals("Mage")){
	    System.out.println("You are a Mage.");
	    Mage player = new Mage();
	}
	//Assuming the player does not type in an invalid class.
	//Case sensitive
	System.out.println("A knight clad in black stands in your way.");
	Warrior knight = new Warrior("bad dude");
	try {
	    Thread.sleep(1000);
	}catch(Exception e){}
	System.out.println("None shall pass, he says.");
	try {
	    Thread.sleep(1000);
	}catch(Exception e){}
	System.out.println("Do you fight him or run?(fight/run)");
	s=sc.nextLine();
	
	if (s.equals("fight")){
	    while(knight.getHealth>0){
	    System.out.println("What do you want to do?");
		//list moves here, method of class
	    
	        
		s = sc.nextLine();

	}
	if (s.equals("run")){
	    System.out.println("You run away with your tail between your legs.");
	}
	

    }
}
