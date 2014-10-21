import java.util.*;
public class baseChar{
    private String name="DEFAULT";
    private int Health=30;
    private int attack=5;
    private int defense=5;
    private int dexterity=5;
    private int mana=0;
    public baseChar(String s){
    	name = s;
     }
    public baseChar(){
	name="bob";
    }
    public String toString(){
	return name;
    }
    public void attacking(baseChar other){
	//consider this basechar's attack and dexterity and the other basechar's
	// defense. range of attack damage is +-2. dexterity determines chance
	// of hit. defense negates some damage.
	Random rand = new Random();
	
	int n = rand.nextInt(5)+attack-2;
	other.changeHealth(-n);
	System.out.println(this+" attacks "+other+" for "+n);

    }
    public int getHealth(){
	return this.Health;
    }
    public void changeHealth(int value){
	this.Health = this.Health+value;
    }
    public void usePotion(){
	this.Health=this.Health+50;
    }

}


	
	
	
