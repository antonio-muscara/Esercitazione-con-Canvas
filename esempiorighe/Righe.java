/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempiorighe;

/**
 *
 * @author Antonio
 */
import java.awt.*;
import java.awt.event.*; 
public class Righe 
{
  public static void main (String argv[])
  {
    Frame f = new Frame("Disegno le righe ");
    AreaRighe  a = new AreaRighe ();

    f.setSize(300,200);
    f.setLocation(100,120);

    f.add(a);
    
    //--- ascoltatore x chiudere la finestra
    f.addWindowListener(new WindowAdapter()
    {@Override
 public void windowClosing(WindowEvent e){  System.exit(0); } });
    //---- fine ascoltatore
    f.setVisible(true);
  }
}
