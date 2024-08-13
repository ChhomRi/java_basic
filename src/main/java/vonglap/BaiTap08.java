/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vonglap;
import  java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BaiTap08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n;
        int sum=0;
        
        Scanner sc = new Scanner (System.in);
        //b1 nhap he so a,b
        System.out.println("=====Tinh tong day so :s=1+2+3+ ....+ n =====");
        System.out.print("Cho biet so n:");
        n = sc.nextInt();
        for (int i = 1; i<= n; i++){
            sum +=i;
            
        }
        System.out.println("Tong day so:" + sum);
        
        
    }
 }
    

