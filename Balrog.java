
/**
 * Write a description of class Balrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
       super();
        hp = rand.nextInt(35)+1;
        strength = rand.nextInt(25)+1;
        while (hp < 5)
        {
            hp = rand.nextInt(28)+1;
        }
        while (strength < 5)
        {
            strength = rand.nextInt(16)+1;
        }
    }
}
