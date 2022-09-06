/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01026.so.chinh.phuong;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01026SoChinhPhuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0){
            int n = sc.nextInt();
            int sqr_n = (int) Math.sqrt(n);
            if( n == (sqr_n)*(sqr_n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
