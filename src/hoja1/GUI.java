import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class GUI extends JFrame {

	private JPanel contentPane;

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
		btn_am.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_am.setBounds(47, 64, 89, 34);
		contentPane.add(btn_am);
		
		JButton btn_fm = new JButton("F.M.");
		btn_fm.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_fm.setBounds(47, 109, 89, 34);
		contentPane.add(btn_fm);
		
		JButton btn_on = new JButton("ON");
		btn_on.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_on.setBounds(31, 158, 53, 23);
		contentPane.add(btn_on);
		
		JButton btn_off = new JButton("OFF");
		btn_off.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_off.setBounds(94, 158, 53, 23);
		contentPane.add(btn_off);
		
		JButton btn_back = new JButton("<--");
		btn_back.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_back.setBounds(268, 64, 53, 23);
		contentPane.add(btn_back);
		
		JButton btn_fwd = new JButton("-->");
		btn_fwd.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_fwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_fwd.setBounds(353, 64, 53, 23);
		contentPane.add(btn_fwd);
		
		JButton btn_1 = new JButton("1");
		btn_1.setBounds(236, 98, 39, 23);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_2.setBounds(316, 98, 39, 23);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBounds(397, 98, 39, 23);
		contentPane.add(btn_3);
		
		JButton btn_g1 = new JButton("Guardar");
		btn_g1.setBounds(219, 124, 71, 23);
		contentPane.add(btn_g1);
		
		JButton btn_g2 = new JButton("Guardar");
		btn_g2.setBounds(300, 124, 71, 23);
		contentPane.add(btn_g2);
		
		JButton btn_g3 = new JButton("Guardar");
		btn_g3.setBounds(381, 124, 71, 23);
		contentPane.add(btn_g3);
		
		JButton btn_4 = new JButton("4");
		btn_4.setBounds(236, 158, 39, 23);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBounds(316, 158, 39, 23);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBounds(397, 158, 39, 23);
		contentPane.add(btn_6);
		
		JButton btn_g4 = new JButton("Guardar");
		btn_g4.setBounds(219, 182, 71, 23);
		contentPane.add(btn_g4);
		
		JButton btn_g5 = new JButton("Guardar");
		btn_g5.setBounds(300, 182, 71, 23);
		contentPane.add(btn_g5);
		
		JButton btn_g6 = new JButton("Guardar");
		btn_g6.setBounds(381, 182, 71, 23);
		contentPane.add(btn_g6);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBounds(236, 216, 39, 23);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setBounds(316, 216, 39, 23);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBounds(397, 216, 39, 23);
		contentPane.add(btn_9);
		
		JButton btn_g7 = new JButton("Guardar");
		btn_g7.setBounds(219, 242, 71, 23);
		contentPane.add(btn_g7);
		
		JButton btn_g8 = new JButton("Guardar");
		btn_g8.setBounds(300, 242, 71, 23);
		contentPane.add(btn_g8);
		
		JButton btn_g9 = new JButton("Guardar");
		btn_g9.setBounds(381, 242, 71, 23);
		contentPane.add(btn_g9);
		
		JButton btn_10 = new JButton("10");
		btn_10.setBounds(230, 271, 45, 23);
		contentPane.add(btn_10);
		
		JButton btn_11 = new JButton("11");
		btn_11.setBounds(310, 271, 45, 23);
		contentPane.add(btn_11);
		
		JButton btn_12 = new JButton("12");
		btn_12.setBounds(397, 271, 45, 23);
		contentPane.add(btn_12);
		
		JButton btn_g10 = new JButton("Guardar");
		btn_g10.setBounds(219, 297, 71, 23);
		contentPane.add(btn_g10);
		
		JButton btn_g11 = new JButton("Guardar");
		btn_g11.setBounds(300, 297, 71, 23);
		contentPane.add(btn_g11);
		
		JButton btn_g12 = new JButton("Guardar");
		btn_g12.setBounds(381, 297, 71, 23);
		contentPane.add(btn_g12);
		
		JLabel label = new JLabel("0.00");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(300, 11, 71, 42);
		contentPane.add(label);
	}
}
