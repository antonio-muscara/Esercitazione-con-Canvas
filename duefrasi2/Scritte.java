/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duefrasi2;

/**
 *
 * @author Antonio
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class AreaTesto extends Canvas 
{
   @Override
   public void paint(Graphics g)    
   {
        g.setFont(new Font("Times New Roman", Font.BOLD, 16));
        g.setColor(Color.red);
        g.drawString("prima scritta", 50, 20);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.blue);
        g.drawString("seconda scritta", 10, 60);
   }
}

public class Scritte
{
  public static void main (String[] argv)
  {
     Frame f = new Frame("Oggetto con due scritte ");
     AreaTesto at = new AreaTesto(); // creazione del componente
     f.setSize(300,150);            // dimensione del Frame
     f.setLocation(200,200);        // posizione del Frame sullo schermo
     f.add(at);                     // aggiunta del componente
     
     //--- ascoltatore x chiudere la finestra
    f.addWindowListener(new WindowAdapter()
    {@Override
 public void windowClosing(WindowEvent e){  System.exit(0); } });
    //---- fine ascoltatore
     f.setVisible(true);
   }

}