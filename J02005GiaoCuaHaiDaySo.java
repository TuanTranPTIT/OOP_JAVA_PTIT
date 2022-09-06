/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02005.giao.cua.hai.day.so;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J02005GiaoCuaHaiDaySo {

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
        Arrays.sort(a);
        Arrays.sort(b);
        int key = 0;
        for(int i = 0 ; i < n ; i++){
            if(key == 1) System.out.print(" ");
            key = 0;
            for(int j = 0 ; j < m ; j++){
                if(i < n-1)
                    if(a[i] == a[i+1]) 
                        break;
                if(a[i] == b[j]){
                    System.out.print(a[i]);
                    key = 1;
                    break;
                }
            }
        }
    }
    
}
