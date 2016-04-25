import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class War here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class War
{
    // instance variables - replace the example below with your own
    ArrayList<Creature> Allies = new ArrayList<Creature>();
    ArrayList<Creature> Enemies = new ArrayList<Creature>();
    Random rand = new Random();
    private int dmgholder;
    private int percentage;
    private int coin;
    private int armyMax = 0;
    
    
    /**
     * Constructor for objects of class War
     */
    public War()
    {
        // initialise instance variables
        makeAllies();
        makeEnemies();
        
        Allies.trimToSize();
        Enemies.trimToSize();
        
        System.out.println("There are " + Allies.size() + " to fight for the side of good.");
        System.out.println("To fight the likes of " + Enemies.size() + " demons!");
        
        Creature Champion = Allies.get(0);
        Creature Abyssal = Enemies.get(0);
        while (Allies.size() > 1 && Enemies.size() > 1)
        {
            dmgholder = Champion.damage();
            if(Champion.getClass() == Elf.class)
            {
                percentage = rand.nextInt(100)+1;
                if (percentage <= 10)
                {
                    dmgholder = dmgholder * 2;
                    System.out.println("There's magic in the air!");
                }
            }
            Abyssal.hp -= dmgholder;
            System.out.println("The" + Champion.getClass().toString().replace("class", "") + " for the good has dealt " + dmgholder + " damage to the enemy!");
            
            if(Abyssal.getClass() == Balrog.class)
            {
                percentage = rand.nextInt(100)+1;
                dmgholder = Abyssal.damage();
                if(percentage <= 5)
                {
                    dmgholder += 50;
                }
                Champion.hp -= dmgholder;
                System.out.println("The" + Abyssal.getClass().toString().replace("class", "") +" has dealt " + dmgholder + " to the champion!");            
            }
            
            percentage = rand.nextInt(100)+1;
            dmgholder = Abyssal.damage();
            if(percentage <= 5)
            {
                dmgholder += 50;
            }
            Champion.hp -= dmgholder;
            System.out.println("The" + Abyssal.getClass().toString().replace("class", "") + " has dealt " + dmgholder + " to the champion!");
            
            if (Champion.hp <= 0)
            {
                Allies.remove(0);
                Champion = Allies.get(0);
                System.out.println("A champion has fallen!");
            }
            else if (Abyssal.hp <= 0)
            {
                Enemies.remove(0);
                Abyssal = Enemies.get(0);
                System.out.println("The enemy has fallen!");
            }
        }
        
        if (Allies.size() == 1)
        {
            System.out.println("Humanity has fallen");
        }
        else if (Enemies.size() == 1)
        {
            System.out.println("Humanity has prevailed");
        }
        else
        {
            System.out.println("ERROR");
        }
    }
    
    public int setMaxArmy()
    {
        armyMax = rand.nextInt(25) + 1;
        while (armyMax < 15)
        {
            armyMax = rand.nextInt(25)+1;
        }
        return armyMax;
    }
    
    public void makeAllies()
    {
        setMaxArmy();        
        while (Allies.size() <= armyMax){ 
            coin = rand.nextInt(2)+1;
            if (coin ==(1))
            {
                Allies.add(new Elf());
            }
                
            else if(coin ==(2))
            {
                Allies.add(new Human());
            }
        }
    }
    
    public void makeEnemies()
    {
        setMaxArmy();
        while (Enemies.size() <= armyMax){ 
            coin = rand.nextInt(2)+1;
            if (coin ==(1))
            {
                Enemies.add(new Balrog());
            }
                
            else if(coin ==(2))
            {
                Enemies.add(new CyberDemon());
            }
        }
    }
}
