package Main;

import java.awt.EventQueue;

import Controller.Controller;
import View.view;

public class main {
	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() { 
				try { 
					view window = new view();
					Controller c= new Controller(window);
						window.frame.setVisible(true);
				} catch (Exception e) { 
					e.printStackTrace(); } 
				} 
			}
		);
	} 
}
