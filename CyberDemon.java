
/**
 * Write a description of class CyberDemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
        super();
        hp = rand.nextInt(35)+1;
        strength = rand.nextInt(25)+1;
        while (hp < 5)
        {
            hp = rand.nextInt(22)+1;
        }
        while (strength < 5)
        {
            strength = rand.nextInt(14)+1;
        }
    }
}
