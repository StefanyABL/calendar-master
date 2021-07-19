package edu.uptc.calendar;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class PanelDown extends JPanel{
	private JButton btnSend ;
	private MainWindow mainWindow  ;
	public PanelDown(MainWindow mainWindow ){
		this.mainWindow = mainWindow;
		setLayout(new GridLayout(1, 1));
		btnSend= new JButton("enviar");
		btnSend.addActionListener(mainWindow.getHandlingEvents());
		add(btnSend);
	}

}
