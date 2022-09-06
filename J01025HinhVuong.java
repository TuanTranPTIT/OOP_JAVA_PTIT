/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01025.hinh.vuong;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01025HinhVuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(); int b1 = sc.nextInt();
        int a2 = sc.nextInt(); int b2 = sc.nextInt();
        int a3 = sc.nextInt(); int b3 = sc.nextInt();
        int a4 = sc.nextInt(); int b4 = sc.nextInt();
        int[] a = {a1, a2, a3, a4};
        int[] b = {b1, b2, b3, b4};
        Arrays.sort(a);
        Arrays.sort(b);
        int x = a[3] - a[0];
        int y = b[3] - b[0];
        if( x > y ) System.out.println(x*x);
        else System.out.println(y*y);
    }
    
}
