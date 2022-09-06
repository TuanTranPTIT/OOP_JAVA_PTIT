/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01006.tinh.so.fibonacci;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01006TinhSoFIBONACCI {
    
    public static long fibo(int n){
        long  a = 0, b = 1;
        long c = 0;
        for(int i = 2; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(fibo(n));
        }
    }
    
}
