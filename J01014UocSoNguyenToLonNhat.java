/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01014.uoc.so.nguyen.to.lon.nhat;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01014UocSoNguyenToLonNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0 ){
            long m = sc.nextLong();
            long n = m;
            long x = 0;
            for( long i = 2 ; i <= Math.sqrt(m) ; i++ ){
                while( n % i == 0 ){
                    n /= i;
                    x = i;
                }
            }
            if( n > Math.sqrt(m) ) System.out.println(n);
            else System.out.println(x);
        }
    }
    
}
