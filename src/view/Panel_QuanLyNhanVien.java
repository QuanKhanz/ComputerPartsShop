/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.connguoi.NguoiQuanLy;
import model.connguoi.NhanVien;
import model.share.DiaChi;

/**
 *
 * @author macbookk
 */
public class Panel_QuanLyNhanVien extends javax.swing.JPanel {
    private ArrayList<NhanVien> listNV = new ArrayList<NhanVien>();
    DefaultTableModel model_dsNhanVien ;
    /**
     * Creates new form Panel_QuanLyNhanVien
     */
    public void testData() throws Exception{
        DiaChi dc1 = new DiaChi("7", "Nguyen Anh Thu", "12", "HCM", "VietNam");
        NhanVien nv1 = new NhanVien("NV01","Quan ly","Tran Dinh Kien","123456789", "bankienthanthien@gmail.com", "2003", dc1, true);
        DiaChi dc2 = new DiaChi("7", "Nguyen Anh Thu", "12", "HCM", "Japan");
        NhanVien nv2 = new NhanVien("NV02","Quan ly","Tran Dinh Kien","123456789", "bankienthanthien@gmail.com", "2003", dc2, true);
        DiaChi dc3 = new DiaChi("7", "Nguyen Anh Thu", "12", "HCM", "US");
        NhanVien nv3 = new NhanVien("NV03","Quan ly","Tran Dinh Kien","123456789", "bankienthanthien@gmail.com", "2003", dc3, false);
        listNV.add(nv1);
        listNV.add(nv2);
        listNV.add(nv3);
    }
    
    public Panel_QuanLyNhanVien() throws Exception {
        String col[] = {"Mã nhân viên","Họ tên","Email","Số điện thoại","Địa chỉ","Chức danh","Năm sinh","Giới tính"};
        model_dsNhanVien=new DefaultTableModel(col,0);
       
        initComponents(); 
        tbl_dsNhanVien.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbl_dsNhanVien.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_dsNhanVien.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_dsNhanVien.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbl_dsNhanVien.getColumnModel().getColumn(3).setPreferredWidth(150);
        testData();
        renderListToTable(listNV);
        
       
    }
    
    public void renderListToTable(ArrayList<NhanVien> listNV) throws Exception{
        model_dsNhanVien.setRowCount(0);
        for(NhanVien nv:listNV){
           model_dsNhanVien.addRow(new Object[] {nv.getMaNV(),nv.getHoTen(),nv.getEmail(),nv.getSoDT(),nv.getDiaChi(),nv.getChucDanh(),nv.getNamSinh(),nv.isGioiTinh()});
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Control = new javax.swing.JPanel();
        pnl_controlgroup = new javax.swing.JPanel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_themNV = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_xoaNV = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_suaNV = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_capNhatMKNV = new javax.swing.JButton();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        pnl_ttNhanVien = new javax.swing.JPanel();
        pnl_avata = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnl_formNV = new javax.swing.JPanel();
        pnl_maNV = new javax.swing.JPanel();
        lbl_maNV = new javax.swing.JLabel();
        txt_maNV = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        pnl_hoTenNV = new javax.swing.JPanel();
        lbl_hoTen = new javax.swing.JLabel();
        txt_hoTenNV = new javax.swing.JTextField();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        pnl_email = new javax.swing.JPanel();
        lbl_mailNV = new javax.swing.JLabel();
        txt_mailNV = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        pnl_soDT = new javax.swing.JPanel();
        lbl_soDT = new javax.swing.JLabel();
        txt_spDT = new javax.swing.JTextField();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        pnl_chucVu = new javax.swing.JPanel();
        lbl_chucVu = new javax.swing.JLabel();
        txt_chucVu = new javax.swing.JTextField();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        pnl_namSinh = new javax.swing.JPanel();
        lbl_namSinh = new javax.swing.JLabel();
        txt_namSinh = new javax.swing.JTextField();
        lbl_gioiTinh = new javax.swing.JLabel();
        cmb_gioiTinh = new javax.swing.JComboBox<>();
        pnl_dsNhanVien = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dsNhanVien = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new java.awt.BorderLayout());

        pnl_Control.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_Control.setPreferredSize(new java.awt.Dimension(745, 70));
        pnl_Control.setLayout(new javax.swing.BoxLayout(pnl_Control, javax.swing.BoxLayout.LINE_AXIS));

        pnl_controlgroup.setPreferredSize(new java.awt.Dimension(996, 100));
        pnl_controlgroup.setLayout(new javax.swing.BoxLayout(pnl_controlgroup, javax.swing.BoxLayout.LINE_AXIS));
        pnl_controlgroup.add(filler8);

        btn_themNV.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btn_themNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quanlynhanvien/add-group.png"))); // NOI18N
        btn_themNV.setText("Thêm Nhân Viên");
        btn_themNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_themNV.setIconTextGap(8);
        btn_themNV.setMaximumSize(new java.awt.Dimension(125, 50));
        btn_themNV.setPreferredSize(new java.awt.Dimension(180, 50));
        btn_themNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themNVActionPerformed(evt);
            }
        });
        pnl_controlgroup.add(btn_themNV);
        pnl_controlgroup.add(filler4);

        btn_xoaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quanlynhanvien/user.png"))); // NOI18N
        btn_xoaNV.setText("Xoá Nhân Viên");
        btn_xoaNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_xoaNV.setIconTextGap(8);
        btn_xoaNV.setMaximumSize(new java.awt.Dimension(115, 50));
        btn_xoaNV.setPreferredSize(new java.awt.Dimension(180, 50));
        pnl_controlgroup.add(btn_xoaNV);
        pnl_controlgroup.add(filler5);

        btn_suaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quanlynhanvien/transaction.png"))); // NOI18N
        btn_suaNV.setText("Sửa Nhân Viên");
        btn_suaNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_suaNV.setIconTextGap(8);
        btn_suaNV.setMaximumSize(new java.awt.Dimension(117, 50));
        btn_suaNV.setPreferredSize(new java.awt.Dimension(180, 50));
        pnl_controlgroup.add(btn_suaNV);
        pnl_controlgroup.add(filler6);

        btn_capNhatMKNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quanlynhanvien/password.png"))); // NOI18N
        btn_capNhatMKNV.setText("Cập Nhật Mật Khẩu");
        btn_capNhatMKNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_capNhatMKNV.setIconTextGap(5);
        btn_capNhatMKNV.setMaximumSize(new java.awt.Dimension(145, 50));
        btn_capNhatMKNV.setPreferredSize(new java.awt.Dimension(190, 50));
        btn_capNhatMKNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capNhatMKNVActionPerformed(evt);
            }
        });
        pnl_controlgroup.add(btn_capNhatMKNV);
        pnl_controlgroup.add(filler7);

        pnl_Control.add(pnl_controlgroup);

        add(pnl_Control, java.awt.BorderLayout.SOUTH);

        pnl_ttNhanVien.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14), new java.awt.Color(65, 165, 238))); // NOI18N
        pnl_ttNhanVien.setPreferredSize(new java.awt.Dimension(400, 300));
        pnl_ttNhanVien.setLayout(new java.awt.BorderLayout());

        pnl_avata.setMaximumSize(new java.awt.Dimension(32767, 100));
        pnl_avata.setPreferredSize(new java.awt.Dimension(0, 300));
        pnl_avata.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quanlynhanvien/user-4.png"))); // NOI18N
        jLabel1.setIconTextGap(10);
        pnl_avata.add(jLabel1, java.awt.BorderLayout.CENTER);

        pnl_ttNhanVien.add(pnl_avata, java.awt.BorderLayout.CENTER);

        pnl_formNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_formNV.setMaximumSize(new java.awt.Dimension(390, 100));
        pnl_formNV.setPreferredSize(new java.awt.Dimension(390, 300));
        pnl_formNV.setLayout(new javax.swing.BoxLayout(pnl_formNV, javax.swing.BoxLayout.Y_AXIS));

        pnl_maNV.setPreferredSize(new java.awt.Dimension(180, 70));

        lbl_maNV.setForeground(new java.awt.Color(102, 102, 102));
        lbl_maNV.setText("Mã nhân viên:");

        txt_maNV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_maNV.setMaximumSize(new java.awt.Dimension(280, 30));
        txt_maNV.setMinimumSize(new java.awt.Dimension(65, 30));
        txt_maNV.setPreferredSize(new java.awt.Dimension(280, 30));

        javax.swing.GroupLayout pnl_maNVLayout = new javax.swing.GroupLayout(pnl_maNV);
        pnl_maNV.setLayout(pnl_maNVLayout);
        pnl_maNVLayout.setHorizontalGroup(
            pnl_maNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_maNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_maNVLayout.setVerticalGroup(
            pnl_maNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_maNVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_maNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_maNV)
                    .addComponent(txt_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        pnl_formNV.add(pnl_maNV);
        pnl_formNV.add(filler1);

        pnl_hoTenNV.setPreferredSize(new java.awt.Dimension(180, 70));

        lbl_hoTen.setForeground(new java.awt.Color(102, 102, 102));
        lbl_hoTen.setText("Họ tên:");

        txt_hoTenNV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_hoTenNV.setPreferredSize(new java.awt.Dimension(65, 30));

        javax.swing.GroupLayout pnl_hoTenNVLayout = new javax.swing.GroupLayout(pnl_hoTenNV);
        pnl_hoTenNV.setLayout(pnl_hoTenNVLayout);
        pnl_hoTenNVLayout.setHorizontalGroup(
            pnl_hoTenNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_hoTenNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_hoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(txt_hoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_hoTenNVLayout.setVerticalGroup(
            pnl_hoTenNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_hoTenNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_hoTenNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pnl_formNV.add(pnl_hoTenNV);
        pnl_formNV.add(filler2);

        pnl_email.setPreferredSize(new java.awt.Dimension(180, 70));

        lbl_mailNV.setForeground(new java.awt.Color(102, 102, 102));
        lbl_mailNV.setText("Email:");

        txt_mailNV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_mailNV.setPreferredSize(new java.awt.Dimension(65, 30));
        txt_mailNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mailNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_emailLayout = new javax.swing.GroupLayout(pnl_email);
        pnl_email.setLayout(pnl_emailLayout);
        pnl_emailLayout.setHorizontalGroup(
            pnl_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_emailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_mailNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(txt_mailNV, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_emailLayout.setVerticalGroup(
            pnl_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_emailLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(pnl_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_mailNV)
                    .addComponent(txt_mailNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        pnl_formNV.add(pnl_email);
        pnl_formNV.add(filler3);

        pnl_soDT.setPreferredSize(new java.awt.Dimension(180, 70));

        lbl_soDT.setForeground(new java.awt.Color(102, 102, 102));
        lbl_soDT.setText("Số điện thoại: ");

        txt_spDT.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_spDT.setPreferredSize(new java.awt.Dimension(280, 30));
        txt_spDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_spDTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_soDTLayout = new javax.swing.GroupLayout(pnl_soDT);
        pnl_soDT.setLayout(pnl_soDTLayout);
        pnl_soDTLayout.setHorizontalGroup(
            pnl_soDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_soDTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_soDT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(txt_spDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_soDTLayout.setVerticalGroup(
            pnl_soDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_soDTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_soDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_soDT)
                    .addComponent(txt_spDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_formNV.add(pnl_soDT);
        pnl_formNV.add(filler9);

        pnl_chucVu.setPreferredSize(new java.awt.Dimension(180, 70));

        lbl_chucVu.setForeground(new java.awt.Color(102, 102, 102));
        lbl_chucVu.setText("Chức vụ:");

        txt_chucVu.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_chucVu.setPreferredSize(new java.awt.Dimension(280, 30));

        javax.swing.GroupLayout pnl_chucVuLayout = new javax.swing.GroupLayout(pnl_chucVu);
        pnl_chucVu.setLayout(pnl_chucVuLayout);
        pnl_chucVuLayout.setHorizontalGroup(
            pnl_chucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_chucVuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_chucVu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(txt_chucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_chucVuLayout.setVerticalGroup(
            pnl_chucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_chucVuLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(pnl_chucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_chucVu)
                    .addComponent(txt_chucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnl_formNV.add(pnl_chucVu);
        pnl_formNV.add(filler10);

        pnl_namSinh.setPreferredSize(new java.awt.Dimension(180, 70));

        lbl_namSinh.setForeground(new java.awt.Color(102, 102, 102));
        lbl_namSinh.setText("Năm sinh: ");

        txt_namSinh.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_namSinh.setPreferredSize(new java.awt.Dimension(64, 30));

        lbl_gioiTinh.setForeground(new java.awt.Color(102, 102, 102));
        lbl_gioiTinh.setText("Giới tính:");

        cmb_gioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cmb_gioiTinh.setPreferredSize(new java.awt.Dimension(72, 30));

        javax.swing.GroupLayout pnl_namSinhLayout = new javax.swing.GroupLayout(pnl_namSinh);
        pnl_namSinh.setLayout(pnl_namSinhLayout);
        pnl_namSinhLayout.setHorizontalGroup(
            pnl_namSinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_namSinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_namSinh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(txt_namSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_gioiTinh)
                .addGap(8, 8, 8)
                .addComponent(cmb_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_namSinhLayout.setVerticalGroup(
            pnl_namSinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_namSinhLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_namSinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_namSinh)
                    .addComponent(txt_namSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_gioiTinh)
                    .addComponent(cmb_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pnl_formNV.add(pnl_namSinh);

        pnl_ttNhanVien.add(pnl_formNV, java.awt.BorderLayout.SOUTH);

        add(pnl_ttNhanVien, java.awt.BorderLayout.EAST);

        pnl_dsNhanVien.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Danh sách nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14), new java.awt.Color(65, 165, 238))); // NOI18N
        pnl_dsNhanVien.setPreferredSize(new java.awt.Dimension(450, 370));
        pnl_dsNhanVien.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tbl_dsNhanVien.setModel(model_dsNhanVien);
        tbl_dsNhanVien.setMaximumSize(new java.awt.Dimension(100, 0));
        jScrollPane1.setViewportView(tbl_dsNhanVien);

        pnl_dsNhanVien.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(pnl_dsNhanVien, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mailNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mailNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mailNVActionPerformed

    private void txt_spDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_spDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_spDTActionPerformed

    private void btn_capNhatMKNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capNhatMKNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_capNhatMKNVActionPerformed

    private void btn_themNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_themNVActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_capNhatMKNV;
    private javax.swing.JButton btn_suaNV;
    private javax.swing.JButton btn_themNV;
    private javax.swing.JButton btn_xoaNV;
    private javax.swing.JComboBox<String> cmb_gioiTinh;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_chucVu;
    private javax.swing.JLabel lbl_gioiTinh;
    private javax.swing.JLabel lbl_hoTen;
    private javax.swing.JLabel lbl_maNV;
    private javax.swing.JLabel lbl_mailNV;
    private javax.swing.JLabel lbl_namSinh;
    private javax.swing.JLabel lbl_soDT;
    private javax.swing.JPanel pnl_Control;
    private javax.swing.JPanel pnl_avata;
    private javax.swing.JPanel pnl_chucVu;
    private javax.swing.JPanel pnl_controlgroup;
    private javax.swing.JPanel pnl_dsNhanVien;
    private javax.swing.JPanel pnl_email;
    private javax.swing.JPanel pnl_formNV;
    private javax.swing.JPanel pnl_hoTenNV;
    private javax.swing.JPanel pnl_maNV;
    private javax.swing.JPanel pnl_namSinh;
    private javax.swing.JPanel pnl_soDT;
    private javax.swing.JPanel pnl_ttNhanVien;
    private javax.swing.JTable tbl_dsNhanVien;
    private javax.swing.JTextField txt_chucVu;
    private javax.swing.JTextField txt_hoTenNV;
    private javax.swing.JTextField txt_maNV;
    private javax.swing.JTextField txt_mailNV;
    private javax.swing.JTextField txt_namSinh;
    private javax.swing.JTextField txt_spDT;
    // End of variables declaration//GEN-END:variables
}
