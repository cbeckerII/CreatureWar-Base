
/**
 * Write a description of class Demon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super();
    }
    
    public int damage()
    {
        if (rand.nextInt(100)+1 <=5)
        {
            int damage = ((rand.nextInt(strength)+1)+50);
            return damage;
        }
        else
        {
            int damage = (rand.nextInt(strength)+1);
            return damage;
        }
    }
}
