/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btmang;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BaiTap20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int []a;
       
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so luong phan tu n : ");
            n = sc.nextInt();
        } while (n < 1 || n > 20);
       
        //Cap nhat so phan tu
        a=new int[n];
        NhapMang(a, sc);      
         System.out.print("Nhap so nguyen x: ");
        int x = sc.nextInt();
        int b = TimViTriDauTien(a, x);
        if (b == -1) {
            System.out.println(x + " khong xuat hien trong mang.");
        } else {
            System.out.println(x + " xuat hien dau tien tai vi tri: " + b);
        }
        if (KiemTraTinhtangDan(a)) {
            System.out.println("Mang co tinh chat tang dan.");
        } else {
            System.out.println("Mang khong co tinh chat tang dan.");
        }
    }
    public static void NhapMang(int[] a,Scanner sc){
        for(int i=0;i<a.length;i++){
            System.out.print("Cho biet gia tri a["+i+"]:");
            a[i]=sc.nextInt();
        }
       
    }
    private static int TimViTriDauTien(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    private static boolean KiemTraTinhtangDan(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }
 }
    

