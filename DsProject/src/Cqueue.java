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

public class Cqueue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0; 
	private int count =0;
	private Scanner scan = new Scanner(System.in);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cqueue frame = new Cqueue();
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
	public Cqueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 483);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		lblNewLabel.setBounds(100, 10, 466, 30);
		lblNewLabel.setBackground(new Color(0, 250, 154));
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 25));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel_1.setBounds(40, 65, 200, 25);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBackground(new Color(240, 248, 255));
		sizefield.setBounds(278, 67, 200, 19);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton queue = new JButton("CREATE QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create queue
				size = Integer.valueOf(sizefield.getText());
				cq = new int [size];
				JOptionPane.showMessageDialog(contentPane, "Queue of size "+size+" Created");
			}
		});
		queue.setFont(new Font("Constantia", Font.BOLD, 20));
		queue.setForeground(new Color(210, 105, 30));
		queue.setBounds(218, 111, 209, 33);
		contentPane.add(queue);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT : ");
		lblNewLabel_2.setForeground(new Color(100, 149, 237));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel_2.setBounds(53, 186, 223, 25);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(278, 186, 120, 21);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert element code
				int elem;
				if(count==size) {
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				else {
					elem = Integer.valueOf(element.getText());
					JOptionPane.showMessageDialog(contentPane, "Inserted element Successfull "+elem);
					r = (r+1)%size;
					cq[r]= elem;
					count++;
					//JOptionPane.showMessageDialog(contentPane, "Inserted element Successfull "+);
				}
				element.setText("");
			}
		});
		insert.setForeground(new Color(153, 50, 204));
		insert.setFont(new Font("Constantia", Font.BOLD, 20));
		insert.setBounds(447, 182, 119, 33);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete code
				if(count== 0) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Deleted element is "+cq[f]);
					f = (f+1)%size;
					count--;
				}
			}
		});
		delete.setForeground(new Color(153, 50, 204));
		delete.setFont(new Font("Constantia", Font.BOLD, 20));
		delete.setBounds(290, 241, 137, 33);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display code
				int f1 = f;
				if(count ==0) {
					JOptionPane.showMessageDialog(contentPane, "Display  not possible");
				}
				else {
					String msg = "";
					for(int i=1;i<=count;i++) {
						msg = msg+" "+cq[f1];
						f1= (f1+1)%size;
					}
					//System.out.println();
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(153, 50, 204));
		display.setFont(new Font("Constantia", Font.BOLD, 20));
		display.setBounds(278, 296, 166, 33);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setBounds(121, 357, 401, 30);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
