import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deletepos;
	private JTextField insertpos;
	private JTextField displaybox;
	private int arr [];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setBounds(127, 10, 320, 31);
		lblNewLabel.setForeground(new Color(100, 149, 237));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 23));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH : ");
		lblNewLabel_1.setBounds(62, 66, 242, 25);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 20));
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(347, 65, 137, 26);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for creating array
				//String len = length.getText();
				//int l = Integer.valueOf(len);
				int len = Integer.valueOf(length.getText());
				int[] arr = new int[len];
				String message = "Array of length "+len+"Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setBounds(227, 124, 169, 31);
		create.setForeground(new Color(139, 0, 0));
		create.setFont(new Font("Constantia", Font.BOLD, 18));
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setBounds(10, 181, 158, 20);
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 16));
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(179, 179, 91, 26);
		element.setFont(new Font("Constantia", Font.BOLD, 12));
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insert
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(insertpos.getText());
				arr[pos] = elem;
				String message = "Element"+elem+"Inserted @ Position"+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertpos.setText("");
				
			}
		});
		insert.setBounds(515, 179, 99, 31);
		insert.setForeground(new Color(34, 139, 34));
		insert.setFont(new Font("Constantia", Font.BOLD, 18));
		contentPane.add(insert);
		
		JButton btnNewButton = new JButton("Position");
		btnNewButton.setBounds(279, 179, 107, 31);
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 18));
		contentPane.add(btnNewButton);
		
		deletepos = new JTextField();
		deletepos.setBounds(244, 246, 112, 26);
		contentPane.add(deletepos);
		deletepos.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Delete Position");
		btnNewButton_1.setBounds(39, 244, 169, 31);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 18));
		contentPane.add(btnNewButton_1);
		
		insertpos = new JTextField();
		insertpos.setBounds(407, 179, 85, 24);
		contentPane.add(insertpos);
		insertpos.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for deletion
				int pos = Integer.valueOf(deletepos.getText());
				arr[pos]= 0;
				String message = "Element deleted @ the position"+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deletepos.setText("");
			}
		});
		btnNewButton_2.setForeground(new Color(50, 205, 50));
		btnNewButton_2.setFont(new Font("Constantia", Font.PLAIN, 18));
		btnNewButton_2.setBounds(407, 253, 112, 31);
		contentPane.add(btnNewButton_2);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for display
				String msg ="";
				for(int i=0;i<arr.length;i++)
				{
					msg = msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(107, 142, 35));
		display.setFont(new Font("Constantia", Font.PLAIN, 18));
		display.setBounds(236, 314, 107, 31);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(245, 245, 220));
		displaybox.setBounds(96, 366, 448, 31);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}


}
