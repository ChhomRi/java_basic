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
public class BaiTap04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("====NHAP VAO MOT SO NGUYEN====");
        System.out.println("Nhap so nguyen:");
        n = sc.nextInt();
        if(n%2==0){
            System.out.println("So ban nhap la so chan:");
            
        }else{
            System.out.println("So ban nhap la so le:");
        }
    }
    
}
