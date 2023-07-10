package parte2java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vectorial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vectorial frame = new vectorial();
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
	public vectorial() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(55, 55, 55));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btnNewButton_1_4_1_1.setBounds(10, 455, 140, 45);
		contentPane.add(btnNewButton_1_4_1_1);
		
		JButton btnNewButton_1_4_1 = new JButton("Continuar");
		
		btnNewButton_1_4_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_4_1.setBorderPainted(false);
		btnNewButton_1_4_1.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_4_1.setBackground(Color.WHITE);
		btnNewButton_1_4_1.setAlignmentX(0.5f);
		btnNewButton_1_4_1.setBounds(384, 455, 140, 45);
		contentPane.add(btnNewButton_1_4_1);
		
		JLabel lblIngreseLosNumeros = new JLabel("Ingrese los n\u00FAmeros a operar");
		lblIngreseLosNumeros.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseLosNumeros.setForeground(Color.WHITE);
		lblIngreseLosNumeros.setFont(new Font("Arial", Font.BOLD, 27));
		lblIngreseLosNumeros.setAlignmentX(0.5f);
		lblIngreseLosNumeros.setBounds(10, 11, 514, 55);
		contentPane.add(lblIngreseLosNumeros);
		
		JLabel lblPrimerVector = new JLabel("Primer vector:");
		lblPrimerVector.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblPrimerVector.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrimerVector.setForeground(Color.WHITE);
		lblPrimerVector.setFont(new Font("Arial", Font.BOLD, 22));
		lblPrimerVector.setBounds(20, 94, 151, 39);
		contentPane.add(lblPrimerVector);
		
		JFormattedTextField frmtdtxtfldVn = new JFormattedTextField();
		frmtdtxtfldVn.setSelectedTextColor(new Color(255, 255, 255));
		frmtdtxtfldVn.setToolTipText("");
		frmtdtxtfldVn.setForeground(new Color(0, 0, 0));
		frmtdtxtfldVn.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		frmtdtxtfldVn.setFont(new Font("Arial", Font.PLAIN, 20));
		frmtdtxtfldVn.setBounds(88, 144, 436, 55);
		contentPane.add(frmtdtxtfldVn);
		
		JLabel lblV = new JLabel("v1 = (");
		lblV.setHorizontalAlignment(SwingConstants.LEFT);
		lblV.setForeground(Color.WHITE);
		lblV.setFont(new Font("Arial", Font.BOLD, 22));
		lblV.setAlignmentX(0.5f);
		lblV.setBounds(20, 144, 67, 55);
		contentPane.add(lblV);
		
		JLabel lblSeparandoLosValores = new JLabel("Separando los valores por espacios (EJ: 1 2 3 4 etc...)");
		lblSeparandoLosValores.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeparandoLosValores.setForeground(Color.WHITE);
		lblSeparandoLosValores.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSeparandoLosValores.setAlignmentX(0.5f);
		lblSeparandoLosValores.setBounds(20, 55, 503, 39);
		contentPane.add(lblSeparandoLosValores);
		
		JFormattedTextField frmtdtxtfldVn_1 = new JFormattedTextField();
		frmtdtxtfldVn_1.setToolTipText("");
		frmtdtxtfldVn_1.setSelectedTextColor(Color.WHITE);
		frmtdtxtfldVn_1.setForeground(new Color(0, 0, 0));
		frmtdtxtfldVn_1.setFont(new Font("Arial", Font.PLAIN, 20));
		frmtdtxtfldVn_1.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		frmtdtxtfldVn_1.setBounds(88, 260, 436, 55);
		contentPane.add(frmtdtxtfldVn_1);
		
		JLabel lblSegundoVector = new JLabel("Segundo vector:");
		lblSegundoVector.setHorizontalAlignment(SwingConstants.LEFT);
		lblSegundoVector.setForeground(Color.WHITE);
		lblSegundoVector.setFont(new Font("Arial", Font.BOLD, 22));
		lblSegundoVector.setAlignmentX(0.5f);
		lblSegundoVector.setBounds(20, 210, 176, 39);
		contentPane.add(lblSegundoVector);
		
		JLabel lblAcVaEl = new JLabel("R = (");
		lblAcVaEl.setHorizontalAlignment(SwingConstants.LEFT);
		lblAcVaEl.setForeground(Color.WHITE);
		lblAcVaEl.setFont(new Font("Arial", Font.PLAIN, 18));
		lblAcVaEl.setAlignmentX(0.5f);
		lblAcVaEl.setBounds(147, 364, 45, 55);
		contentPane.add(lblAcVaEl);
		
		JLabel lblIngreseLosNumeros_1 = new JLabel("Resultado:");
		lblIngreseLosNumeros_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseLosNumeros_1.setForeground(Color.WHITE);
		lblIngreseLosNumeros_1.setFont(new Font("Arial", Font.BOLD, 22));
		lblIngreseLosNumeros_1.setAlignmentX(0.5f);
		lblIngreseLosNumeros_1.setBounds(10, 364, 140, 55);
		contentPane.add(lblIngreseLosNumeros_1);
		
		JLabel lblV_2 = new JLabel("v2 = (");
		lblV_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblV_2.setForeground(Color.WHITE);
		lblV_2.setFont(new Font("Arial", Font.BOLD, 22));
		lblV_2.setAlignmentX(0.5f);
		lblV_2.setBounds(20, 260, 67, 55);
		contentPane.add(lblV_2);
		
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
		btnNewButton_1_4_1_1_1.setBounds(198, 455, 140, 45);
		contentPane.add(btnNewButton_1_4_1_1_1);
		
		JLabel lblAcVaEl_1 = new JLabel("");
		lblAcVaEl_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblAcVaEl_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblAcVaEl_1.setForeground(Color.WHITE);
		lblAcVaEl_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblAcVaEl_1.setAlignmentX(0.5f);
		lblAcVaEl_1.setBounds(194, 364, 330, 55);
		contentPane.add(lblAcVaEl_1);
		
		btnNewButton_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Producto Vectorial
				// Reseteo
				
				// variables
				String valor1 = frmtdtxtfldVn.getText();
				String valor2 = frmtdtxtfldVn_1.getText();

				// Procedimiento

		        // Dividir los números ingresados en cadenas separadas por espacios en blanco
		        String[] numeros1 = valor1.split(" ");
		        String[] numeros2 = valor2.split(" ");

		        // Determinar la longitud del resultado
		        int longitudResultado = Math.max(numeros1.length, numeros2.length);

		        // Crear los vectores para almacenar los números
		        int[] vector1 = new int[longitudResultado];
		        int[] vector2 = new int[longitudResultado];

		        // Convertir los números ingresados a enteros y almacenarlos en los vectores
		        for (int i = 0; i < numeros1.length; i++) {
		            vector1[i] = Integer.parseInt(numeros1[i]);
		        }

		        for (int i = 0; i < numeros2.length; i++) {
		            vector2[i] = Integer.parseInt(numeros2[i]);
		        }
		        
		        //Comprobación
		        if(numeros1.length != 3 || numeros2.length != 3) {
		        	
		        	lblAcVaEl_1.setText("ERROR: Ingrese 3 valores válidos )");
		        	
		        } else {
		        	// Producto vectorial
			        int[] resultado = new int[longitudResultado];
			        
			        resultado[0] = (vector1[1] * vector2[2]) - (vector1[2] * vector2[1]);
			    	resultado[1] = (vector1[2] * vector2[0]) - (vector1[0] * vector2[2]);
			    	resultado[2] = (vector1[0] * vector2[1]) - (vector1[1] * vector2[0]);

			        // Convertir el resultado a una cadena
			        StringBuilder sb = new StringBuilder();
			        for (int i = 0; i < resultado.length; i++) {
			            sb.append(resultado[i]).append(" ");
			        }
			        String resultadoString = sb.toString().trim();

			        // Mostrar el resultado en el JTextField
			        lblAcVaEl_1.setText(resultadoString + " )");
			        
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
