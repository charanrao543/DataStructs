import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class SLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField insrear;
	private JTextField insfront;
	private JTextField displaybox;
	class Node{
		Node link;
		int data;
	}
	private Node first;
	private Scanner scan = new Scanner(System.in);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SLinkedList frame = new SLinkedList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 22));
		lblNewLabel.setBounds(99, 25, 413, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT : ");
		lblNewLabel_1.setForeground(new Color(255, 0, 255));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel_1.setBounds(33, 93, 214, 25);
		contentPane.add(lblNewLabel_1);
		
		insrear = new JTextField();
		insrear.setBounds(271, 89, 140, 25);
		contentPane.add(insrear);
		insrear.setColumns(10);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert rear code
				Node temp;
				int elem = Integer.valueOf(insrear.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.link =null;
				JOptionPane.showMessageDialog(contentPane, "Inserted element Successfull "+elem);
				insrear.setText("");
				if(first == null) {
					first = newnode;
				}
				else {
					temp=first;
					while(temp.link!=null) {
						temp = temp.link;
					}
					temp.link =newnode;
				}
			}
		});
		insertrear.setFont(new Font("Constantia", Font.BOLD, 18));
		insertrear.setBounds(433, 89, 165, 33);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT : ");
		lblNewLabel_1_1.setForeground(Color.MAGENTA);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(33, 166, 214, 25);
		contentPane.add(lblNewLabel_1_1);
		
		insfront = new JTextField();
		insfront.setColumns(10);
		insfront.setBounds(271, 166, 140, 25);
		contentPane.add(insfront);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert front code
				//System.out.println("Enter an element");
				int elem = Integer.valueOf(insfront.getText());
				
				Node newnode = new Node();
				newnode.data=elem;
				newnode.link =null;
				JOptionPane.showMessageDialog(contentPane, "Inserted element Successfull "+elem);
				insfront.setText("");
				if(first == null) {
					first = newnode;
				}
				else {
					newnode.link= first;
					first = newnode;
					}
			}
		});
		insertfront.setFont(new Font("Constantia", Font.BOLD, 18));
		insertfront.setBounds(433, 167, 182, 31);
		contentPane.add(insertfront);
		
		JButton delrear = new JButton("DELETE REAR");
		delrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete rear code
				Node temp;
				if(first == null){
					//System.out.println("Deletion not possible");
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null) {
					//System.out.println("Element deleted is "+first.data);
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first = null;
				}
				else {
					temp=first;
					while(temp.link.link !=null) {
						temp = temp.link;
					}
					//System.out.println("Element deleted is "+temp.link.data);
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+temp.link.data);
					temp.link= null;
				}
			}
		});
		delrear.setFont(new Font("Constantia", Font.BOLD, 18));
		delrear.setBounds(259, 225, 167, 31);
		contentPane.add(delrear);
		
		JButton delfront = new JButton("DELETE FRONT");
		delfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete front code
				if(first == null) {
					JOptionPane.showMessageDialog(contentPane,"Deletion not possibe");
				}
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first = null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					first = first.link;
				}
			}
		});
		delfront.setFont(new Font("Constantia", Font.BOLD, 18));
		delfront.setBounds(259, 289, 190, 31);
		contentPane.add(delfront);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display code
				String msg = "";
				Node temp;
				if(first == null) {
					//System.out.println();
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.link==null) {
					//System.out.println(first.data);
					msg = msg + first.data;
				}
				else {
					temp = first;
					while(temp!=null) {
						//System.out.print(temp.data+" ");
						msg = msg +" "+ temp.data;
						temp= temp.link;
					}
					//System.out.println();
				}
				displaybox.setText(msg);
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 18));
		display.setBounds(259, 343, 167, 31);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 250, 205));
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setBounds(127, 408, 404, 30);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
