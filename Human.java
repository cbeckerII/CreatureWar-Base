
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        super();
        hp = rand.nextInt(30)+1;
        strength = rand.nextInt(18)+1;
        while (hp < 5)
        {
            hp = rand.nextInt(30)+1;
        }
        while (strength < 5)
        {
            strength = rand.nextInt(18)+1;
        }
    }
    
}
