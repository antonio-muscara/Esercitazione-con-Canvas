/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovalicerchi;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Antonio
 */
public class DisegnaOvaliCerchi {
    
  public static void main (String[] argv)
  {
     Frame f = new Frame("Disegno di Ovali");
     AreaOvali ao = new AreaOvali(); // creazione del componente
     f.setSize(550,200);             // dimensione del Frame
     f.setLocation(200,200);         // posizione del Frame sullo schermo
     f.add(ao);                      // aggiunta del componente
     
     //--- ascoltatore x chiudere la finestra
    f.addWindowListener(new WindowAdapter()
    {@Override
 public void windowClosing(WindowEvent e){  System.exit(0); } });
    //---- fine ascoltatore
     f.setVisible(true);
   }

}