package project;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SNAKE extends JFrame 
{
	SNAKE()
	{
		    this.setTitle("Snake");
	        this.add(new SNAKE_P());
	        this.pack();
	        this.setResizable(false);
	        this.setVisible(true);
	        this.setLocationRelativeTo(null);
	}
	
    public static void main(String[] args)
	{
		new SNAKE();
	}

}