import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[]args){
	String job="";
	String s="";
	String d="";
	Scanner sc = new Scanner(System.in);
	baseChar player= new baseChar();
	System.out.println("Are you a Warrior or a Mage?");
	job=sc.nextLine();
	if (job.equals("Warrior")){
	    System.out.println("You are a Warrior.");
	    System.out.println("What is your name?");
	    String name=sc.nextLine();
	    player = new Warrior(name);
	    System.out.println("You are "+player+" the warrior");
	    }
	if (job.equals("Mage")){
	    System.out.println("You are a Mage.");
	    System.out.println("What is your name?");
	    String name=sc.nextLine();
	    player = new Mage(name);
	    System.out.println("You are "+player+" the mage");
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
	    /* while((knight.getHealth)>0){
	    System.out.println("What do you want to do?");
		//list moves here, method of class
		
	        
		s = sc.nextLine(); */ 
	    //System.out.println(player+" gets ready.");
	}
	if (s.equals("run")){
	    if (player.runAway()){
	    System.out.println("You run away with your tail between your legs.");
	    }
	    else{
		System.out.println("You fail to run, fool. Fight.");
		    }
	}
	
	

    }
}
