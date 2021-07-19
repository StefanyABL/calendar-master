package edu.uptc.calendar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import com.toedter.calendar.JCalendar;

public class PanelDates extends JPanel {
	private JTextField name ;
	private JSpinner child;
	private JRadioButton btnMale ;
	private JRadioButton btnFemale ;
	private JCalendar birthay;
	private JComboBox state;
	private MainWindow mainWindow;
	private ButtonGroup button;
	
	
	
	
	
	
	public PanelDates(MainWindow mainWindow ){
		this.mainWindow= mainWindow;
		setLayout(new GridLayout(5, 2));
		beginComponents ();
		addComponents();
		
	}
	
	
	

	private void beginComponents (){
		name = new JTextField();
		name.addKeyListener(mainWindow.getHandlingEvents());
		SpinnerModel model = new SpinnerNumberModel (1,1,10,1);
		child = new JSpinner(model);
		button = new ButtonGroup();
		btnMale = new JRadioButton("M", true);
		btnFemale = new JRadioButton("F", false);
		button.add(btnMale);
		button.add(btnFemale);
		birthay = new JCalendar();
		String [] states = new String [] {"solter@", "casad@"}	;	
		state = new JComboBox(states);
		
		
	}
	private void addComponents (){
		add (new JLabel("nombre"));
		add(name);
		add(new JLabel("fecha de nacimiento"));
		add (child);
		add (new JLabel("Genero"));
		JPanel panelGender = new JPanel();
		panelGender.setLayout(new FlowLayout());
		panelGender.add(btnMale);
		panelGender.add(btnFemale);
		add (panelGender);
		add(new JLabel("estado civil"));
		add(state);
		
		
	}
	

}
