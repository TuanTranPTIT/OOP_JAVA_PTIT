/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02017.thu.gon.day.so;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J02017ThuGonDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
        for(int i = 0 ; i < n - 1 ; i++){
            while((a[i] + a[i + 1]) % 2 == 0){
                for(int j = i + 2 ; j < n ; j++){
                    a[j-2] = a[j];
                }
                i = 0;
                n -= 2;
            }
        }
        System.out.println(n);
    }
    
}
