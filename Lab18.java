import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
import edu.fcps.karel2.WorldFrame;
public class Lab18
{
public static final String[] choices = {"map1","map2","map3"};
   public static void main(String[] args)
   {
         String mapChoice = (String)JOptionPane.showInputDialog(null,"Choose an map.", "Map Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);

      Display.openWorld("maps/"+ mapChoice +".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      WorldFrame.getCurrent().setLocation(0, 0);
     
      Pirate jack = new Pirate();
      int numBeepers = 0;
      
      jack.approachPile();
      numBeepers= jack.numOfBeepersInPile();
      
      while (numBeepers != 5)
      {
         jack.turnAppropriately(numBeepers);
         jack.approachPile();
         numBeepers = jack.numOfBeepersInPile();
      }
   }



}