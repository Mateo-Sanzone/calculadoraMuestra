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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.util.*;

public class multiplicacion extends JFrame {
	
	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					multiplicacion frame = new multiplicacion();
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
	public multiplicacion() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(55, 55, 55));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1_4_1 = new JButton("Continuar");
		btnNewButton_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
			}
		});
		
		btnNewButton_1_4_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_4_1.setBorderPainted(false);
		btnNewButton_1_4_1.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_4_1.setBackground(Color.WHITE);
		btnNewButton_1_4_1.setAlignmentX(0.5f);
		btnNewButton_1_4_1.setBounds(394, 325, 140, 45);
		contentPane.add(btnNewButton_1_4_1);
	
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
		btnNewButton_1_4_1_1.setBounds(10, 325, 140, 45);
		contentPane.add(btnNewButton_1_4_1_1);
		
		JLabel lblSeparandoLosValores = new JLabel("Separando los valores por espacios (EJ: 1 2 3 4 etc...)");
		lblSeparandoLosValores.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeparandoLosValores.setForeground(Color.WHITE);
		lblSeparandoLosValores.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSeparandoLosValores.setAlignmentX(0.5f);
		lblSeparandoLosValores.setBounds(20, 46, 503, 30);
		contentPane.add(lblSeparandoLosValores);
		
		JLabel lblIngreseLosValores = new JLabel("Ingrese los valores de los vectores:");
		lblIngreseLosValores.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseLosValores.setForeground(Color.WHITE);
		lblIngreseLosValores.setFont(new Font("Arial", Font.BOLD, 25));
		lblIngreseLosValores.setAlignmentX(0.5f);
		lblIngreseLosValores.setBounds(10, 11, 524, 39);
		contentPane.add(lblIngreseLosValores);
		
		JFormattedTextField frmtdtxtfldVn = new JFormattedTextField();
		frmtdtxtfldVn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		frmtdtxtfldVn.setToolTipText("");
		frmtdtxtfldVn.setSelectedTextColor(Color.WHITE);
		frmtdtxtfldVn.setForeground(new Color(0, 0, 0));
		frmtdtxtfldVn.setFont(new Font("Arial", Font.PLAIN, 20));
		frmtdtxtfldVn.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		frmtdtxtfldVn.setBounds(79, 121, 445, 39);
		contentPane.add(frmtdtxtfldVn);
		
		JLabel lblV = new JLabel("v1 = (");
		lblV.setHorizontalAlignment(SwingConstants.LEFT);
		lblV.setForeground(Color.WHITE);
		lblV.setFont(new Font("Arial", Font.BOLD, 20));
		lblV.setAlignmentX(0.5f);
		lblV.setBounds(11, 121, 67, 39);
		contentPane.add(lblV);
		
		JLabel lblPrimerVector_1 = new JLabel("Primer vector:");
		lblPrimerVector_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrimerVector_1.setForeground(Color.WHITE);
		lblPrimerVector_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblPrimerVector_1.setAlignmentX(0.5f);
		lblPrimerVector_1.setBounds(11, 87, 151, 30);
		contentPane.add(lblPrimerVector_1);
		
		JLabel lblPrimerVector_1_1 = new JLabel("N\u00FAmero escalar: ");
		lblPrimerVector_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrimerVector_1_1.setForeground(Color.WHITE);
		lblPrimerVector_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblPrimerVector_1_1.setAlignmentX(0.5f);
		lblPrimerVector_1_1.setBounds(10, 171, 151, 30);
		contentPane.add(lblPrimerVector_1_1);
		
		JLabel lblIngreseLosNumeros_1 = new JLabel("Resultado:");
		lblIngreseLosNumeros_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseLosNumeros_1.setForeground(Color.WHITE);
		lblIngreseLosNumeros_1.setFont(new Font("Arial", Font.BOLD, 22));
		lblIngreseLosNumeros_1.setAlignmentX(0.5f);
		lblIngreseLosNumeros_1.setBounds(10, 262, 140, 55);
		contentPane.add(lblIngreseLosNumeros_1);
		
		JLabel lblAcVaEl = new JLabel("");
		lblAcVaEl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblAcVaEl.setHorizontalAlignment(SwingConstants.LEFT);
		lblAcVaEl.setForeground(Color.WHITE);
		lblAcVaEl.setFont(new Font("Arial", Font.PLAIN, 18));
		lblAcVaEl.setAlignmentX(0.5f);
		lblAcVaEl.setBounds(207, 262, 317, 55);
		contentPane.add(lblAcVaEl);
		
		JLabel lblV_1_1 = new JLabel("v1 = (");
		lblV_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblV_1_1.setForeground(Color.WHITE);
		lblV_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblV_1_1.setAlignmentX(0.5f);
		lblV_1_1.setBounds(149, 262, 62, 55);
		contentPane.add(lblV_1_1);
		
		JFormattedTextField frmtdtxtfldVn_1 = new JFormattedTextField();
		frmtdtxtfldVn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
			}
		});
		frmtdtxtfldVn_1.setToolTipText("");
		frmtdtxtfldVn_1.setSelectedTextColor(Color.WHITE);
		frmtdtxtfldVn_1.setForeground(new Color(0, 0, 0));
		frmtdtxtfldVn_1.setFont(new Font("Arial", Font.PLAIN, 20));
		frmtdtxtfldVn_1.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		frmtdtxtfldVn_1.setBounds(79, 204, 445, 39);
		contentPane.add(frmtdtxtfldVn_1);
		
		JButton btnNewButton_1_4_1_1_1 = new JButton("Volver");
		btnNewButton_1_4_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1_4_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_4_1_1_1.setBorderPainted(false);
		btnNewButton_1_4_1_1_1.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_4_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_4_1_1_1.setAlignmentX(0.5f);
		btnNewButton_1_4_1_1_1.setBounds(203, 325, 140, 45);
		contentPane.add(btnNewButton_1_4_1_1_1);
		
		btnNewButton_1_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// MULTIPLICACION
				
				// Reseteo
				// Vaciar cajas texto
				
				// variables
				String valor1 = frmtdtxtfldVn.getText();
				String valor2 = frmtdtxtfldVn_1.getText();
				
				if(valor2.length() > 2) {
					
					lblAcVaEl.setText("ERROR: Ingrese solo un escalar )");
					
				} else {
					// Procedimiento

			        // Dividir los números ingresados en cadenas separadas por espacios en blanco
			        String[] numeros1 = valor1.split(" ");

			        // Determinar la longitud del resultado
			        int longitudResultado = numeros1.length;

			        // Crear los vectores para almacenar los números
			        int[] vector1 = new int[longitudResultado];

			        // Convertir los números ingresados a enteros y almacenarlos en los vectores
			        for (int i = 0; i < numeros1.length; i++) {
			            vector1[i] = Integer.parseInt(numeros1[i]);
			        }
			        
			        int escalar = Integer.parseInt(valor2); 

			        // Multiplicar los elementos de los vectores
			        int[] resultado = new int[longitudResultado];
			        
			        for (int i = 0; i < longitudResultado; i++) {
			            resultado[i] = vector1[i] * escalar;
			        }

			        // Convertir el resultado a una cadena
			        StringBuilder sb = new StringBuilder();
			        for (int i = 0; i < resultado.length; i++) {
			            sb.append(resultado[i]).append(" ");
			        }
			        String resultadoString = sb.toString().trim();

			        // Mostrar el resultado en el JTextField
			        lblAcVaEl.setText(resultadoString + " )");
			        
				     // RESETEO
				        // Reiniciar los vectores y resultado
				        valor1 = null;
				        valor2 = null;
				        resultado = null;
				}

				
			}
		});
	}
}
