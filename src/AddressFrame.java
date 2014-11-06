import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.DefaultListModel;



public class AddressFrame extends JFrame implements ActionListener {
	
	static AddressBook abook = new AddressBook("Address Book");
	static AddressFrame a;
	static JLabel text;
	static JMenuBar menuBar;
	static JMenu buddyMenu, bookMenu, fileMenu;
	static JMenuItem addBuddy,saveList, newList, removeBuddy, editBuddy;
	static JList<BuddyInfo> list;
	static DefaultListModel<BuddyInfo> model;
	
	
	public AddressFrame(String s){
		this.setLayout(new BorderLayout());
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final ArrayList<AddressBook> alist= new ArrayList<AddressBook>();
		alist.add(abook);
		
		//System.out.println(buddy.getInfo());
		
		//Create the menu bar.
		menuBar = new JMenuBar();

		//Build the first menu.
		fileMenu = new JMenu("File Options");
		fileMenu.getAccessibleContext().setAccessibleDescription("Accessing AddressBook Saving");
		menuBar.add(fileMenu);
		
		bookMenu = new JMenu("Address Book Options");
		bookMenu.getAccessibleContext().setAccessibleDescription("AddressBook Operations");
		menuBar.add(bookMenu);
		
		buddyMenu = new JMenu("Buddy Options");
		buddyMenu.getAccessibleContext().setAccessibleDescription("Buddy Operations");
		menuBar.add(buddyMenu);

		addBuddy = new JMenuItem("Add Buddy");
		addBuddy.getAccessibleContext().setAccessibleDescription("Adds a Buddy to the list");
		bookMenu.add(addBuddy);

		saveList = new JMenuItem("Save Address Book");
		saveList.getAccessibleContext().setAccessibleDescription("Saves the address book");
		fileMenu.add(saveList);

		newList = new JMenuItem("New Address Book");
		newList.getAccessibleContext().setAccessibleDescription("Makes a new address book");
		fileMenu.add(newList);
		
		removeBuddy = new JMenuItem("Remove Buddy");
		removeBuddy.getAccessibleContext().setAccessibleDescription("Deletes the buddy");
		buddyMenu.add(removeBuddy);
		
		editBuddy = new JMenuItem("Edit Buddy");
		editBuddy.getAccessibleContext().setAccessibleDescription("Edit the buddy");
		buddyMenu.add(editBuddy);
		
		a= new AddressFrame(abook.getName());
		model = new DefaultListModel<BuddyInfo>();
		list= new JList<BuddyInfo>(model);
		text = new JLabel("Welcome to the Book List");
		a.setJMenuBar(menuBar);

		newList.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			alist.add(abook);
			String s1 = (String) JOptionPane.showInputDialog("Please Enter Name Of the Address Book: ");
			abook.setName(s1);
			AddressBook a = new AddressBook(s1);
			text.setText("Created Address Book: " + s1);
		}
		});
		addBuddy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = (String) JOptionPane.showInputDialog("Please Enter a Name: ");
				String s2 = (String) JOptionPane.showInputDialog("Please Enter an Address: ");
				String s3 = (String) JOptionPane.showInputDialog("Please Enter a Phone Number: ");
				
				BuddyInfo buddy = new BuddyInfo(s1,s2,s3);
				abook.addBuddy(buddy);
				model.addElement(buddy);
				text.setText("Buddy Added");
			}
		});
		saveList.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				abook.export(alist);
				text.setText("Address Book Saved");
			}
		});
		editBuddy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedValue() != null){
					String s1 = (String) JOptionPane.showInputDialog("Please Enter a new Name: ");
					String s2 = (String) JOptionPane.showInputDialog("Please Enter a new Address: ");
					String s3 = (String) JOptionPane.showInputDialog("Please Enter a new Phone Number: ");
					abook.editBuddy(list.getSelectedValue(), s1, s2, s3);
					text.setText("Eddy Budited");
				}
				else
					text.setText("404, Buddy not Selected");
			}
		});
		removeBuddy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedValue() != null){
				abook.removeBuddy(list.getSelectedValue());
				model.remove(list.getSelectedIndex());
				text.setText("Bye Bye Buddy");
				}
				else
					text.setText("404, Buddy not Selected");
			}
		});
		a.add(list,BorderLayout.SOUTH);
		a.add(text,BorderLayout.NORTH);
		a.setVisible(true);
		
		String testy = "Bob~101 DROP TABLES~123-456-790";
		BuddyInfo buddytest = new BuddyInfo("","","");
		buddytest = buddytest.buddyImport(testy);
		abook.addBuddy(buddytest);
		model.addElement(buddytest);
		
		}
		
		
}
	
	
	







