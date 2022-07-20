package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DoiMatKhau extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoiMatKhau frame = new DoiMatKhau();
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
	public DoiMatKhau() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 704, 441);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 702, 78);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("\u0110\u1ED4I M\u1EACT KH\u1EA8U");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 702, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(121)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
					.addGap(125))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 78, Short.MAX_VALUE)
				.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00CAN NH\u00C2N VI\u00CAN");
		lblNewLabel_1.setBounds(10, 89, 164, 38);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(195, 89, 372, 38);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(195, 138, 372, 38);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(195, 187, 372, 38);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(195, 236, 372, 38);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("M\u1EACT KH\u1EA8U C\u0168");
		lblNewLabel_1_1.setBounds(10, 138, 164, 38);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("M\u1EACT KH\u1EA8U M\u1EDAI");
		lblNewLabel_1_2.setBounds(10, 187, 164, 38);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("X\u00C1C NH\u1EACN M\u1EACT KH\u1EA8U");
		lblNewLabel_1_3.setBounds(10, 236, 164, 38);
		panel.add(lblNewLabel_1_3);
		
		JButton btnNewButton = new JButton("L\u01AFU");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(283, 353, 133, 30);
		panel.add(btnNewButton);
	}
}
