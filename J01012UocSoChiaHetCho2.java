/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01012.uoc.so.chia.het.cho.pkg2;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01012UocSoChiaHetCho2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0){
            int n = sc.nextInt();
            if( n % 2 == 1 ) System.out.println("0");
            if( n == 4) System.out.println("2");
            if( n % 2 == 0 && n != 4) {
                int m = n/2;
                int cnt = 1;
                for( int i = 2 ; i <= Math.sqrt(n/2) ; i++){
                    int dem = 1;
                    while( m % i == 0){
                        dem++;
                        m /= i;
                    }
                    cnt *= dem ;
                }
                if(m > Math.sqrt(n/2)) cnt *= 2;
                System.out.println(cnt);
            }
        }
    }
    
}
