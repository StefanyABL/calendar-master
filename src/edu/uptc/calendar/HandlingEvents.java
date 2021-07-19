package edu.uptc.calendar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HandlingEvents implements ActionListener,  KeyListener {
	private MainWindow mainWindow;
	


	public HandlingEvents(MainWindow mainWindow) {
		super();
		this.mainWindow = mainWindow;
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char key = e.getKeyChar();
		if (key < 'a' || key> 'z'){
			if (key < 'A' || key >'Z'){
			e.consume();
		}
			
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		mainWindow.proccess();
		
	}

	

}
