/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01011.boi.so.chung.uoc.so.chung;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01011BoiSoChungUocSoChung {
    
    public static long ucln(long a, long b){
        if(b == 0)
            return a;
        return ucln(b, a%b);
    }
    
    public static long bcnn(long a, long b){
        return a*b / ucln(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            ucln(a,b);
            System.out.print(bcnn(a,b) + " ");
            System.out.println(ucln(a,b));
        }
    }
    
}
