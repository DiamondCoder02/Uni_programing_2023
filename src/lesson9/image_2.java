package lesson9;

import java.awt.Graphics; 
import java.awt.Image; 
import java.awt.MediaTracker; 
import java.awt.Toolkit; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 

public class image_2 {
	public static void main(String[] args) { 
		Kép k = new Kép(); 
		k.kép(); 
	}
}

class Kép extends JFrame{ 
	public void kép(){ 
		setSize(Toolkit.getDefaultToolkit().getScreenSize()); 
		getContentPane().add(new Kép_be()); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
	}
} 
class Kép_be extends JPanel{ 
	private Image im; 
	public Kép_be(){ 
		MediaTracker tr = new MediaTracker(this); 
		im = Toolkit.getDefaultToolkit().getImage("image.png"); 
		tr.addImage(im, 0); 
		try{ tr.waitForID(0); } 
		catch(InterruptedException err){} 
		finally{ tr.removeImage(im, 0); }
	} 
	@Override protected void paintComponent(Graphics gr){ 
		super.paintComponent(gr);
		gr.drawImage(im, 0, 0, this);
		// gr.drawImage(im, 100, 100, 400, 400, this); 
	}
} 