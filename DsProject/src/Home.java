import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtChooseADatastrucher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 541);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 240, 230));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtChooseADatastrucher = new JTextField();
		txtChooseADatastrucher.setForeground(new Color(199, 21, 133));
		txtChooseADatastrucher.setBackground(new Color(250, 240, 230));
		txtChooseADatastrucher.setFont(new Font("Algerian", Font.BOLD, 24));
		txtChooseADatastrucher.setText("CHOOSE A DATASTRUCTURE");
		txtChooseADatastrucher.setBounds(166, 36, 399, 28);
		contentPane.add(txtChooseADatastrucher);
		txtChooseADatastrucher.setColumns(10);
		
		JButton array = new JButton("ARRAY\r\n");
		array.setForeground(new Color(255, 165, 0));
		array.setFont(new Font("Constantia", Font.BOLD, 22));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PLACE ARRAY OPENING CODE HERE
				  //Array a = new Array();
				  //a.setVisible(true);
				  new Array().setVisible(true);
			}
		});
		array.setBounds(266, 121, 109, 37);
		contentPane.add(array);
		
		JButton btnNewButton = new JButton("STACK");
		btnNewButton.setForeground(new Color(106, 90, 205));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK OPENING CODE HERE
				new Stack().setVisible(true);
			}
		});
		btnNewButton.setBounds(76, 162, 119, 37);
		contentPane.add(btnNewButton);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE OPENING CODE HERE
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(139, 0, 0));
		queue.setFont(new Font("Constantia", Font.BOLD, 22));
		queue.setBounds(438, 173, 139, 37);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCULARQUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULAR QUEUE OPENING CODE HERE
				new Cqueue().setVisible(true);
			}
		});
		cqueue.setForeground(new Color(218, 112, 214));
		cqueue.setFont(new Font("Constantia", Font.BOLD, 22));
		cqueue.setBounds(46, 260, 259, 37);
		contentPane.add(cqueue);
		
		JButton sll = new JButton("SINGLYLINKEDLIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLYLINKEDLIST OPENING CODE HERE
				new SLinkedList().setVisible(true);
			}
		});
		sll.setForeground(new Color(139, 0, 0));
		sll.setFont(new Font("Constantia", Font.BOLD, 22));
		sll.setBounds(409, 260, 259, 37);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLYLINKEDLIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLYLINKEDLIST OPENING CODE HERE
				new DLinkedList().setVisible(true);
			}
		});
		dll.setForeground(new Color(255, 0, 255));
		dll.setFont(new Font("Constantia", Font.BOLD, 22));
		dll.setBounds(212, 369, 333, 37);
		contentPane.add(dll);
	}
}
