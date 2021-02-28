package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

	public class SNAKE_F extends JFrame
	{
		SNAKE_F()
		{
	        this.setTitle("Snake");
	        this.add(new SNAKE_P());
	        this.pack();
	        this.setResizable(false);
	        this.setVisible(true);
	        this.setLocationRelativeTo(null);
	    }
	}
