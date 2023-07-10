package parte2java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	framemenu menuvectores = new framemenu(); 
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setResizable(false);
		setTitle("Pendejo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(55, 55, 55));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Operaciones con numeros naturales");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//OperacionesBasicas frame = new OperacionesBasicas();
				//frame.setVisible(true);
				//dispose();
			}
			
			
		});
		
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton.setBounds(10, 116, 514, 68);
		contentPane.add(btnNewButton);
		
		JButton btnOperacionesCon = new JButton("Operaciones con vectores");
		btnOperacionesCon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuvectores.setVisible(true);
				
			}
		});
		btnOperacionesCon.setBackground(new Color(255, 255, 255));
		btnOperacionesCon.setBorder(null);
		btnOperacionesCon.setFont(new Font("Arial", Font.PLAIN, 24));
		btnOperacionesCon.setBounds(10, 195, 514, 68);
		contentPane.add(btnOperacionesCon);
		
		JButton btnOperacionesConMatrices = new JButton("Operaciones con matrices");
		btnOperacionesConMatrices.setBackground(new Color(255, 255, 255));
		btnOperacionesConMatrices.setBorder(null);
		btnOperacionesConMatrices.setFont(new Font("Arial", Font.PLAIN, 24));
		btnOperacionesConMatrices.setBounds(10, 274, 514, 68);
		contentPane.add(btnOperacionesConMatrices);
		
		JButton btnOperacionesConSistemas = new JButton("Operaciones con sistemas de ecuaciones");
		btnOperacionesConSistemas.setBackground(new Color(255, 255, 255));
		btnOperacionesConSistemas.setBorder(null);
		btnOperacionesConSistemas.setFont(new Font("Arial", Font.PLAIN, 24));
		btnOperacionesConSistemas.setBounds(10, 353, 514, 68);
		contentPane.add(btnOperacionesConSistemas);
		
		JButton btnSalirDeLa = new JButton("Salir");
		btnSalirDeLa.setBackground(new Color(255, 255, 255));
		btnSalirDeLa.setBorder(null);
		btnSalirDeLa.setFont(new Font("Arial", Font.PLAIN, 24));
		btnSalirDeLa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(-1);
			}
		});
		btnSalirDeLa.setBounds(10, 432, 514, 68);
		contentPane.add(btnSalirDeLa);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a la calculadora :)");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 514, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Por favor no rompa nada ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 48, 514, 34);
		contentPane.add(lblNewLabel_1);
	}
}
