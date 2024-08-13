/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cautrucrenhanh;

import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BaiTap01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b;
        String kq = "";
        Scanner sc = new Scanner(System.in);
        //b1. nhap he so a,b
        System.out.println("====Giai phuong trinh bac 1====");
        System.out.print("cho biet he so a:");
        a = sc.nextDouble();
        System.out.print("cho biet he so b:");
        b = sc.nextDouble();
        //b2. Giai phuong trinh
        
        if(a==0){
            if(b==0){
                kq="Phuong trinh vo so nghiem";
                
            }else{
                kq = "Phuong trinh vo nghiem";
                
            }
        }else{
            kq="Phuong trinh co nghien x ="+ (-b/a);
        }
        //b3.Xuat ket qua 
        System.out.println(kq);

    }
    
}
