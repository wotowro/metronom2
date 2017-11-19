package metronom;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UI extends JFrame implements ActionListener{
		
	private JButton start;
	private JButton stop;
	Metronom m = new Metronom();
	
	public UI() {
		super("Metronom");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,200);
		setLocation(100,100);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		start = new JButton("START");
		start.addActionListener(this);
		
		stop = new JButton("STOP");
		stop.addActionListener(this);
		
		add(start);
		add(stop);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();

		if(source == start) {
			//Metronom m= new Metronom();
			m.start();
			
			/*
			Metronom biegacz= new Metronom();
			Thread w = new Thread(biegacz);
			w.start();*/
			
		}
		else if(source == stop) {
			m.stopMe();
			
		}
		
	}

	
	
	
}
