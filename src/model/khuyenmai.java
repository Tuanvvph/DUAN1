/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class khuyenmai {
    String maKhuyenMai;
    String tenKhuyenMai;
    String ngayBatDau;
    String ngayKetThuc;
    String soTienGiam;
    boolean dangHOATDONG;

    public khuyenmai() {
    }

    public khuyenmai(String maKhuyenMai, String tenKhuyenMai, String ngayBatDau, String ngayKetThuc, String soTienGiam, boolean dangHOATDONG) {
        this.maKhuyenMai = maKhuyenMai;
        this.tenKhuyenMai = tenKhuyenMai;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.soTienGiam = soTienGiam;
        this.dangHOATDONG = dangHOATDONG;
    }

    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getSoTienGiam() {
        return soTienGiam;
    }

    public void setSoTienGiam(String soTienGiam) {
        this.soTienGiam = soTienGiam;
    }

    public boolean isDangHOATDONG() {
        return dangHOATDONG;
    }

    public void setDangHOATDONG(boolean dangHOATDONG) {
        this.dangHOATDONG = dangHOATDONG;
    }
}


