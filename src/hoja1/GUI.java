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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_am = new JButton("A.M.");
		btn_am.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("530");
				label.setVisible(true);
			}
		});
		btn_am.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_am.setBounds(47, 64, 89, 34);
		btn_am.setEnabled(false);
		contentPane.add(btn_am);
		
		JButton btn_fm = new JButton("F.M.");
		btn_fm.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_fm.setBounds(47, 109, 89, 34);
		btn_fm.setEnabled(false);
		contentPane.add(btn_fm);
		
		
		
	
	
		
		JButton btn_back = new JButton("<--");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String a =label.getText();
				 double b = Double.parseDouble(a);
				 if(b>530 && b<1610){
				 double c = b-10;
				 String d =  Double.toString(c);
				 label.setText(d);
				 }
				 else{
					 JOptionPane.showMessageDialog(null, "La frecuencia es muy baja");
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
				 String a =label.getText();
				 double b = Double.parseDouble(a);
				 if(b>=530 && b<1610){
				 double c = b+10;
				 String d =  Double.toString(c);
				 label.setText(d);
				 }
				 else{
					 JOptionPane.showMessageDialog(null, "La frecuencia es muy alta");
				 }
			}
		});
		btn_fwd.setBounds(353, 64, 53, 23);
		contentPane.add(btn_fwd);
		
		JButton btn_1 = new JButton("1");
		btn_1.setBounds(236, 98, 39, 23);
		btn_1.setEnabled(false);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setEnabled(false);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_2.setBounds(316, 98, 39, 23);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBounds(397, 98, 39, 23);
		btn_3.setEnabled(false);
		contentPane.add(btn_3);
		
		JButton btn_g1 = new JButton("Guardar");
		btn_g1.setBounds(219, 124, 71, 23);
		btn_g1.setEnabled(false);
		contentPane.add(btn_g1);
		
		JButton btn_g2 = new JButton("Guardar");
		btn_g2.setBounds(300, 124, 71, 23);
		btn_g2.setEnabled(false);
		contentPane.add(btn_g2);
		
		JButton btn_g3 = new JButton("Guardar");
		btn_g3.setBounds(381, 124, 71, 23);
		btn_g3.setEnabled(false);
		contentPane.add(btn_g3);
		
		JButton btn_4 = new JButton("4");
		btn_4.setBounds(236, 158, 39, 23);
		btn_4.setEnabled(false);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBounds(316, 158, 39, 23);
		btn_5.setEnabled(false);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBounds(397, 158, 39, 23);
		btn_6.setEnabled(false);
		contentPane.add(btn_6);
		
		JButton btn_g4 = new JButton("Guardar");
		btn_g4.setBounds(219, 182, 71, 23);
		btn_g4.setEnabled(false);
		contentPane.add(btn_g4);
		
		JButton btn_g5 = new JButton("Guardar");
		btn_g5.setBounds(300, 182, 71, 23);
		btn_g5.setEnabled(false);
		contentPane.add(btn_g5);
		
		JButton btn_g6 = new JButton("Guardar");
		btn_g6.setBounds(381, 182, 71, 23);
		btn_g6.setEnabled(false);
		contentPane.add(btn_g6);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBounds(236, 216, 39, 23);
		btn_7.setEnabled(false);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setBounds(316, 216, 39, 23);
		btn_8.setEnabled(false);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBounds(397, 216, 39, 23);
		btn_9.setEnabled(false);
		contentPane.add(btn_9);
		
		JButton btn_g7 = new JButton("Guardar");
		btn_g7.setBounds(219, 242, 71, 23);
		btn_g7.setEnabled(false);
		contentPane.add(btn_g7);
		
		JButton btn_g8 = new JButton("Guardar");
		btn_g8.setBounds(300, 242, 71, 23);
		btn_g8.setEnabled(false);
		contentPane.add(btn_g8);
		
		JButton btn_g9 = new JButton("Guardar");
		btn_g9.setBounds(381, 242, 71, 23);
		btn_g9.setEnabled(false);
		contentPane.add(btn_g9);
		
		JButton btn_10 = new JButton("10");
		btn_10.setBounds(230, 271, 45, 23);
		btn_10.setEnabled(false);
		contentPane.add(btn_10);
		
		JButton btn_11 = new JButton("11");
		btn_11.setBounds(310, 271, 45, 23);
		btn_11.setEnabled(false);
		contentPane.add(btn_11);
		
		JButton btn_12 = new JButton("12");
		btn_12.setBounds(397, 271, 45, 23);
		btn_12.setEnabled(false);
		contentPane.add(btn_12);
		
		JButton btn_g10 = new JButton("Guardar");
		btn_g10.setBounds(219, 297, 71, 23);
		btn_g10.setEnabled(false);
		contentPane.add(btn_g10);
		
		JButton btn_g11 = new JButton("Guardar");
		btn_g11.setBounds(300, 297, 71, 23);
		btn_g11.setEnabled(false);
		contentPane.add(btn_g11);
		
		JButton btn_g12 = new JButton("Guardar");
		btn_g12.setBounds(381, 297, 71, 23);
		btn_g12.setEnabled(false);
		contentPane.add(btn_g12);
		
		label = new JLabel("0.00");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(300, 11, 71, 42);
		label.setVisible(false);
		contentPane.add(label);
		
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
			}
			
		});
		btn_on.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_on.setBounds(31, 158, 53, 23);
		contentPane.add(btn_on);
		
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
			}
		});
	}
}
