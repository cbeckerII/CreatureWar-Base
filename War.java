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
    Random rand = new Random(21202);
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
        
        doWar();
    }
    
    public void doWar()    
    {    
        Creature Champion = Allies.get(0);
        Creature Abyssal = Enemies.get(0);
        while (Allies.size() > 1 && Enemies.size() > 1)
        {
            dmgholder = Champion.damage();
            Abyssal.hp -= dmgholder;
            System.out.println("The" + Champion.getClass().toString().replace("class", "") + " for the good has dealt " + dmgholder + " damage to the enemy!");
            
            if (Abyssal.hp <= 0)
            {
                System.out.println("The" + Abyssal.getClass().toString().replace("class", "") + " has fallen!");
                Enemies.remove(0);
                Enemies.trimToSize();
                System.out.println(Enemies.size() + " enemies remain!");
                Abyssal = Enemies.get(0);
            }
            
            if (Abyssal.getClass() == Balrog.class)
            {
                dmgholder = Abyssal.damage();
                Champion.hp -= dmgholder;
                System.out.println("The" + Abyssal.getClass().toString().replace("class", "") + " has dealt " + dmgholder + " to the champion!");
            }
            
            if (Champion.hp <=0)
            {
                System.out.println("The" + Champion.getClass().toString().replace("class", "") + " has fallen!");
                Allies.remove(0);
                Allies.trimToSize();
                System.out.println(Allies.size() + " allies remain!");
                Champion = Allies.get(0);
            }
            dmgholder = Abyssal.damage();
            Champion.hp -= dmgholder;
            System.out.println("The" + Abyssal.getClass().toString().replace("class", "") + " has dealt " + dmgholder + " to the champion!");
            if (Champion.hp <=0)
            {
                System.out.println("The" + Champion.getClass().toString().replace("class", "") + " has fallen!");
                Allies.remove(0);
                Allies.trimToSize();
                System.out.println(Allies.size() + " allies remain!");
                Champion = Allies.get(0);
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
        while (Allies.size() <= (armyMax+25)){ 
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
