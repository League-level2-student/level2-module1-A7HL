package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel pane = new JPanel();
	JButton add = new JButton("Add Name");
	JButton view = new JButton("View Names");
	
	ArrayList<String> book = new ArrayList<String>();
	

	public void run() {
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		frame.add(pane);
		
		pane.add(add);
		add.addActionListener(this);
		pane.add(view);
		view.addActionListener(this);
		
		frame.pack();
		frame.setVisible(true);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton)e.getSource();
		if(pressed.equals(add)) {
			String str = JOptionPane.showInputDialog("Enter a Name");
			book.add(str);
		}else if(pressed.equals(view)) {
			for(String s:book) {
				System.out.println(s);
			}
		}
		
	}
	
	
}
