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
/*
* 
* disegno di righe parallele

*/

import java.awt.*;

class AreaRighe extends Canvas 
{
  @Override
  public void paint(Graphics g)
  {
     g.setColor(Color.blue);
 	 g.drawString("Linee parallele e incrociate", 10, 10);
     for (int i=1; i<=5; i++)
	 {
	     g.setColor(Color.red);
	     // g.setColor(new Color (0,0,0));
	     g.drawLine(50,100+10*i,200, 20+10*i);
	     g.setColor(Color.blue);
	     g.drawLine(50,100-10*i,200, 100+10*i);
	 }
 }
}