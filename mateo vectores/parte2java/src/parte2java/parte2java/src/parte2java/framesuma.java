package parte2java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class framesuma extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framesuma frame = new framesuma();
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
	public framesuma() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 432);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(55, 55, 55));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseLaLongitud = new JLabel("Ingrese la longitud de los vectores");
		lblIngreseLaLongitud.setBounds(10, 11, 524, 55);
		lblIngreseLaLongitud.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblIngreseLaLongitud.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseLaLongitud.setForeground(Color.WHITE);
		lblIngreseLaLongitud.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblIngreseLaLongitud);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Arial", Font.PLAIN, 25));
		spinner.setBorder(null);
		spinner.setBackground(new Color(255, 255, 255));
		spinner.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		spinner.setBounds(48, 137, 196, 86);
		contentPane.add(spinner);
		
		JButton btnNewButton_1_4_1 = new JButton("Continuar");
		btnNewButton_1_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_1_4_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_4_1.setBorderPainted(false);
		btnNewButton_1_4_1.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_4_1.setBackground(Color.WHITE);
		btnNewButton_1_4_1.setAlignmentX(0.5f);
		btnNewButton_1_4_1.setBounds(394, 337, 140, 45);
		contentPane.add(btnNewButton_1_4_1);
		
		JLabel lblPrimerVector = new JLabel("Primer vector:");
		lblPrimerVector.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerVector.setForeground(Color.WHITE);
		lblPrimerVector.setFont(new Font("Arial", Font.BOLD, 22));
		lblPrimerVector.setAlignmentX(0.5f);
		lblPrimerVector.setBounds(10, 87, 263, 39);
		contentPane.add(lblPrimerVector);
		
		JLabel lblSegundoVector = new JLabel("Segundo vector:");
		lblSegundoVector.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundoVector.setForeground(Color.WHITE);
		lblSegundoVector.setFont(new Font("Arial", Font.BOLD, 20));
		lblSegundoVector.setAlignmentX(0.5f);
		lblSegundoVector.setBounds(271, 87, 263, 39);
		contentPane.add(lblSegundoVector);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		spinner_1.setFont(new Font("Arial", Font.PLAIN, 25));
		spinner_1.setBorder(null);
		spinner_1.setBackground(Color.WHITE);
		spinner_1.setBounds(308, 137, 196, 86);
		contentPane.add(spinner_1);
		
		JButton btnNewButton_1_4_1_1 = new JButton("Salir");
		btnNewButton_1_4_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(-1);
			}
		});
		btnNewButton_1_4_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_4_1_1.setBorderPainted(false);
		btnNewButton_1_4_1_1.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_4_1_1.setBackground(Color.WHITE);
		btnNewButton_1_4_1_1.setAlignmentX(0.5f);
		btnNewButton_1_4_1_1.setBounds(10, 337, 140, 45);
		contentPane.add(btnNewButton_1_4_1_1);
	}
}
