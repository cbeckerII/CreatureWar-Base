
/**
 * Write a description of class Elf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super();
        hp = rand.nextInt(22)+1;
        strength = rand.nextInt(14)+1;
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
