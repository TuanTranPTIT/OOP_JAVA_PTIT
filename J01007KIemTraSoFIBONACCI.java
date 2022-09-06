/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01007.kiem.tra.so.fibonacci;

import java.util.*;

/**
 *
 * @author trantuan
 */
public class J01007KIemTraSoFIBONACCI {
    
    public static String fibo(long n){
        long  a = 0, b = 1;
        long c = 0;
        for(int i = 1; i<=92; i++){
            c = a + b;
            if(n == c){
                return "YES";
            }
            a = b;
            b = c;
        }
        return "NO";
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(n == 0) System.out.println("YES");
            else System.out.println(fibo(n));
        }
    }
    
}