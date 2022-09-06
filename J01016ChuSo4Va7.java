/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01016.chu.so.pkg4.va.pkg7;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01016ChuSo4Va7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt=0;
        while( n > 0){
            if( n%10 == 4 || n%10 == 7)
                cnt++;
            n /= 10;
        }
        if ( cnt == 4 || cnt == 7)
            System.out.println("YES");
        else 
            System.out.println("NO");
    }
    
}
