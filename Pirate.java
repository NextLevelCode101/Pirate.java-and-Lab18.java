import edu.fcps.karel2.Display;
public class Pirate extends Athlete
{
   private int numBeepers;
      
      
   public Pirate()
   {
      super(1,1, Display.EAST,0);
      numBeepers = 0;
   }
      
      
      
      
   public void approachPile()
   {
      while(!nextToABeeper())
      {
         move();
      } 
   }
      
   public int numOfBeepersInPile()
   {
      numBeepers = 0;
      while (nextToABeeper())
      {
         pickBeeper();
         numBeepers++;
         
      }
      return numBeepers;
   }
      
      
   public void turnAppropriately(int numBeepers)
   {
      if (numBeepers == 1)
         turnLeft();
      else if (numBeepers == 2)
         turnAround();
      else if (numBeepers == 3)
         turnRight();
      else
         move();
   }
      
}