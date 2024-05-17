import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField element;
	private JTextField sizefield;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(199, 21, 133));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 22));
		lblNewLabel.setBackground(new Color(173, 255, 47));
		lblNewLabel.setBounds(179, 28, 330, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE : ");
		lblNewLabel_1.setForeground(new Color(138, 43, 226));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_1.setBounds(59, 76, 190, 23);
		contentPane.add(lblNewLabel_1);
		
		element = new JTextField();
		element.setBackground(new Color(224, 255, 255));
		element.setForeground(new Color(0, 0, 0));
		element.setBounds(280, 173, 147, 24);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert code
				if(r==size-1) {
					//System.out.println("Insertion not possible");
					JOptionPane.showMessageDialog(contentPane, "Inertion not possible");
				}
				else {
					//System.out.println("Enter an element");
					//int elem = scan.nextInt();
					int elem = Integer.valueOf(element.getText());
					JOptionPane.showMessageDialog(contentPane, "Inserted element Successfull "+elem);
					element.setText("");
					
					++r;
					q[r]= elem;
				}
			}
		});
		insert.setForeground(new Color(255, 127, 80));
		insert.setFont(new Font("Constantia", Font.BOLD, 18));
		insert.setBounds(447, 173, 125, 31);
		contentPane.add(insert);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setForeground(new Color(139, 0, 139));
		lblNewLabel_2.setBounds(75, 177, 179, 23);
		contentPane.add(lblNewLabel_2);
		
		sizefield = new JTextField();
		sizefield.setForeground(new Color(0, 0, 0));
		sizefield.setColumns(10);
		sizefield.setBackground(new Color(224, 255, 255));
		sizefield.setBounds(267, 74, 204, 22);
		contentPane.add(sizefield);
		
		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create queue
				size = Integer.valueOf(sizefield.getText());
				q = new int[size];
				String message = "Queue of size "+size+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 18));
		create.setBounds(265, 118, 206, 31);
		contentPane.add(create);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete code
				if(r== -1 || f>r) {
					//System.out.println("Deletion not possible");
					JOptionPane.showMessageDialog(contentPane, "Deletion not Possible");
				}
				else {
					//System.out.println("Deleted element is "+q[f]);
					JOptionPane.showMessageDialog(contentPane, "Deleted element is "+q[f]);
					++f;
				}
			}
		});
		delete.setForeground(new Color(138, 43, 226));
		delete.setFont(new Font("Constantia", Font.BOLD, 18));
		delete.setBounds(296, 233, 131, 31);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display code
				String msg = "";
				if(r == -1 || f>r) {
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
				}
				else {
					for(int i=f;i<=r;i++) {
						msg = msg+" "+q[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(255, 105, 180));
		display.setFont(new Font("Constantia", Font.BOLD, 18));
		display.setBounds(280, 302, 147, 31);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(224, 255, 255));
		displaybox.setBounds(122, 384, 432, 31);
		contentPane.add(displaybox);
	}

}
