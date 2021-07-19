package edu.uptc.calendar;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class MainWindow extends JFrame{
	
	private HandlingEvents handling;
	private PanelDates panelDates;
	private PanelDown panelDown;
	private MainWindow mainWindow;
	public MainWindow (){
		setTitle ("Ejemplo");
		setSize (380,320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new BorderLayout());
		
		
		
	}
	
	public void begin (){
		beginComponents();
		addComponents();
		
	}
	private void beginComponents (){
//		name = new JTextField();
//		name.addKeyListener (mainWindow.getHandling());
//		SpinnerModel model = new SpinnerNumberModel();
		handling = new HandlingEvents(this);
		panelDates = new PanelDates(this);
		panelDown = new PanelDown(this);
		
		
	}
	private void addComponents (){
		add (panelDates, BorderLayout.CENTER);
		add(panelDown,BorderLayout.SOUTH);
		
		
	}
	
	public void  proccess (){
		
		
	}
	public HandlingEvents getHandlingEvents (){
		return null;
	}
}
