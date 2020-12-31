

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class tractor extends Applet implements Runnable {
	
	int i=0;
	public void init()
	{
	
		
	}
	public void start(){
		Thread t=new Thread (this);
		t.start();
	
	}
	public void run()
	{
		while(true)
		{
			repaint();
			try{
				if(i==1000)
				{
					wait();
					
					
					}
				i=i+10;
				Thread.sleep(500);
				
			}
			
			catch(InterruptedException e){
				
		}
		}
	}
	
	public void paint(Graphics g)
	{
		//line and upper structure
		g.drawLine(0, 152, 2000, 152);
		g.setColor(Color.blue);
		g.fillRect(i+20, 95,25, 30);
		g.fillRect(i+20,68,30,50);
		g.fillRect(i+60,92,60,29);
		g.fillRect(i+20,63,30,10);
	   
	
	
		//cabin
		g.setColor(Color.WHITE);
		g.fillRect(i+28,68,35,25);
		
		//wheels
		g.setColor(Color.BLACK);
		g.fillOval(i+15, 104, 50, 50);
		g.fillOval(i+90, 118,35,35);
		
		
		//horn
		g.fillRect(i+98,67,4,25);
		g.fillRect(i+98,67,10,4);
		
		//rect lines
		g.fillRect(i+110,100,10,3);
		g.fillRect(i+110,105,10,3);
		g.fillRect(i+110,110,10,3);
		
		
		//human
		g.fillOval(i+33,72,15,15);
		g.fillRect(i+37,85,8,8);
		
		
		//inner wheels
		g.setColor(	Color.WHITE);
	    g.fillOval(i+25,114,30,30);
		g.fillOval(i+96,124,23,23);
		
		
		
		
		
		
		//second truck
		g.setColor(Color.BLACK);
		g.drawLine(0, 300, 2000, 300);
		g.setColor(Color.blue);
		g.fillRect(i+20, 238,30, 30);
		g.fillRect(i+20,214,8,50);
		g.fillRect(i+20,209,30,6);
	    g.fillRect(i+60,238,60,29);
        g.setColor(Color.BLACK);
	    g.fillOval(i+15, 250, 50, 50);
		g.fillOval(i+90, 266,35,35);
	    g.fillRect(i+98,213,4,25);
		g.fillRect(i+98,212,10,4);
		g.fillRect(i+110,246,10,3);
	    g.fillRect(i+110,251,10,3);
		g.fillRect(i+110,256,10,3);
		g.fillOval(i+33,217,15,15);
		g.fillRect(i+37,230,8,8);
		g.setColor(Color.white);
		g.fillOval(i+25,260,30,30);
		g.fillOval(i+96,272,23,23);
	}
	public void destroy(){
		
	}
		
		
		
		
		
	
}   