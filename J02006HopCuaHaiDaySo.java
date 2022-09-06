/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02006.hop.cua.hai.day.so;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J02006HopCuaHaiDaySo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0 ; i < n ; i++)
            a[i] = sc.nextInt();
        for(int i = 0 ; i < m ; i++)
            b[i] = sc.nextInt();
        int[] c = new int[n+m];
        System.arraycopy(a, 0, c, 0, n);
        System.arraycopy(b, 0, c, n, m);
        Arrays.sort(c);
        for(int i = 0 ; i < n+m-1 ; i++){
            if(c[i] != c[i+1]){
                System.out.print(c[i] + " ");
            }
        }
        if(c[n+m-2] != c[n+m-1]) System.out.println(c[n+m-1]);
    }
    
}
