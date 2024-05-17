import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setBounds(115, 20, 249, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE :");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1.setForeground(new Color(139, 69, 19));
		lblNewLabel_1.setBounds(37, 61, 154, 17);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(221, 59, 96, 19);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton stack = new JButton("CREATE STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// stack creation code
				size = Integer.valueOf(sizefield.getText());
				s = new int[size];
				String message = "Stack of size "+size+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
				
				
			}
		});
		stack.setFont(new Font("Constantia", Font.BOLD, 13));
		stack.setForeground(new Color(0, 0, 205));
		stack.setBounds(163, 93, 154, 25);
		contentPane.add(stack);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_2.setForeground(new Color(105, 105, 105));
		lblNewLabel_2.setBounds(55, 139, 135, 17);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(200, 136, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// push code
				if(top == size-1) {
					//System.out.println("Push not possible");
					JOptionPane.showMessageDialog(contentPane, "Push not Possible");
				}
				else {
					int elem = Integer.valueOf(element.getText());
					++top;
					s[top]= elem;
					JOptionPane.showMessageDialog(contentPane, "Push Successfull");
					element.setText("");
					
				}
			}
		});
		push.setForeground(new Color(50, 205, 50));
		push.setFont(new Font("Constantia", Font.BOLD, 13));
		push.setBounds(322, 135, 85, 25);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pop code
				if(top == -1) {
					//System.out.println("pop not possible");
					JOptionPane.showMessageDialog(contentPane, "Pop not Possible");
					
				}
				else {
					//System.out.println("Element deleted is "+s[top]);
					String message = "Element deleted is "+s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
					
				}

			}
		});
		pop.setForeground(new Color(255, 20, 147));
		pop.setFont(new Font("Constantia", Font.BOLD, 13));
		pop.setBounds(200, 170, 85, 21);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display code
				String msg = "";
				if(top ==-1) {
					//System.out.println("display not possible");
					JOptionPane.showMessageDialog(contentPane, "display not possible");
				}
				else {
					for(int i=top;i>=0;i--) {
						//System.out.println(s[i]);
						msg = msg+" "+s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(0, 191, 255));
		display.setFont(new Font("Constantia", Font.BOLD, 13));
		display.setBounds(163, 201, 133, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(173, 216, 230));
		displaybox.setBounds(55, 236, 334, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
