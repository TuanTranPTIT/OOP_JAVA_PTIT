/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02004.mang.doi.xung;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J02004MangDoiXung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0 ){
            int n = sc.nextInt();
            int[] a = new int[n];
            int key = 0;
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0 ; i < n ; i++){
                if(a[i] != a[n-1-i]){
                    key = 1;
                    break;
                }
            }
            if(key == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
