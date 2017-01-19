package hoja1;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

public class GUI extends JFrame {

	private JPanel contentPane;
	private Radio radio;
	private JLabel label;
	
	/**
	 * frequency es usado para saber si esta en am o fm la radio, es muy importante para saber si se mueve 10 unidades o 0.2
	 */
	private int frequency;
	
	/**
	 * las variables a-d son utilizadas para manejar el tag que muestra la estacion ya que usamos conversiones
	 * de double a string y de string a double
	 */
	private String a;
	private String d;
	private double b;
	private double c;
	
	/**
	 * Primero al guardar una estacion  frequency1 hasta frequency12 guarda si la estacion guardada es am o fm
	 * Al llamar a la estacion guardada, esto le indica a frequency si es am o fm 
	 * Esto es sumamente importante porque si se pasa de AM a FM por medio de una estacion guardada, esto previene
	 * que haya problemas porque no se ha cambiado la frequency y por lo tanto podria pasar que 
	 * en AM se mueva 0.2 unidades en vez de 10
	 */
	private int frequency1;
	private int frequency2;
	private int frequency3;
	private int frequency4;
	private int frequency5;
	private int frequency6;
	private int frequency7;
	private int frequency8;
	private int frequency9;
	private int frequency10;
	private int frequency11;
	private int frequency12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
				
					
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
	
	public GUI() {
		Radio radio;
		radio = new Radio();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		 * el botom am maneja 530 a 1610 y el FM 87.9 a 107 y algo
		 */
		JButton btn_am = new JButton("A.M.");
		btn_am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("530");
				label.setVisible(true);
				frequency = 1;
			}
		});
		btn_am.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_am.setBounds(47, 64, 89, 34);
		btn_am.setEnabled(false);
		contentPane.add(btn_am);
		
		JButton btn_fm = new JButton("F.M.");
		btn_fm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("87.9");
				label.setVisible(true);
				frequency = 2;
			}
		});
		btn_fm.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_fm.setBounds(47, 109, 89, 34);
		btn_fm.setEnabled(false);
		contentPane.add(btn_fm);
		
		
		
	
	
		/**
		 * el botom back y forward son encargados de mover la estacion, tienen medidas para que no se salga de la frecuencia 
		 * permitida, si se trata sale un mensaje
		 */
		JButton btn_back = new JButton("<--");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 a =label.getText();
				 b = Double.parseDouble(a);
				if (frequency ==1 && b>530 && b<1610){
					
					 c = b-10;
					 d =  Double.toString(c);
					 label.setText(d);
				}
				else if(frequency ==2 && b>87.9 && b<107.9){
					c = b-0.2;
					 d =  Double.toString(c);
					 label.setText(d);
				}
				else{
					JOptionPane.showMessageDialog(null, "La frecuencia esta muy baja");
				}
				
				 
				 
				
			}
		});
		btn_back.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_back.setBounds(268, 64, 53, 23);
		btn_back.setEnabled(false);
		contentPane.add(btn_back);
		
		JButton btn_fwd = new JButton("-->");
		btn_fwd.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_fwd.setEnabled(false);
		btn_fwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 a =label.getText();
				 b = Double.parseDouble(a);
				if (frequency ==1 &&  b<1610){
					
					 c = b+10;
					 d =  Double.toString(c);
					 label.setText(d);
				}
				else if(frequency ==2 && b<107.9){
					c = b+0.2;
					 d =  Double.toString(c);
					 label.setText(d);
				}
				else{
					JOptionPane.showMessageDialog(null, "La frecuencia esta muy alta");
				}
			}
		});
		btn_fwd.setBounds(353, 64, 53, 23);
		contentPane.add(btn_fwd);
		
		/**
		 * Del boton 1 al 12 se llama a getBotonX y se inscribe el numero en el tag que muestra la estacion
		 * La frecuencia se iguala a la de la estacion guardada para evitar problemas de cambios entre AM y FM
		 */
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Radio)radio).getBoton1()!=0.0){
					String a = Double.toString(((Radio)radio).getBoton1());
					label.setText(a);
					frequency = frequency1;
				
					
				}
				else{
					JOptionPane.showMessageDialog(null, "No ha guardado una estacion");
				}
			}
		});
		btn_1.setBounds(200, 98, 54, 23);
		btn_1.setEnabled(false);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setEnabled(false);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Radio)radio).getBoton2()!=0.0){
					String a = Double.toString(((Radio)radio).getBoton2());
					label.setText(a);
					frequency = frequency2;
					
				}
				else{
					JOptionPane.showMessageDialog(null, "No ha guardado una estacion");
				}
			}
		});
		btn_2.setBounds(303, 98, 55, 23);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Radio)radio).getBoton3()!=0.0){
					String a = Double.toString(((Radio)radio).getBoton3());
					label.setText(a);
					frequency = frequency3;
					
				}
				else{
					JOptionPane.showMessageDialog(null, "No ha guardado una estacion");
				}
			}
		});
		btn_3.setBounds(397, 98, 55, 23);
		btn_3.setEnabled(false);
		contentPane.add(btn_3);
		
		/**
		 * Aqui se guarda la estacion y en la variable frequencyX se guarda si era am o fm para que se pueda hacer cambios AM,FM
		 */
		
		JButton btn_g1 = new JButton("Guardar");
		btn_g1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Radio)radio).setBoton1(Double.parseDouble(label.getText()));
				a = label.getText();
				 b = Double.parseDouble(a);
				 if(b>109.7){
					 frequency1 =1;
				 }
				 else{
					 frequency1 =2;
				 }
			}
		});
		btn_g1.setBounds(185, 124, 88, 23);
		btn_g1.setEnabled(false);
		contentPane.add(btn_g1);
		
		JButton btn_g2 = new JButton("Guardar");
		btn_g2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Radio)radio).setBoton2(Double.parseDouble(label.getText()));
				a = label.getText();
				 b = Double.parseDouble(a);
				 if(b>109.7){
					 frequency2 =1;
				 }
				 else{
					 frequency2 =2;
				 }
			}
		});
		btn_g2.setBounds(283, 124, 88, 23);
		btn_g2.setEnabled(false);
		contentPane.add(btn_g2);
		
		JButton btn_g3 = new JButton("Guardar");
		btn_g3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Radio)radio).setBoton3(Double.parseDouble(label.getText()));
				a = label.getText();
				 b = Double.parseDouble(a);
				 if(b>109.7){
					 frequency3 =1;
				 }
				 else{
					 frequency3 =2;
				 }
			}
		});
		btn_g3.setBounds(380, 124, 89, 23);
		btn_g3.setEnabled(false);
		contentPane.add(btn_g3);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Radio)radio).getBoton4()!=0.0){
					String a = Double.toString(((Radio)radio).getBoton4());
					label.setText(a);
					frequency = frequency4;
					
				}
				else{
					JOptionPane.showMessageDialog(null, "No ha guardado una estacion");
				}
			}
		});
		btn_4.setBounds(200, 158, 54, 23);
		btn_4.setEnabled(false);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Radio)radio).getBoton5()!=0.0){
					String a = Double.toString(((Radio)radio).getBoton5());
					label.setText(a);
					frequency = frequency5;
					
				}
				else{
					JOptionPane.showMessageDialog(null, "No ha guardado una estacion");
				}
			}
		});
		btn_5.setBounds(303, 158, 55, 23);
		btn_5.setEnabled(false);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Radio)radio).getBoton6()!=0.0){
					String a = Double.toString(((Radio)radio).getBoton6());
					label.setText(a);
					frequency = frequency6;
				
					
				}
				else{
					JOptionPane.showMessageDialog(null, "No ha guardado una estacion");
				}
			}
		});
		btn_6.setBounds(397, 158, 55, 23);
		btn_6.setEnabled(false);
		contentPane.add(btn_6);
		
		JButton btn_g4 = new JButton("Guardar");
		btn_g4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Radio)radio).setBoton4(Double.parseDouble(label.getText()));
				a = label.getText();
				 b = Double.parseDouble(a);
				 if(b>109.7){
					 frequency4 =1;
				 }
				 else{
					 frequency4 =2;
				 }
			}
		});
		btn_g4.setBounds(185, 182, 88, 23);
		btn_g4.setEnabled(false);
		contentPane.add(btn_g4);
		
		JButton btn_g5 = new JButton("Guardar");
		btn_g5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Radio)radio).setBoton5(Double.parseDouble(label.getText()));
				a = label.getText();
				 b = Double.parseDouble(a);
				 if(b>109.7){
					 frequency5 =1;
				 }
				 else{
					 frequency5 =2;
				 }
			}
		});
		btn_g5.setBounds(283, 182, 88, 23);
		btn_g5.setEnabled(false);
		contentPane.add(btn_g5);
		
		JButton btn_g6 = new JButton("Guardar");
		btn_g6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Radio)radio).setBoton6(Double.parseDouble(label.getText()));
				a = label.getText();
				 b = Double.parseDouble(a);
				 if(b>109.7){
					 frequency6 =1;
				 }
				 else{
					 frequency6 =2;
				 }
			}
		});
		btn_g6.setBounds(381, 182, 88, 23);
		btn_g6.setEnabled(false);
		contentPane.add(btn_g6);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Radio)radio).getBoton7()!=0.0){
					String a = Double.toString(((Radio)radio).getBoton7());
					label.setText(a);
					frequency = frequency7;
				
					
				}
				else{
					JOptionPane.showMessageDialog(null, "No ha guardado una estacion");
				}
			}
		});
		btn_7.setBounds(200, 216, 54, 23);
		btn_7.setEnabled(false);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Radio)radio).getBoton8()!=0.0){
					String a = Double.toString(((Radio)radio).getBoton8());
					label.setText(a);
					frequency = frequency8;
					
				}
				else{
					JOptionPane.showMessageDialog(null, "No ha guardado una estacion");
				}
			}
		});
		btn_8.setBounds(303, 216, 55, 23);
		btn_8.setEnabled(false);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Radio)radio).getBoton9()!=0.0){
					String a = Double.toString(((Radio)radio).getBoton9());
					label.setText(a);
					frequency = frequency9;
					
				}
				else{
					JOptionPane.showMessageDialog(null, "No ha guardado una estacion");
				}
			}
		});
		btn_9.setBounds(397, 216, 55, 23);
		btn_9.setEnabled(false);
		contentPane.add(btn_9);
		
		JButton btn_g7 = new JButton("Guardar");
		btn_g7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Radio)radio).setBoton7(Double.parseDouble(label.getText()));
				a = label.getText();
				 b = Double.parseDouble(a);
				 if(b>109.7){
					 frequency7 =1;
				 }
				 else{
					 frequency7 =2;
				 }
			}
		});
		btn_g7.setBounds(185, 242, 88, 23);
		btn_g7.setEnabled(false);
		contentPane.add(btn_g7);
		
		JButton btn_g8 = new JButton("Guardar");
		btn_g8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Radio)radio).setBoton8(Double.parseDouble(label.getText()));
				a = label.getText();
				 b = Double.parseDouble(a);
				 if(b>109.7){
					 frequency8 =1;
				 }
				 else{
					 frequency8 =2;
				 }
			}
		});
		btn_g8.setBounds(283, 242, 88, 23);
		btn_g8.setEnabled(false);
		contentPane.add(btn_g8);
		
		JButton btn_g9 = new JButton("Guardar");
		btn_g9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Radio)radio).setBoton9(Double.parseDouble(label.getText()));
				a = label.getText();
				 b = Double.parseDouble(a);
				 if(b>109.7){
					 frequency9 =1;
				 }
				 else{
					 frequency9 =2;
				 }
			}
		});
		btn_g9.setBounds(381, 242, 88, 23);
		btn_g9.setEnabled(false);
		contentPane.add(btn_g9);
		
		JButton btn_10 = new JButton("10");
		btn_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Radio)radio).getBoton10()!=0.0){
					String a = Double.toString(((Radio)radio).getBoton10());
					label.setText(a);
					frequency = frequency10;
					
				}
				else{
					JOptionPane.showMessageDialog(null, "No ha guardado una estacion");
				}
			}
		});
		btn_10.setBounds(200, 271, 54, 23);
		btn_10.setEnabled(false);
		contentPane.add(btn_10);
		
		JButton btn_11 = new JButton("11");
		btn_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Radio)radio).getBoton11()!=0.0){
					String a = Double.toString(((Radio)radio).getBoton11());
					label.setText(a);
					frequency = frequency11;
					
				}
				else{
					JOptionPane.showMessageDialog(null, "No ha guardado una estacion");
				}
			}
		});
		btn_11.setBounds(303, 271, 55, 23);
		btn_11.setEnabled(false);
		contentPane.add(btn_11);
		
		JButton btn_12 = new JButton("12");
		btn_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Radio)radio).getBoton12()!=0.0){
					String a = Double.toString(((Radio)radio).getBoton12());
					label.setText(a);
					frequency = frequency12;
					
				}
				else{
					JOptionPane.showMessageDialog(null, "No ha guardado una estacion");
				}
			}
		});
		btn_12.setBounds(397, 271, 55, 23);
		btn_12.setEnabled(false);
		contentPane.add(btn_12);
		
		JButton btn_g10 = new JButton("Guardar");
		btn_g10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Radio)radio).setBoton10(Double.parseDouble(label.getText()));
				a = label.getText();
				 b = Double.parseDouble(a);
				 if(b>109.7){
					 frequency10 =1;
				 }
				 else{
					 frequency10 =2;
				 }
			}
		});
		btn_g10.setBounds(185, 297, 88, 23);
		btn_g10.setEnabled(false);
		contentPane.add(btn_g10);
		
		JButton btn_g11 = new JButton("Guardar");
		btn_g11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Radio)radio).setBoton11(Double.parseDouble(label.getText()));
				a = label.getText();
				 b = Double.parseDouble(a);
				 if(b>109.7){
					 frequency11 =1;
				 }
				 else{
					 frequency11 =2;
				 }
			}
		});
		btn_g11.setBounds(283, 297, 88, 23);
		btn_g11.setEnabled(false);
		contentPane.add(btn_g11);
		
		JButton btn_g12 = new JButton("Guardar");
		btn_g12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Radio)radio).setBoton12(Double.parseDouble(label.getText()));
				a = label.getText();
				 b = Double.parseDouble(a);
				 if(b>109.7){
					 frequency12 =1;
				 }
				 else{
					 frequency12 =2;
				 }
			}
		});
		btn_g12.setBounds(381, 297, 88, 23);
		btn_g12.setEnabled(false);
		contentPane.add(btn_g12);
		
		/**
		 * el label muestra la estacion actual
		 */
		
		label = new JLabel("0.00");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(268, 11, 152, 42);
		label.setVisible(false);
		contentPane.add(label);
		
		/**
		 * Inicialmente no estan habilitados los botones para simular el off, al apachar el boton on se vuelven disponibles 
		 * el estado se cambia a on para el atributo de la radio
		 */
		
		JButton btn_on = new JButton("ON");
		btn_on.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				btn_1.setEnabled(true);
				btn_2.setEnabled(true);
				btn_3.setEnabled(true);
				btn_4.setEnabled(true);
				btn_5.setEnabled(true);
				btn_6.setEnabled(true);
				btn_7.setEnabled(true);
				btn_8.setEnabled(true);
				btn_9.setEnabled(true);
				btn_10.setEnabled(true);
				btn_11.setEnabled(true);
				btn_12.setEnabled(true);
				btn_am.setEnabled(true);
				btn_fm.setEnabled(true);
				btn_fwd.setEnabled(true);
				btn_back.setEnabled(true);
				btn_g1.setEnabled(true);
				btn_g2.setEnabled(true);
				btn_g3.setEnabled(true);
				btn_g4.setEnabled(true);
				btn_g5.setEnabled(true);
				btn_g6.setEnabled(true);
				btn_g7.setEnabled(true);
				btn_g8.setEnabled(true);
				btn_g9.setEnabled(true);
				btn_g10.setEnabled(true);
				btn_g11.setEnabled(true);
				btn_g12.setEnabled(true);
				boolean a = true;
				((Radio)radio).cambiar(a);
			}
			
		});
		btn_on.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_on.setBounds(31, 158, 53, 23);
		contentPane.add(btn_on);
		
		/**
		 * el boton off hace que los botones no esten disponibles
		 */
		JButton btn_off = new JButton("OFF");
		btn_off.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_off.setBounds(94, 158, 64, 23);
		contentPane.add(btn_off);
		btn_off.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_1.setEnabled(false);
				btn_2.setEnabled(false);
				btn_3.setEnabled(false);
				btn_4.setEnabled(false);
				btn_5.setEnabled(false);
				btn_6.setEnabled(false);
				btn_7.setEnabled(false);
				btn_8.setEnabled(false);
				btn_9.setEnabled(false);
				btn_10.setEnabled(false);
				btn_11.setEnabled(false);
				btn_12.setEnabled(false);
				btn_am.setEnabled(false);
				btn_fm.setEnabled(false);
				btn_fwd.setEnabled(false);
				btn_back.setEnabled(false);
				btn_g1.setEnabled(false);
				btn_g2.setEnabled(false);
				btn_g3.setEnabled(false);
				btn_g4.setEnabled(false);
				btn_g5.setEnabled(false);
				btn_g6.setEnabled(false);
				btn_g7.setEnabled(false);
				btn_g8.setEnabled(false);
				btn_g9.setEnabled(false);
				btn_g10.setEnabled(false);
				btn_g11.setEnabled(false);
				btn_g12.setEnabled(false);
				label.setVisible(false);
			}
		});
	}
}
