import java.util.*;
public class Warrior extends baseChar{
    //private String name = "DEFAULT";
    private int Health=35;
    private int attack=10;
    private int defense=4;
    private int dexterity=2;
    public Warrior(String name){
    	super(name);
    }
     public Boolean runAway(){
	//0-9
	Random a = new Random();
	int chance=a.nextInt(10);
	if (chance<dexterity){
	    return true;
		}
	else 
	    return false;
    }
    
}
