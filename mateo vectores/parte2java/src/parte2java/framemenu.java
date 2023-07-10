package parte2java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * sum
 * rest
 * multi
 * escal
 * vect
 * */

public class framemenu extends JFrame {
	
	suma sum = new suma();
	resta rest = new resta();
	multiplicacion multi = new multiplicacion();
	escalar escal = new escalar();
	vectorial vect = new vectorial();
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framemenu frame = new framemenu();
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
	public framemenu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 432);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(55, 55, 55));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Suma");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				sum.setVisible(true);
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1.setBounds(20, 55, 513, 36);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u00BFQu\u00E9 operaci\u00F3n desea realizar?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBounds(20, 8, 513, 36);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1_1 = new JButton("Resta");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rest.setVisible(true);
				
			}
		});
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_1.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1.setAlignmentX(0.5f);
		btnNewButton_1_1.setBounds(20, 102, 513, 36);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Multiplicaci\u00F3n por escalar");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				multi.setVisible(true);
				
			}
		});
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_2.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_2.setBackground(new Color(255, 255, 255));
		btnNewButton_1_2.setAlignmentX(0.5f);
		btnNewButton_1_2.setBounds(20, 149, 513, 36);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Producto escalar");
		btnNewButton_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				escal.setVisible(true);
				
			}
		});
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_3.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_3.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3.setAlignmentX(0.5f);
		btnNewButton_1_3.setBounds(20, 196, 513, 36);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Producto vectorial");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vect.setVisible(true);
				
			}
		});
		btnNewButton_1_4.setBorderPainted(false);
		btnNewButton_1_4.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_4.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_4.setBackground(new Color(255, 255, 255));
		btnNewButton_1_4.setAlignmentX(0.5f);
		btnNewButton_1_4.setBounds(20, 243, 513, 36);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_4_1 = new JButton("Salir");
		btnNewButton_1_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(-1);
			}
		});
		btnNewButton_1_4_1.setBorderPainted(false);
		btnNewButton_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_4_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_4_1.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_4_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_4_1.setAlignmentX(0.5f);
		btnNewButton_1_4_1.setBounds(418, 345, 115, 36);
		contentPane.add(btnNewButton_1_4_1);
		
		JButton btnNewButton_1_4_1_1 = new JButton("Volver");
		btnNewButton_1_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1_4_1_1.setBorderPainted(false);
		btnNewButton_1_4_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_4_1_1.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_4_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_4_1_1.setAlignmentX(0.5f);
		btnNewButton_1_4_1_1.setBounds(20, 345, 115, 36);
		contentPane.add(btnNewButton_1_4_1_1);
	}
}
