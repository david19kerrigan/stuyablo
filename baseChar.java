//number 1
import java.util.*;
public class baseChar{
    private String name="DEFAULT";
    private int Health=30;
    private int attack=5;
    private int defense=5;
    private int dexterity=5;
    private int mana=0;
    public void attacking(baseChar other){
	//consider this basechar's attack and dexterity and the other basechar's
	// defense. range of attack damage is +-2. dexterity determines chance
	// of hit. defense negates some damage.
	Random rand = new Random();
	int n = rand.nextInt(attack+2)+attack-2;
	System.out.println(n);
    }
}


	
	
	
