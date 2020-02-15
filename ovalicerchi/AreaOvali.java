/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovalicerchi;

/**
 *
 * @author Antonio
 */
import java.awt.*;
 
class AreaOvali extends Canvas{
  @Override
  public void paint (Graphics g)  
  { 
    // ovali vuoti e pieni    
    g.setColor(Color.red);
    g.drawOval( 10, 10, 40,120);
    g.setColor(Color.yellow);
    g.drawOval(100, 10,200,100);
    g.setColor(Color.blue);
    g.fillOval(100, 12,200,100);
    // cerchi vuoti e pieni    
    g.setColor(Color.red   );
    g.drawOval(270,   50, 40, 40);
    g.drawOval(300,   70, 30, 30);
    g.drawOval(330,  110, 20, 20);
    g.drawOval(400,   50, 80, 80);
    g.setColor(Color.yellow);
    g.fillOval(400, 50, 80, 80);
  }
}
