/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vonglap;

/**
 *
 * @author ADMIN
 */
public class BaiTap13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             for (int so = 10; so <= 99; so++) {
            int hangchuc = so / 10;
            int donvi = so % 10;
            int kq = hangchuc * donvi;
            int sum = hangchuc + donvi;
            if (kq == 2 * sum) {
                System.out.println( so );
            }
        }
    }
    
}
