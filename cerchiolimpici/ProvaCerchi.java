/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerchiolimpici;

/**
 *
 * @author Antonio
 */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics2D;

public class ProvaCerchi
{
    public static void main(String[] args)
    {
             
        Frame f=new Frame("Cerchi olimpici");
        Cerchi a=new Cerchi();
        f.setSize(900,500);
        f.setLocation(50,50);
        f.add(a);
        //--- ascoltatore x chiudere la finestra
         f.addWindowListener(new WindowAdapter()
         {@Override
        public void windowClosing(WindowEvent e){  System.exit(0); } });
        //---- fine ascoltatore
        f.setVisible(true);
     
    };
}



class Cerchi extends Canvas
{
    private final int ncerchi=5;
    private int x;
    private int y;
    private Graphics2D g2;
    
    
    @Override
	public void paint(Graphics g)
	{
	    int xx;
	    
	    g2=(Graphics2D) g;
	    x=10;
	    y=10;
	    for(xx=0;xx<ncerchi;xx++)
	    {
	        this.setColor(xx);
	        g2.drawOval(x,y,250,250);        
	        if ((xx % 2)==0)
	            {y=110;}
	        else{y=10;}
	        x=x+130;
	    }
	}
	
	public void setColor(int xx)
	{
	    if (xx==0){g2.setColor(Color.black);}
	    if (xx==1){g2.setColor(Color.red);}
	    if (xx==2){g2.setColor(Color.blue);}
	    if (xx==3){g2.setColor(Color.yellow);}
	    if (xx==4){g2.setColor(Color.green);} 	    
	}
}
