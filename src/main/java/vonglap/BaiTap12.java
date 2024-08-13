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
public class BaiTap12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n=sc.nextInt();
         if (n <= 0) {
            System.out.println("So phai lon hon 0.");
        } else {
            TimSoLonNhoNhat(n);
        }
    }

    public static void TimSoLonNhoNhat(int n) {
        int max = 0;
        int min = 9;
        String numberStr = Integer.toString(n);
        for (char c : numberStr.toCharArray()) {
            int chuso = Character.getNumericValue(c);
            if (chuso > max) {
                max = chuso;
            }
            if (chuso < min) {
                min = chuso;
            }
        }
        System.out.println("Chu so lon nhat la: " + max);
        System.out.println("Chu so nho nhat la: " + min);
        
    }
    
}
