package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

public class KiemKho_view extends JFrame {

	private JPanel contentPane;
	private JTable table_2;
	private JTextField textField_8;
	private JTable table_1;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_6;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_5;
	private JTextField textField_4;
	private JTextField textField_2;
	private JTable table;
	private JTextField txtTmKimTheo;
	private JTextField txtTmKimTheo_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KiemKho_view frame = new KiemKho_view();
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
	public KiemKho_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1264, 681);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 1244, 659);
		panel_1.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Danh Sách", null, panel_3, null);
		panel_3.setLayout(null);
		
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(274, 19, 490, 51);
		panel_3.add(panel_2_1);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "T\u00ECm ki\u1EBFm theo h\u00E0ng h\u00F3a", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		txtTmKimTheo = new JTextField();
		txtTmKimTheo.setText("tìm kiếm theo hàng hóa hoặc mã hàng hóa");
		txtTmKimTheo.setBackground(Color.WHITE);
		txtTmKimTheo.setBounds(10, 18, 435, 29);
		panel_2_1.add(txtTmKimTheo);
		((JComponent) txtTmKimTheo).setBorder(null);
		txtTmKimTheo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 81, 1219, 539);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_2_1_1_1_2 = new JPanel();
		panel_2_1_1_1_2.setLayout(null);
		panel_2_1_1_1_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Th\u1EDDi gian", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_1_2.setBackground(Color.WHITE);
		panel_2_1_1_1_2.setBounds(10, 19, 254, 51);
		panel_3.add(panel_2_1_1_1_2);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(10, 20, 234, 20);
		panel_2_1_1_1_2.add(dateChooser_1);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "t\u00ECm ki\u1EBFm theo m\u00E3 phi\u1EBFu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_2.setBackground(Color.WHITE);
		panel_2_1_2.setBounds(774, 19, 455, 51);
		panel_3.add(panel_2_1_2);
		
		txtTmKimTheo_1 = new JTextField();
		txtTmKimTheo_1.setText("Tìm kiếm theo mã kiểm kho");
		txtTmKimTheo_1.setColumns(10);
		txtTmKimTheo_1.setBorder(null);
		txtTmKimTheo_1.setBackground(Color.WHITE);
		txtTmKimTheo_1.setBounds(10, 18, 435, 29);
		panel_2_1_2.add(txtTmKimTheo_1);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Cập Nhật Nhóm Sản Phẩm", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "M\u00C3 KI\u1EC2M KHO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBounds(10, 11, 132, 51);
		panel_4.add(panel_2_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(10, 18, 112, 29);
		panel_2_1_1.add(textField_2);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "NG\u00C0Y GI\u1EDC T\u1EA0O H\u0110 NH\u1EACP", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1.setBounds(152, 11, 254, 51);
		panel_4.add(panel_2_1_1_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(10, 20, 234, 20);
		panel_2_1_1_1.add(dateChooser);
		
		JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "H\u1ECC T\u00CAN NH\u00C2N VI\u00CAN", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1.setBounds(416, 11, 187, 51);
		panel_4.add(panel_2_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(10, 18, 167, 29);
		panel_2_1_1_1_1.add(textField_4);
		
		JPanel panel_2_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "GHI CH\u00DA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1.setBounds(613, 11, 318, 51);
		panel_4.add(panel_2_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(10, 18, 298, 29);
		panel_2_1_1_1_1_1.add(textField_5);
		
		JButton btnNewButton = new JButton("Lưu");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.setBounds(941, 13, 139, 49);
		panel_4.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClear.setBackground(new Color(255, 204, 0));
		btnClear.setBounds(1090, 13, 139, 49);
		panel_4.add(btnClear);
		
		JPanel panel_2_1_1_1_1_2 = new JPanel();
		panel_2_1_1_1_1_2.setLayout(null);
		panel_2_1_1_1_1_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Th\u00F4ng tin s\u1EA3n ph\u1EA9m nh\u1EADp", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_1_1_2.setBackground(new Color(204, 204, 204));
		panel_2_1_1_1_1_2.setBounds(10, 73, 1219, 180);
		panel_4.add(panel_2_1_1_1_1_2);
		
		JPanel panel_2_1_1_2 = new JPanel();
		panel_2_1_1_2.setLayout(null);
		panel_2_1_1_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "M\u00C3 S\u1EA2N PH\u1EA8M", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_2.setBackground(Color.WHITE);
		panel_2_1_1_2.setBounds(10, 21, 132, 51);
		panel_2_1_1_1_1_2.add(panel_2_1_1_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(10, 18, 112, 29);
		panel_2_1_1_2.add(textField_1);
		
		JPanel panel_2_1_1_2_1 = new JPanel();
		panel_2_1_1_2_1.setLayout(null);
		panel_2_1_1_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "T\u00CAN S\u1EA2N PH\u1EA8M", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_2_1.setBackground(Color.WHITE);
		panel_2_1_1_2_1.setBounds(152, 21, 242, 51);
		panel_2_1_1_1_1_2.add(panel_2_1_1_2_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(10, 18, 222, 29);
		panel_2_1_1_2_1.add(textField_3);
		
		JPanel panel_2_1_1_2_2 = new JPanel();
		panel_2_1_1_2_2.setLayout(null);
		panel_2_1_1_2_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "S.LG TR\u01AF\u1EDAC KI\u1EC2M", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_2_2.setBackground(Color.WHITE);
		panel_2_1_1_2_2.setBounds(404, 21, 132, 51);
		panel_2_1_1_1_1_2.add(panel_2_1_1_2_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(10, 18, 112, 29);
		panel_2_1_1_2_2.add(textField_6);
		
		JButton btnNewButton_1 = new JButton("Thêm");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(1120, 17, 89, 31);
		panel_2_1_1_1_1_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Sửa");
		btnNewButton_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1.setBounds(1120, 59, 89, 31);
		panel_2_1_1_1_1_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Xóa");
		btnNewButton_1_2.setBackground(new Color(255, 255, 255));
		btnNewButton_1_2.setBounds(1120, 101, 89, 31);
		panel_2_1_1_1_1_2.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Clear");
		btnNewButton_1_3.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3.setBounds(1120, 143, 89, 31);
		panel_2_1_1_1_1_2.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("GHI CHÚ ĐIỀU CHỈNH:");
		lblNewLabel_1_2_1.setBounds(10, 83, 185, 22);
		panel_2_1_1_1_1_2.add(lblNewLabel_1_2_1);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 104, 1059, 65);
		panel_2_1_1_1_1_2.add(textArea);
		
		JPanel panel_2_1_1_2_2_1 = new JPanel();
		panel_2_1_1_2_2_1.setLayout(null);
		panel_2_1_1_2_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "S.LG CH\u00CANH L\u1EC6CH", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_2_2_1.setBackground(Color.WHITE);
		panel_2_1_1_2_2_1.setBounds(688, 21, 186, 51);
		panel_2_1_1_1_1_2.add(panel_2_1_1_2_2_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBorder(null);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(10, 18, 139, 29);
		panel_2_1_1_2_2_1.add(textField_9);
		
		JPanel panel_2_1_1_2_2_3 = new JPanel();
		panel_2_1_1_2_2_3.setLayout(null);
		panel_2_1_1_2_2_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "S.LG TH\u1EF0C T\u1EBE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_2_2_3.setBackground(Color.WHITE);
		panel_2_1_1_2_2_3.setBounds(546, 21, 132, 51);
		panel_2_1_1_1_1_2.add(panel_2_1_1_2_2_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(Color.WHITE);
		textField.setBounds(10, 18, 112, 29);
		panel_2_1_1_2_2_3.add(textField);
		
		JPanel panel_2_1_1_3 = new JPanel();
		panel_2_1_1_3.setLayout(null);
		panel_2_1_1_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Danh s\u00E1ch s\u1EA3n ph\u1EA9m nh\u1EADp", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_3.setBackground(new Color(204, 204, 204));
		panel_2_1_1_3.setBounds(10, 264, 599, 356);
		panel_4.add(panel_2_1_1_3);
		
		JPanel panel_2_1_1_4 = new JPanel();
		panel_2_1_1_4.setLayout(null);
		panel_2_1_1_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "T\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_4.setBackground(Color.WHITE);
		panel_2_1_1_4.setBounds(10, 22, 579, 51);
		panel_2_1_1_3.add(panel_2_1_1_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBorder(null);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(10, 18, 559, 29);
		panel_2_1_1_4.add(textField_7);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 84, 579, 261);
		panel_2_1_1_3.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_2_1_1_3_1 = new JPanel();
		panel_2_1_1_3_1.setLayout(null);
		panel_2_1_1_3_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Danh s\u00E1ch s\u1EA3n ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_3_1.setBackground(new Color(204, 204, 204));
		panel_2_1_1_3_1.setBounds(630, 264, 599, 356);
		panel_4.add(panel_2_1_1_3_1);
		
		JPanel panel_2_1_1_4_1 = new JPanel();
		panel_2_1_1_4_1.setLayout(null);
		panel_2_1_1_4_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "T\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_4_1.setBackground(Color.WHITE);
		panel_2_1_1_4_1.setBounds(10, 22, 579, 51);
		panel_2_1_1_3_1.add(panel_2_1_1_4_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBorder(null);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(10, 18, 559, 29);
		panel_2_1_1_4_1.add(textField_8);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(10, 84, 579, 261);
		panel_2_1_1_3_1.add(scrollPane_1_1);
		
		table_2 = new JTable();
		scrollPane_1_1.setViewportView(table_2);
		
	}
}
