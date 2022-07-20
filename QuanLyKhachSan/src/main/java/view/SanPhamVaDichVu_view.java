package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
import javax.swing.table.DefaultTableModel;

import models.DonViChiTietModel;
import models.DonViTinhModel;
import models.KhoModel;
import models.NhomSPVaDichVuModel;
import models.SanPhamVaDichVuModel;
import services.DonViChiTietService;
import services.DonViTinhService;
import services.KhoService;
import services.NhomSPVaDichVuService;
import services.SanPhamVaDichVuService;
import utils.IoCContainer;
import utils.Utilities;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class SanPhamVaDichVu_view extends JFrame {
	private IoCContainer _ioCContainer  = new IoCContainer();
	private SanPhamVaDichVuService _sanPhamVaDichVuService = (SanPhamVaDichVuService) _ioCContainer.getBean(SanPhamVaDichVuService.class+"");
	private ArrayList<SanPhamVaDichVuModel> _listSanPhamVaDichVuModels = new ArrayList<SanPhamVaDichVuModel>();
	private NhomSPVaDichVuService _nhomSPVaDichVuService = (NhomSPVaDichVuService) _ioCContainer.getBean(NhomSPVaDichVuService.class+"");
	private ArrayList<NhomSPVaDichVuModel> _listNhomSPVaDichVuModels = new ArrayList<NhomSPVaDichVuModel>();
	private DonViTinhService _donViTinhService = (DonViTinhService) _ioCContainer.getBean(DonViTinhService.class+"");
	private List<DonViTinhModel> _listDonViTinhModels = new ArrayList<DonViTinhModel>();
	private DonViChiTietService _donViChiTietService = (DonViChiTietService) _ioCContainer.getBean(DonViChiTietService.class+"");
	private List<DonViChiTietModel> _listDonViChiTietModel = new ArrayList<DonViChiTietModel>();
	private KhoService _khoService = (KhoService) _ioCContainer.getBean(KhoService.class+"");
	private List<KhoModel> _listKhoModels = new ArrayList<KhoModel>();
	private int _sttNhomSPVaDichVuModelEditing ;
	private int _sttDonViTinhModelEditing ;
	private int _sttKhoModelEditing;
	
	
	private JPanel contentPane;
	private JTextField txt_search;
	private JTable table_danhSachSanPhamVaDichVu;
	private JTextField txt_tenHangHoa;
	private JTextField txt_maSanPham;
	private JTextField txt_giaTriQuyDoi;
	private JTextField txt_giaBan;
	private JTable table_danhSachDonViTinh_selected;
	private JTable table_danhSachDonViTinh;
	private SwitchButton switchButton_nhap;
	private JComboBox cbx_nhomSanPham;
	private JTextArea txt_moTa;
	private JTextField txt_soLuongTon;
	private JTextField txt_giaVon;
	private JComboBox cbx_kho;
	private SwitchButton switchButton_nhapDonViTinh;
	private JButton btn_suaSanPham;
	private JButton btn_themSanPham;
	private JComboBox cbx_donViTinh;
	private JButton btn_suaDonVi;
	private JButton btn_themDonVi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SanPhamVaDichVu_view frame = new SanPhamVaDichVu_view();
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
	public SanPhamVaDichVu_view() {
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
		
		JLabel lblNewLabel = new JLabel("Trạng thái");
		lblNewLabel.setBounds(20, 11, 63, 31);
		panel_3.add(lblNewLabel);
		
		SwitchButton switchButton_danhSach = new SwitchButton();
		switchButton_danhSach.setBounds(20, 37, 55, 25);
		panel_3.add(switchButton_danhSach);
		switchButton_danhSach.setBackground(new Color(0, 153, 204));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(543, 19, 338, 51);
		panel_3.add(panel_2);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Nh\u00F3m s\u1EA3n ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setLayout(null);
		
		JComboBox cbx_nhomSanPham_danhSach = new JComboBox();
		cbx_nhomSanPham_danhSach.setModel(new DefaultComboBoxModel(new String[] {"Tất cả"}));
		cbx_nhomSanPham_danhSach.setBackground(Color.WHITE);
		cbx_nhomSanPham_danhSach.setBounds(10, 18, 318, 28);
		cbx_nhomSanPham_danhSach.setBorder(new EmptyBorder(-11, -4, -11, -1));
		panel_2.add(cbx_nhomSanPham_danhSach);
		
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(10, 81, 610, 51);
		panel_3.add(panel_2_1);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "T\u00ECm ki\u1EBFm Theo t\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		txt_search = new JTextField();
		txt_search.setBackground(Color.WHITE);
		txt_search.setBounds(10, 18, 543, 29);
		panel_2_1.add(txt_search);
		txt_search.setBorder(null);
		txt_search.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 137, 1219, 483);
		panel_3.add(scrollPane);
		
		table_danhSachSanPhamVaDichVu = new JTable();
		scrollPane.setViewportView(table_danhSachSanPhamVaDichVu);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Nh\u00F3m h\u00E0ng h\u00F3a", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(195, 19, 338, 51);
		panel_3.add(panel_2_2);
		
		JComboBox cbx_nhomHangHoa = new JComboBox();
		cbx_nhomHangHoa.setModel(new DefaultComboBoxModel(new String[] {"Tất cả", "Sản phẩm", "Dịch vụ"}));
		cbx_nhomHangHoa.setBorder(new EmptyBorder(-11, -4, -11, -1));
		cbx_nhomHangHoa.setBackground(Color.WHITE);
		cbx_nhomHangHoa.setBounds(10, 18, 318, 28);
		panel_2_2.add(cbx_nhomHangHoa);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "S\u1EAFp x\u1EBFp", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setBounds(891, 19, 338, 51);
		panel_3.add(panel_2_3);
		
		JComboBox cbx_sapXep = new JComboBox();
		cbx_sapXep.setModel(new DefaultComboBoxModel(new String[] {"Tên A => Z", "Tên Z => A", "Giá: Thấp => Cao", "Giá: Cao => Thấp", "Ngày cập nhật: Cũ nhất", "Ngày cập nhật: Mới nhất"}));
		cbx_sapXep.setBorder(new EmptyBorder(-11, -4, -11, -1));
		cbx_sapXep.setBackground(Color.WHITE);
		cbx_sapXep.setBounds(10, 18, 318, 28);
		panel_2_3.add(cbx_sapXep);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Cập Nhật Sản Phẩm - Dịch Vụ", null, panel_4, null);
		panel_4.setLayout(null);
		
		 txt_moTa = new JTextArea();
		txt_moTa.setBounds(10, 198, 1207, 78);
		panel_4.add(txt_moTa);
		
		JButton btnThm = new JButton("Làm mới");
		btnThm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFormSanPham();
			}
		});
		btnThm.setBackground(new Color(255, 204, 102));
		btnThm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThm.setBounds(1077, 588, 152, 32);
		panel_4.add(btnThm);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("MÔ TẢ");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_1.setBounds(10, 167, 185, 32);
		panel_4.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Thông tin chung");
		lblNewLabel_1_3.setForeground(new Color(255, 153, 102));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(10, 0, 371, 32);
		panel_4.add(lblNewLabel_1_3);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setLayout(null);
		panel_2_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Nh\u00F3m s\u1EA3n ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_4.setBackground(Color.WHITE);
		panel_2_4.setBounds(760, 43, 324, 51);
		panel_4.add(panel_2_4);
		
		cbx_nhomSanPham = new JComboBox();
		cbx_nhomSanPham.setBorder(new EmptyBorder(-11, -4, -11, -1));
		cbx_nhomSanPham.setBackground(Color.WHITE);
		cbx_nhomSanPham.setBounds(10, 18, 304, 28);
		panel_2_4.add(cbx_nhomSanPham);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "T\u00EAn H\u00E0ng H\u00F3a", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBounds(306, 43, 444, 51);
		panel_4.add(panel_2_1_1);
		
		txt_tenHangHoa = new JTextField();
		txt_tenHangHoa.setColumns(10);
		txt_tenHangHoa.setBorder(null);
		txt_tenHangHoa.setBackground(Color.WHITE);
		txt_tenHangHoa.setBounds(10, 18, 424, 29);
		panel_2_1_1.add(txt_tenHangHoa);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "M\u00E3 s\u1EA3n ph\u1EA9m", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_2.setBackground(Color.WHITE);
		panel_2_1_2.setBounds(10, 43, 286, 51);
		panel_4.add(panel_2_1_2);
		
		txt_maSanPham = new JTextField();
		txt_maSanPham.setColumns(10);
		txt_maSanPham.setBorder(null);
		txt_maSanPham.setBackground(Color.WHITE);
		txt_maSanPham.setBounds(10, 18, 266, 29);
		panel_2_1_2.add(txt_maSanPham);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "\u0110\u01A1n v\u1ECB t\u00EDnh", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 287, 1219, 290);
		panel_4.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 120, 577, 159);
		panel.add(scrollPane_1);
		
		table_danhSachDonViTinh_selected = new JTable();
		scrollPane_1.setViewportView(table_danhSachDonViTinh_selected);
		
		JLabel lblNewLabel_1 = new JLabel("Đơn vị tính đã chọn - Hoạt động");
		lblNewLabel_1.setBounds(10, 105, 225, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Gi\u00E1 tr\u1ECB quy \u0111\u1ED5i", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1.setBounds(262, 27, 171, 51);
		panel.add(panel_2_1_1_1_1);
		
		txt_giaTriQuyDoi = new JTextField();
		txt_giaTriQuyDoi.setColumns(10);
		txt_giaTriQuyDoi.setBorder(null);
		txt_giaTriQuyDoi.setBackground(Color.WHITE);
		txt_giaTriQuyDoi.setBounds(10, 18, 151, 22);
		panel_2_1_1_1_1.add(txt_giaTriQuyDoi);
		
		JPanel panel_2_1_1_1_3 = new JPanel();
		panel_2_1_1_1_3.setLayout(null);
		panel_2_1_1_1_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Gi\u00E1 b\u00E1n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_1_1_3.setBackground(Color.WHITE);
		panel_2_1_1_1_3.setBounds(443, 27, 171, 51);
		panel.add(panel_2_1_1_1_3);
		
		txt_giaBan = new JTextField("Nhập giá bán");
		txt_giaBan.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Utilities.setTextFocusGained(txt_giaBan, "Nhập giá bán");
			}
			@Override
			public void focusLost(FocusEvent e) {
				Utilities.setTextFocusLost(txt_giaBan, "Nhập giá bán");
			}
		});
		txt_giaBan.setColumns(10);
		txt_giaBan.setBorder(null);
		txt_giaBan.setBackground(Color.WHITE);
		txt_giaBan.setBounds(10, 18, 151, 22);
		panel_2_1_1_1_3.add(txt_giaBan);
		
		JPanel panel_donViTinh = new JPanel();
		panel_donViTinh.setLayout(null);
		panel_donViTinh.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "\u0110\u01A1n v\u1ECB c\u01A1 b\u1EA3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_donViTinh.setBackground(Color.WHITE);
		panel_donViTinh.setBounds(10, 27, 242, 51);
		panel.add(panel_donViTinh);
		
		cbx_donViTinh = new JComboBox();
		cbx_donViTinh.setModel(new DefaultComboBoxModel(new String[] {"Chọn đơn vị tính"}));
		cbx_donViTinh.setBorder(new EmptyBorder(-11, -4, -11, -1));
		cbx_donViTinh.setBackground(Color.WHITE);
		cbx_donViTinh.setBounds(10, 18, 222, 28);
		panel_donViTinh.add(cbx_donViTinh);
		
		JButton btnNewButton = new JButton("Làm mới");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFormDonViTinh();
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(1104, 27, 105, 51);
		panel.add(btnNewButton);
		
		btn_suaDonVi = new JButton("Sửa");
		btn_suaDonVi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_suaDonVi.setBackground(Color.ORANGE);
		btn_suaDonVi.setBounds(989, 27, 105, 51);
		panel.add(btn_suaDonVi);
		
		btn_themDonVi = new JButton("Thêm");
		btn_themDonVi.setBackground(Color.ORANGE);
		btn_themDonVi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_themDonVi.setBounds(874, 27, 105, 51);
		panel.add(btn_themDonVi);
		
		switchButton_nhapDonViTinh = new SwitchButton();
		switchButton_nhapDonViTinh.setSelected(true);
		switchButton_nhapDonViTinh.setBackground(new Color(0, 153, 204));
		switchButton_nhapDonViTinh.setBounds(620, 53, 55, 25);
		panel.add(switchButton_nhapDonViTinh);
		
		JLabel lblNewLabel_2 = new JLabel("Trạng thái");
		lblNewLabel_2.setBounds(620, 19, 63, 31);
		panel.add(lblNewLabel_2);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(632, 120, 577, 159);
		panel.add(scrollPane_1_1);
		
		table_danhSachDonViTinh = new JTable();
		scrollPane_1_1.setViewportView(table_danhSachDonViTinh);
		
		JLabel lblNewLabel_1_1 = new JLabel("Đơn vị tính đã chọn - Không hoạt động");
		lblNewLabel_1_1.setBounds(632, 105, 263, 14);
		panel.add(lblNewLabel_1_1);
		
		btn_suaSanPham = new JButton("Sửa");
		btn_suaSanPham.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_suaSanPham.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_suaSanPham.setBackground(new Color(255, 204, 102));
		btn_suaSanPham.setBounds(915, 588, 152, 32);
		panel_4.add(btn_suaSanPham);
		
		btn_themSanPham = new JButton("Thêm");
		btn_themSanPham.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_themSanPham.setBackground(new Color(255, 204, 102));
		btn_themSanPham.setBounds(753, 588, 152, 32);
		panel_4.add(btn_themSanPham);
		
		switchButton_nhap = new SwitchButton();
		switchButton_nhap.setSelected(true);
		switchButton_nhap.setBackground(new Color(0, 153, 204));
		switchButton_nhap.setBounds(1130, 69, 55, 25);
		panel_4.add(switchButton_nhap);
		
		JLabel lblNewLabel_2_1 = new JLabel("Trạng thái");
		lblNewLabel_2_1.setBounds(1130, 43, 66, 20);
		panel_4.add(lblNewLabel_2_1);
		
		JPanel panel_2_4_1 = new JPanel();
		panel_2_4_1.setLayout(null);
		panel_2_4_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Kho", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_4_1.setBackground(Color.WHITE);
		panel_2_4_1.setBounds(10, 116, 286, 51);
		panel_4.add(panel_2_4_1);
		
		cbx_kho = new JComboBox();
		cbx_kho.setBorder(new EmptyBorder(-11, -4, -11, -1));
		cbx_kho.setBackground(Color.WHITE);
		cbx_kho.setBounds(10, 18, 266, 28);
		panel_2_4_1.add(cbx_kho);
		
		JPanel panel_2_1_2_1 = new JPanel();
		panel_2_1_2_1.setLayout(null);
		panel_2_1_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "S\u1ED1 l\u01B0\u1EE3ng t\u1ED3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_2_1.setBackground(Color.WHITE);
		panel_2_1_2_1.setBounds(306, 116, 286, 51);
		panel_4.add(panel_2_1_2_1);
		
		txt_soLuongTon = new JTextField();
		txt_soLuongTon.setColumns(10);
		txt_soLuongTon.setBorder(null);
		txt_soLuongTon.setBackground(Color.WHITE);
		txt_soLuongTon.setBounds(10, 18, 266, 29);
		panel_2_1_2_1.add(txt_soLuongTon);
		
		JPanel panel_2_1_2_1_1 = new JPanel();
		panel_2_1_2_1_1.setLayout(null);
		panel_2_1_2_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(192, 192, 192)), "Gi\u00E1 v\u1ED1n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1_2_1_1.setBackground(Color.WHITE);
		panel_2_1_2_1_1.setBounds(602, 116, 286, 51);
		panel_4.add(panel_2_1_2_1_1);
		
		txt_giaVon = new JTextField();
		txt_giaVon.setColumns(10);
		txt_giaVon.setBorder(null);
		txt_giaVon.setBackground(Color.WHITE);
		txt_giaVon.setBounds(10, 18, 266, 29);
		panel_2_1_2_1_1.add(txt_giaVon);
		
	}
	
	public void updateCbx_nhomSanPham() {
		String arrayNhomSPVaDichVu[] = new String[_listNhomSPVaDichVuModels.size()+1];
		arrayNhomSPVaDichVu[0] = "--Chọn nhóm--";
		int index =1;
		for (NhomSPVaDichVuModel nhomSPVaDichVuModel : _listNhomSPVaDichVuModels) {
			arrayNhomSPVaDichVu[index] = nhomSPVaDichVuModel.getTenNhomSP();
			index++;
		}
		cbx_nhomSanPham.setModel(new DefaultComboBoxModel(arrayNhomSPVaDichVu));
	}
	public void updateCbx_kho() {
		String arrayKho[] = new String[_listKhoModels.size()+1];
		arrayKho[0] = "--Chọn kho--";
		int index =1;
		for (KhoModel khoModel : _listKhoModels) {
			arrayKho[index] = khoModel.getTenKho();
			index++;
		}
		cbx_kho.setModel(new DefaultComboBoxModel(arrayKho));
	}
	
	public void updateCbx_doViTinh() {
		String arrayDonViTinh[] = new String[_listDonViTinhModels.size()+1];
		arrayDonViTinh[0] = "--Chọn đơn vị tính--";
		int index =1;
		for (DonViTinhModel donViTinhModel : _listDonViTinhModels) {
			arrayDonViTinh[index] = donViTinhModel.getTenDonVi();
			index++;
		}
		cbx_donViTinh.setModel(new DefaultComboBoxModel(arrayDonViTinh));
	}
	
	public void clearFormSanPham() {
		switchButton_nhap.setSelected(true);
		switchButton_nhapDonViTinh.setSelected(true);
		txt_maSanPham.setText("");
		txt_tenHangHoa.setText("Nhập tên hàng hóa");
		cbx_nhomSanPham.setSelectedIndex(0);
		cbx_kho.setSelectedIndex(0);
		txt_soLuongTon.setText("0");
		txt_giaVon.setText("0");
		txt_moTa.setText("");
		btn_suaSanPham.setEnabled(false);
		btn_themSanPham.setEnabled(true);
		clearFormDonViTinh();
	}
	
	public void clearFormDonViTinh() {
		cbx_donViTinh.setSelectedIndex(0);
		txt_giaTriQuyDoi.setText("1");
		txt_giaTriQuyDoi.setEditable(false);
		txt_giaBan.setText("Nhập giá bán");
		switchButton_nhapDonViTinh.setSelected(true);
		btn_suaDonVi.setEnabled(false);
		btn_themDonVi.setEnabled(true);
		
	}
	
	public void doClickOnTable() {
		txt_maKho.setText(table.getModel().getValueAt(table.getSelectedRow(), 1)+"");
		txt_tenKho.setText(table.getModel().getValueAt(table.getSelectedRow(), 2)+"");
		String trangThai = table.getModel().getValueAt(table.getSelectedRow(), 1)+"";
		if(trangThai.equals("Hoạt Động")) {
			switchButton_trangThaiNhap.setSelected(true);
		}else {
			switchButton_trangThaiNhap.setSelected(false);
		}
	}
	
	public void updateTable() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Stt");
		model.addColumn("MÃ KHO");
		model.addColumn("TÊN KHO");
		model.addColumn("TRẠNG THÁI");
		_listKhoModels = _khoService.getListKhoModel();
		
		for (KhoModel khoModel : _listKhoModels) {
			
			if(switchButton_trangThaiLoc.isSelected() && khoModel.getTrangThai().equals("Hoạt Động")) {
				model.addColumn(new Object[] {khoModel.getStt(),khoModel.getMaKho(),khoModel.getTenKho(),khoModel.getTrangThai()});
			}else if(!switchButton_trangThaiLoc.isSelected() && khoModel.getTrangThai().equals("Không Hoạt Động")) {
				model.addColumn(new Object[] {khoModel.getStt(),khoModel.getMaKho(),khoModel.getTenKho(),khoModel.getTrangThai()});
			}
		}
		table.setModel(model);
	}
	
	public SanPhamVaDichVuModel getInforFromFormIntoSanPhamVaDichVuModel() {
		int maDichVu = 0;
		if(txt_maSanPham.getText().equals("")) {
			maDichVu = 0;
		}else {
			maDichVu = Integer.parseInt(txt_maSanPham.getText());
		}
		
		String trangThai = "";
		if(switchButton_nhap.isSelected()) {
			trangThai = "Hoạt Động";
		}else {
			trangThai = "Không Hoạt Động";
		}
		
		String tenHangHoa = txt_tenHangHoa.getText().trim();
		
		_sttNhomSPVaDichVuModelEditing = cbx_nhomSanPham.getSelectedIndex(); // check đổi biến toàn cục
		NhomSPVaDichVuModel
		int maNhomSp = _listNhomSPVaDichVuModels.get(_sttNhomSPVaDichVuModelEditing).getMaNhomSP();
		
		_sttKhoModelEditing = cbx_kho.getSelectedIndex();
		int maKho = _listKhoModels.get(_sttKhoModelEditing).getMaKho();
		
		int soLuongTon = Integer.parseInt(txt_soLuongTon.getText().trim());
		double giaVon = Double.parseDouble(txt_giaVon.getText());
		String moTa = txt_moTa.getText().trim();
		
		
		SanPhamVaDichVuModel sanPhamVaDichVuModel = new SanPhamVaDichVuModel(0, maDichVu, tenHangHoa, null, maNhomSp, soLuongTon, soLuongTon, null, maKho, trangThai, null, null, null, null)
		return khoModel;
	}
}
