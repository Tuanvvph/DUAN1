/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.khuyenmai;
import java.sql.*;
import java.util.List;
import untility.DBConText;

/**
 *
 * @author ACER
 */
public class khuyenmaiservice {

    public ArrayList GetAllData() {
        ArrayList<khuyenmai> km = new ArrayList<>();
        String sql = "select * from DOTGIAMGIA";
        Connection cn = DBConText.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                khuyenmai s = new khuyenmai();
                s.setMaKhuyenMai(rs.getString("MADOTGIAMGIA"));
                s.setTenKhuyenMai(rs.getString("TENDOTGIAMGIA"));
                s.setNgayBatDau(rs.getString("NGAYBATDAU"));
                s.setNgayKetThuc(rs.getString("NGAYKETTHUC"));
                s.setSoTienGiam(rs.getString("SOTIENGIAM"));
                s.setDangHOATDONG(rs.getBoolean("DANGHOATDONG"));
                km.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return km;
    }

    public Integer ADD(khuyenmai km) {
        Integer row = null;
        String sql = "INSERT INTO DOTGIAMGIA (MADOTGIAMGIA, TENDOTGIAMGIA, NGAYBATDAU, NGAYKETTHUC, SOTIENGIAM, DANGHOATDONG)\n"
                + "VALUES (?,?,?,?,?,?)";
        Connection cn = DBConText.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, km.getMaKhuyenMai());
            pstm.setString(2, km.getTenKhuyenMai());
            pstm.setString(3, km.getNgayBatDau());
            pstm.setString(4, km.getNgayKetThuc());
            pstm.setString(5, km.getSoTienGiam());
            pstm.setBoolean(6, km.isDangHOATDONG());
            row = pstm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }

    public Integer DELETE(khuyenmai km) {
        Integer row = null;
        String sql = "DELETE FROM DOTGIAMGIA WHERE MADOTGIAMGIA =?";
        Connection cn = DBConText.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, km.getMaKhuyenMai());
            row = pstm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }

    public Integer UPDATE(khuyenmai km) {
        Integer row = null;
        String sql = "update DOTGIAMGIA set TENDOTGIAMGIA =? , NGAYBATDAU =? , NGAYKETTHUC =?, SOTIENGIAM =?, DANGHOATDONG =?\n"
                + "	WHERE MADOTGIAMGIA =?";
        Connection cn = DBConText.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(6, km.getMaKhuyenMai());
            pstm.setString(1, km.getTenKhuyenMai());
            pstm.setString(2, km.getNgayBatDau());
            pstm.setString(3, km.getNgayKetThuc());
            pstm.setString(4, km.getSoTienGiam());
            pstm.setBoolean(5, km.isDangHOATDONG());
            row = pstm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }

    public List<khuyenmai> TimkiembyMa(String MaKhuyenMai) {
        List<khuyenmai> ls = new ArrayList<>();
        String sql = "select * from DOTGIAMGIA where MADOTGIAMGIA like '%"+MaKhuyenMai+"%'";
        Connection cn = DBConText.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                khuyenmai km = new khuyenmai();
                km.setMaKhuyenMai(rs.getString(1));
                km.setTenKhuyenMai(rs.getString(2));
                km.setNgayBatDau(rs.getString(3));
                km.setNgayKetThuc(rs.getString(4));
                km.setSoTienGiam(rs.getString(5));
                km.setDangHOATDONG(rs.getBoolean(6));
                ls.add(km);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ls;
    }
}
