/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01009.tong.giai.thua;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01009TongGiaiThua {
    public static long giaithua(long n){
        long cnt = 0, tong = 1;
        for(long i = 1 ; i <= n ; i++ ){
            tong *= i;
            cnt += tong;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(giaithua(n));
    }
    
}
