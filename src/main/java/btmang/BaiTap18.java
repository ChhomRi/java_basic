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
public class BaiTap18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a;
        int n;
        Scanner sc = new Scanner(System.in);
        n = docSoPhanTu(sc);
        a = new int[n];
        nhapMang(a, sc);
        xuatMang(a);
        System.out.println("Cac phan tu khong phai la so nguyen to:");
        lietKeKhongPhaiSoNguyenTo(a);
        double tb = tinhTBSoNguyenTo(a);
        System.out.println("Gia tri trung binh cua cac so nguyen to:" + tb);
        
    }
    //Định nghĩa phương thức nhập mảng
    public static void nhapMang(int[] a, Scanner sc){
        for (int i = 0; i <a.length; i++){
            System.out.print("Cho biet gia tri a["+ i +"]:");
            a[i] = sc.nextInt();
            
        }
    }
     //Định nghĩa phương thức xuất mảng
    public static void xuatMang(int[] a){
        System.out.print("Mang so nguyen:");
        for (int x : a){
            System.out.print(x +" ");
        }
        System.out.println();
    }
    //Định nghĩa phương thức đọc số phân tử của mảng
    public static int docSoPhanTu(Scanner sc){
        int n;
        do{
            System.out.print("Cho biet so phan tu mang (1 <= n <=50):");
            n = sc.nextInt();
            
        } while (n < 1 || n > 50);
        return n;
    }
    //Định nghĩa phương thức kiểm tra là số nguyên tố
    public static boolean laSoNguyenTo(int x){
        if (x<=1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++){
            if (x % i == 0) return false;
            
        }
        return true;
    }
    //Định nghĩa phương thức liệt kê các số nguyên tử không phải số nguyên tố
    public static void lietKeKhongPhaiSoNguyenTo(int[] a){
        for (int x : a){
            if (!laSoNguyenTo(x)){
                System.out.println(x +"");
            }
        }
        System.out.println();
    }
    //Định nghĩa phương thức tính giá trị trung bình của các  số nguyên tố
    public static double tinhTBSoNguyenTo(int[] a){
        double sum = 0;
        int count = 0;
        for (int x : a){
            if(laSoNguyenTo(x)){
                sum += x;
                count++;
            }
        }
        return (count == 0) ? 0 : sum / count;
    }
}
