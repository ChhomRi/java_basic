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
public class BaiTap17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        n = docSoPhanTu(sc);
        a = new double[n];
        nhapMang(a, sc);
        xuatMang(a);
        double tb = tinhTB(a);
        System.out.println("\nGia tri trung binh cua mang:"+tb);
        double min = timMin(a);
        System.out.println("Phan tu co gia tri nho nhat:"+min);
        
    }
    //Định nghĩa phương thức nhập mảng
    public static void nhapMang(double[]a, Scanner sc){
        for (int i = 0; i <a.length; i++){
            System.out.print("Cho biet gia tri a["+ i +"]:");
            a[i] = sc.nextDouble();
            
        }
    }
    //Định nghĩa phương thức xuất mảng
    public static void xuatMang(double[] a){
        System.out.print("Mang so thuc:");
        for (double x : a){
            System.out.println(x +" ");
        }
        System.out.println();
    }
    //Định nghĩa phương thức đọc số phân tử của mảng
    public static int docSoPhanTu(Scanner sc){
        int n;
        do{
            System.out.println("Cho biet so phan tu mang (1 <= n <= 20):");
            n = sc.nextInt();
            
        } while (n < 1 || n > 20);
        return n;
    }
    //Định nghĩa phương thức tính giá trị trung bình 
    public static double tinhTB(double[] a){
        double sum = 0;
        for (double x : a){
            sum += x;
            
        }
        return sum / a.length;
    }
    //Định nghĩa phương thức tìm phần tử nhỏ nhất
    public static double timMin(double[] a){
        double min = a [0];
        for (double x : a){
            if (x < min ){
                min = x;
            }
        }
        return  min;
    }
   
}
