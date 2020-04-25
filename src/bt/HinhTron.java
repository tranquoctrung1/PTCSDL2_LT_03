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
public class HinhTron implements HinhHoc {
    //properties
    private double pi = 3.14;
    private double r;
    
    //methods
    @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap r: ");
        r = scanner.nextDouble();
    }

    @Override
    public void Xuat() {
        System.out.print("Ban kinh: "+ r);
    }

    @Override
    public double DienTich() {
        return r * r * pi;
    }

    @Override
    public double ChuVi() {
        return 2 * pi * r;
    }

    /**
     * @return the pi
     */
    public double getPi() {
        return pi;
    }

    /**
     * @param pi the pi to set
     */
    public void setPi(double pi) {
        this.pi = pi;
    }

    /**
     * @return the r
     */
    public double getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(double r) {
        this.r = r;
    }
    
    
}
