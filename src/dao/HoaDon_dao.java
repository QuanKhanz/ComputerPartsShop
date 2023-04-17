/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interface_dao.HoaDonInterface;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import model.connguoi.KhachHang;
import model.connguoi.NhanVien;
import model.hoadon.HoaDon;
import model.share.ConnectDB;
import java.sql.*;


/**
 *
 * @author macbookk
 */
public class HoaDon_dao implements HoaDonInterface{

    @Override
    public ArrayList<HoaDon> getAllHoaDon() {
        ArrayList<HoaDon> result = new ArrayList<HoaDon>();
        try{
            Statement st = ConnectDB.conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from HoaDon");
            while(rs.next()){
                String maHD = rs.getString("maHoaDon");
                String maNV = rs.getString("maNhanVien");
                String maKH = rs.getString("maKhachHang");
                LocalDate ngayLap = rs.getDate("ngayLap").toLocalDate();
                String pttt = rs.getString("phuongThucThanhToan");
                HoaDon hd = new HoaDon(maHD, ngayLap, pttt, new NhanVien(maNV), new KhachHang(maKH),new ChiTietHoaDon_dao().getChiTietHoaDonTheoMaHoaDon(maHD));
                result.add(hd);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ArrayList<HoaDon> getHoaDonTheoMa(String maHoaDon) {
        ArrayList<HoaDon> result = new ArrayList<HoaDon>();
        try{
            PreparedStatement st = ConnectDB.conn.prepareStatement("Select * from HoaDon where maHoaDon = ?");
            st.setString(1, maHoaDon);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                String maHD = rs.getString("maHoaDon");
                String maNV = rs.getString("maNhanVien");
                String maKH = rs.getString("maKhachHang");
                LocalDate ngayLap = rs.getDate("ngayLap").toLocalDate();
                String pttt = rs.getString("phuongThucThanhToan");
                HoaDon hd = new HoaDon(maHD, ngayLap, pttt, new NhanVien(maNV), new KhachHang(maKH),new ChiTietHoaDon_dao().getChiTietHoaDonTheoMaHoaDon(maHD));
                result.add(hd);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean themHoaDon(HoaDon hoaDon) {
        int n=0;
        try{
            PreparedStatement st = ConnectDB.conn.prepareStatement("insert into HoaDon"
                    +"values(?,?,?,?,?)");
            st.setString(1, hoaDon.getMaHoaDon());
            st.setDate(2, Date.valueOf(hoaDon.getNgayLap()));
            st.setString(3, hoaDon.getPhuongThucThanhToan());
            st.setString(4, hoaDon.getNhanVien().getMaNV());
            st.setString(5, hoaDon.getKhachHang().getMaKH());
           
            n = st.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return n>0;
    }

    @Override
    public boolean xoaHoaDon(String maHoaDon) {
       int n = 0;
        try{
            PreparedStatement st = ConnectDB.conn.prepareStatement("delete from HoaDon where maHoaDon = ?");
            st.setString(1, maHoaDon);
            n = st.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return n>0;
    }

    @Override
    public boolean capNhatHoaDon(String maHoaDon, HoaDon hoaDon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}