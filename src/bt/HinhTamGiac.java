/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author tqtr
 */
public class HinhTamGiac implements HinhHoc {
    
    //properties
    private double a,b,c;

    
    //methods
    
    @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap day: ");
        a = scanner.nextDouble();
        System.out.print("Nhap canh ben: ");
        b = scanner.nextDouble();
        System.out.print("Nhap canh con lai: ");
        c = scanner.nextDouble();
    }

    @Override
    public void Xuat() {
        System.out.print("Day: " + a + "hai canh con lai:" + b + "\t" + c);
                 
    }
    
    @Override
    public double DienTich() {
        double p = (a + b  +c ) / 2;
        double h = 2 * (Math.sqrt(p*(p -a )*(p -b)*(p -c ))/ a);
        
        return (a * h) /2;
    }

    @Override
    public double ChuVi() {
        return a + b + c;
    }
    
    
    public boolean KiemTraTamGiacDeu()
    {
       return a == b && a == c;
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }

    
}
