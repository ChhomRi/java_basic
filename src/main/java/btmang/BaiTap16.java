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
public class BaiTap16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //khai bao mang luu so nguyen
        int [] a;
          Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so luong phan tu n : ");
            n = sc.nextInt();
        } while (n < 1 || n > 20);
       
        //Cap nhat so phan tu
        a=new int[n];
        NhapMang(a, sc);
        System.out.println("====Mang a====");
        XuatMang(a);
        System.out.print("\nTong mang la: " +TinhTongMang(a));
        System.out.print("\nDuong le la: " +DemDuongLe(a));
        System.out.print("\nPhan tu lon nhat la :" +TimMax(a));
    }
    //Nhap mang
    public static void NhapMang(int[] a,Scanner sc){
        for(int i=0;i<a.length;i++){
            System.out.print("Cho biet gia tri a["+i+"]:");
            a[i]=sc.nextInt();
        }
       
    }
    public static void XuatMang(int []a){
        for(int x :a){
            System.out.print(x+" ");
        }
    }
    public static int TinhTongMang(int[] a){
        int sum=0;
        for(int x:a){
            sum +=x;
        }
        return sum;
    }
    public static int DemDuongLe(int[] a){
        int dem=0;
        for(int x:a){
            if(x>0 && x%2!=0){
                dem++;
            }
        }
        return dem;
    }
    public static int TimMax(int[] a){
        int max=a[0];
        for(int x: a){
            if(x>max){
                max=x;
            }
        }
        return max;
    }
}

    

