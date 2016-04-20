import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   private int hp;
   private int strength;
   Random rand = new Random();
   public Creature(){
       hp = 10;
       hp = 10;
   }
    
   public int damage(){
       int damage = rand.nextInt(strength)+1;
       return damage;
    }
    
}
