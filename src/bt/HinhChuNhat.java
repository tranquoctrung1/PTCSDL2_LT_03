/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt;

import java.util.Scanner;

/**
 *
 * @author tqtr
 */
public class HinhChuNhat implements HinhHoc {

    // properties
    private double dai;
    private double rong;
    
    
    // methods
    
     @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        rong = scanner.nextDouble();
    }

    @Override
    public void Xuat() {
       System.out.print("Chieu dai: " + dai + "Chieu rong: " + rong);
    }
    
    @Override
    public double DienTich() {
        return dai * rong;
    }

    @Override
    public double ChuVi() {
        return (dai + rong) * 2;
    }
    
    public boolean KiemTraHinhVuong()
    {
        return dai == rong;
    }

    /**
     * @return the dai
     */
    public double getDai() {
        return dai;
    }

    /**
     * @param dai the dai to set
     */
    public void setDai(double dai) {
        this.dai = dai;
    }

    /**
     * @return the rong
     */
    public double getRong() {
        return rong;
    }

    /**
     * @param rong the rong to set
     */
    public void setRong(double rong) {
        this.rong = rong;
    }
    
}
