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
public class BaiTap11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int sodao;
        Scanner sc = new Scanner(System.in);
        
        //b1.Tìm số dạo của n
        System.out.print("Cho biet so n:");
        n = sc.nextInt();
        //b2.Tìm số dạo của n
        sodao = TimSoDao(n);
        //b3. Kết luận : đối xứng hay không đối xứng
        if(sodao==n)
        {
            System.out.println(n +" la doi xung ");
            
        }else{
            System.out.println(n +" la khong doi xung ");
        }
                
    }

    private static int TimSoDao(int n) {
      int sodao=0;
        while (n>0) {
            sodao = sodao*10 + n%10;
            n = n/10;
            
        }
        return sodao;
    }
    
}
