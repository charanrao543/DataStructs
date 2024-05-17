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

public class DLinkedList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField insrear;
	private JTextField textField;
	private JTextField displaybox;
	class Node{
		Node prevlink;
		int data;
		Node nextlink;
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
					DLinkedList frame = new DLinkedList();
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
	public DLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 22));
		lblNewLabel.setBounds(89, 25, 442, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER AN ELEMENT : ");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(255, 0, 255));
		lblNewLabel_1.setBounds(29, 96, 214, 25);
		contentPane.add(lblNewLabel_1);
		
		insrear = new JTextField();
		insrear.setBounds(263, 93, 136, 30);
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
				newnode.prevlink =null;
				newnode.nextlink= null;
				JOptionPane.showMessageDialog(contentPane, "Inserted element Successfull "+elem);
				insrear.setText("");
				if(first == null) {
					first = newnode;
				}
				else {
					temp= first;
					while(temp.nextlink!=null) {
						temp= temp.nextlink;
					}
					temp.nextlink= newnode;
					newnode.prevlink = temp;
				}
			}
		});
		insertrear.setFont(new Font("Constantia", Font.BOLD, 18));
		insertrear.setForeground(new Color(0, 0, 0));
		insertrear.setBounds(427, 92, 165, 31);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT : ");
		lblNewLabel_1_1.setForeground(Color.MAGENTA);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(29, 154, 214, 25);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(263, 149, 136, 30);
		contentPane.add(textField);
		
		JButton insfront = new JButton("INSERT FRONT");
		insfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert front code
				Node temp;
				int elem = Integer.valueOf(textField.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.prevlink =null;
				newnode.nextlink= null;
				JOptionPane.showMessageDialog(contentPane, "Inserted element Successfull "+elem);
				textField.setText("");
				if(first == null) {
					first = newnode;
				}
				else {
					newnode.nextlink= first;
					first.prevlink = newnode;
					first = newnode;
					}
			}
		});
		insfront.setForeground(Color.BLACK);
		insfront.setFont(new Font("Constantia", Font.BOLD, 18));
		insfront.setBounds(417, 151, 175, 31);
		contentPane.add(insfront);
		
		JButton delrear = new JButton("DELETE REAR");
		delrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete rear code
				Node temp;
				if(first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink== null) {
					System.out.println("Deleted element is "+first.data);
					first = null;
				}
				else {
					temp = first;
					while(temp.nextlink.nextlink != null) {
						temp = temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "Deleted element is "+temp.nextlink.data);
					temp.nextlink = null;
				}
			}
		});
		delrear.setForeground(Color.BLACK);
		delrear.setFont(new Font("Constantia", Font.BOLD, 18));
		delrear.setBounds(251, 211, 175, 31);
		contentPane.add(delrear);
		
		JButton delfront = new JButton("DELETE FRONT");
		delfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete front code
				Node temp;
				if(first == null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion is not possible");
				}
				else if(first.nextlink== null) {
					JOptionPane.showMessageDialog(contentPane, "Deleted element is "+first.data);
					first = null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Deleted element is "+first.data);
					first= first.nextlink;
					first.prevlink = null;
				}
			}
		});
		delfront.setForeground(Color.BLACK);
		delfront.setFont(new Font("Constantia", Font.BOLD, 18));
		delfront.setBounds(251, 273, 175, 31);
		contentPane.add(delfront);
		
		JButton displayforw = new JButton("DISPLAY FORWARD");
		displayforw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display forward code
				String msg = "";
				Node temp;
				if(first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextlink== null) {
					msg = msg+first.data;
					
				}
				else {
					temp= first;
					while(temp != null) {
						msg = msg+" "+temp.data;
						temp= temp.nextlink;
					}
					
				}
				displaybox.setText(msg);
			}
		});
		displayforw.setForeground(Color.BLACK);
		displayforw.setFont(new Font("Constantia", Font.BOLD, 18));
		displayforw.setBounds(65, 335, 211, 31);
		contentPane.add(displayforw);
		
		JButton displayrev = new JButton("DISPLAY REVERSE");
		displayrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display reverse code
				Node temp;
				String msg = "";
				if(first == null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextlink== null) {
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else {
					temp= first;
					while(temp.nextlink != null) {
						temp = temp.nextlink;
					}
					while(temp != null) {
						msg = msg+" "+temp.data;
						temp = temp.prevlink;
					}
				}
				displaybox.setText(msg);
			}
		});
		displayrev.setForeground(Color.BLACK);
		displayrev.setFont(new Font("Constantia", Font.BOLD, 18));
		displayrev.setBounds(332, 335, 211, 31);
		contentPane.add(displayrev);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 250, 205));
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setBounds(89, 400, 442, 34);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
