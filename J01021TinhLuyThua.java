/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01021.tinh.luy.thua;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01021TinhLuyThua {
    
    public static long mod = (long) 1e9 + 7;
    
    public static long poW(long a, long b){
        long res = 1;
        while(b > 0){
            if(b % 2 == 1){
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while( true ){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if( a == 0 && b == 0 ){
                break;
            }
            else{
                System.out.println(poW(a,b));
            }
        }
    }
    
}
