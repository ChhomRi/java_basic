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
public class BaiTap03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int so1=sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int so2=sc.nextInt();
        System.out.print("Nhap so thu ba: ");
        int so3=sc.nextInt();
        int min = TimSoNhoNhat(so1, so2, so3);
        System.out.println("So nho nhat la: " + min);
    }
    private static int TimSoNhoNhat(int so1, int so2, int so3) {
        int min = so1;
        if (so2 < min) {
            min = so2;
        }
        if (so3 < min) {
            min = so3;
        }
        return min;
    }
    
}
