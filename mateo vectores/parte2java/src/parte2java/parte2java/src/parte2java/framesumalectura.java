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

public class framesumalectura extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framesumalectura frame = new framesumalectura();
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
	public framesumalectura() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(55, 55, 55));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1_4_1_1 = new JButton("Salir");
		btnNewButton_1_4_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_4_1_1.setBorderPainted(false);
		btnNewButton_1_4_1_1.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_4_1_1.setBackground(Color.WHITE);
		btnNewButton_1_4_1_1.setAlignmentX(0.5f);
		btnNewButton_1_4_1_1.setBounds(10, 455, 140, 45);
		contentPane.add(btnNewButton_1_4_1_1);
		
		JButton btnNewButton_1_4_1 = new JButton("Inicio");
		btnNewButton_1_4_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_4_1.setBorderPainted(false);
		btnNewButton_1_4_1.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_4_1.setBackground(Color.WHITE);
		btnNewButton_1_4_1.setAlignmentX(0.5f);
		btnNewButton_1_4_1.setBounds(384, 455, 140, 45);
		contentPane.add(btnNewButton_1_4_1);
		
		JLabel lblIngreseLosNumeros = new JLabel("Ingrese los numeros de los vectores");
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
		frmtdtxtfldVn.setOpaque(false);
		frmtdtxtfldVn.setSelectedTextColor(new Color(255, 255, 255));
		frmtdtxtfldVn.setToolTipText("");
		frmtdtxtfldVn.setForeground(new Color(255, 255, 255));
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
		
		JLabel lblSeparandoLosValores = new JLabel("Separando los valores por comas (EJ: 1, 2, 3, 4, etc...)");
		lblSeparandoLosValores.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeparandoLosValores.setForeground(Color.WHITE);
		lblSeparandoLosValores.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSeparandoLosValores.setAlignmentX(0.5f);
		lblSeparandoLosValores.setBounds(20, 55, 503, 39);
		contentPane.add(lblSeparandoLosValores);
		
		JFormattedTextField frmtdtxtfldVn_1 = new JFormattedTextField();
		frmtdtxtfldVn_1.setToolTipText("");
		frmtdtxtfldVn_1.setSelectedTextColor(Color.WHITE);
		frmtdtxtfldVn_1.setOpaque(false);
		frmtdtxtfldVn_1.setForeground(Color.WHITE);
		frmtdtxtfldVn_1.setFont(new Font("Arial", Font.PLAIN, 20));
		frmtdtxtfldVn_1.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		frmtdtxtfldVn_1.setBounds(88, 260, 436, 55);
		contentPane.add(frmtdtxtfldVn_1);
		
		JLabel lblV_2 = new JLabel("v2 = (");
		lblV_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblV_2.setForeground(Color.WHITE);
		lblV_2.setFont(new Font("Arial", Font.BOLD, 22));
		lblV_2.setAlignmentX(0.5f);
		lblV_2.setBounds(20, 260, 67, 55);
		contentPane.add(lblV_2);
		
		JLabel lblSegundoVector = new JLabel("Segundo vector:");
		lblSegundoVector.setHorizontalAlignment(SwingConstants.LEFT);
		lblSegundoVector.setForeground(Color.WHITE);
		lblSegundoVector.setFont(new Font("Arial", Font.BOLD, 22));
		lblSegundoVector.setAlignmentX(0.5f);
		lblSegundoVector.setBounds(20, 210, 186, 39);
		contentPane.add(lblSegundoVector);
		
		JLabel lblAcVaEl = new JLabel("Ac\u00E1 va el resultado");
		lblAcVaEl.setHorizontalAlignment(SwingConstants.LEFT);
		lblAcVaEl.setForeground(Color.WHITE);
		lblAcVaEl.setFont(new Font("Arial", Font.PLAIN, 18));
		lblAcVaEl.setAlignmentX(0.5f);
		lblAcVaEl.setBounds(147, 383, 377, 55);
		contentPane.add(lblAcVaEl);
		
		JLabel lblIngreseLosNumeros_1 = new JLabel("Resultado:");
		lblIngreseLosNumeros_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseLosNumeros_1.setForeground(Color.WHITE);
		lblIngreseLosNumeros_1.setFont(new Font("Arial", Font.BOLD, 22));
		lblIngreseLosNumeros_1.setAlignmentX(0.5f);
		lblIngreseLosNumeros_1.setBounds(10, 383, 140, 55);
		contentPane.add(lblIngreseLosNumeros_1);
		
		JButton btnNewButton_1_4_1_2 = new JButton("Calcular");
		btnNewButton_1_4_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1_4_1_2.setBorderPainted(false);
		btnNewButton_1_4_1_2.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton_1_4_1_2.setBackground(Color.WHITE);
		btnNewButton_1_4_1_2.setAlignmentX(0.5f);
		btnNewButton_1_4_1_2.setBounds(203, 337, 140, 45);
		contentPane.add(btnNewButton_1_4_1_2);
		
	}
}
