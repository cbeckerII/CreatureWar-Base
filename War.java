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
        while (Allies.size() <= armyMax) 
        {
            Allies.add(new Human());
        }
    }
    
    public void makeEnemies()
    {
        setMaxArmy();
        while (Enemies.size() <= armyMax)
        {
            Enemies.add(new Balrog());
        }
    }
}
