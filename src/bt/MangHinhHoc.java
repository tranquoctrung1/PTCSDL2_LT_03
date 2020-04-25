/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tqtr
 */
public class MangHinhHoc {
    
    //prooperty
    private ArrayList<HinhHoc> list;
    
    //methods
    public void Nhap()
    {
        Scanner scanner = new Scanner(System.in);
        list = new ArrayList<HinhHoc>();
        do
        {
            System.out.print("Nhap lua chon: 1/ hinh chu nhat\t 2/ hinh tron \t 3/ tam giac\t 0/ thoat: ");
            int chon  = scanner.nextInt();
            
            HinhHoc a;
            if(chon ==  1)
            {
               a = new HinhChuNhat();
                           
                a.Nhap();
                list.add(a);
            }
            else if(chon == 2)
            {
                a = new HinhTron();

                a.Nhap();
                list.add(a);         
            }
            else if(chon == 3 )
            {
                a = new HinhTamGiac();
                            
                a.Nhap();
                list.add(a);
            }
            else 
            {
                System.out.print("Thoat!!");
                break;
            }

        }while(true);
    }
    
    
    public void Xuat()
    {
//        C1:
//        for(int i = 0; i< list.size(); i++)
//        {
//            list.get(i).Xuat();
//        }
//        C2:
        for (HinhHoc item : list) {
            item.Xuat();
        }
    }
    
    public double TongDienTich()
    {
        double s = 0;
        for(HinhHoc item : list)
        {
            s += item.DienTich();
        }
        
        return s;
    }
    
    public double TongChuVi()
    {
        double s = 0;
        for(HinhHoc item : list)
        {
            s += item.ChuVi();
        }
        
        return s;
    }
    
    public double ChuViLonNhat()
    {
        double max = list.get(0).ChuVi();
        
        for(int i = 1; i < list.size(); i++)
        {
            if(max < list.get(i).ChuVi())
            {
                max = list.get(i).ChuVi();
            }
        }
        
        return max;
    }
    
    public double ChuViNhoNhat()
    {
        double min = list.get(0).ChuVi();
        
        for(int i = 1; i < list.size(); i++)
        {
            if(min > list.get(i).ChuVi())
            {
                min = list.get(i).ChuVi();
            }
        }
        
        return min;
    }
    
    public double DienTichLonNhat()
    {
        double max = list.get(0).DienTich();
        
        for(int i = 1; i < list.size(); i++)
        {
            if(max < list.get(i).DienTich())
            {
                max = list.get(i).DienTich();
            }
        }
        
        return max;
    }
    
    public double DienTichNhoNhat()
    {
        double min = list.get(0).DienTich();
        
        for(int i = 1; i < list.size(); i++)
        {
            if(min > list.get(i).DienTich())
            {
                min = list.get(i).DienTich();
            }
        }
        
        return min;
    }
    
    /**
     * @return the list
     */
    public ArrayList<HinhHoc> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<HinhHoc> list) {
        this.list = list;
    }
    
    //constructor
    
    public MangHinhHoc()
    {
        list = null;
    }
}
