/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vonglap;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BaiTap09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n;
        int dem;
        
        Scanner sc = new Scanner (System.in);
        //b1 nhap he so a,b
        System.out.println("=====DEM SO UOC SO CUA SO NGUYEN =====");
        System.out.print("Cho biet so n:");
        n = sc.nextInt();
        dem=0;
        for (int i = 1; i<= n; i++){
            if(n%i==0){
                dem++;
            }
            
        }
        System.out.println("so uoc so cua:"+ n + "la" + dem);
        
    }
    
}