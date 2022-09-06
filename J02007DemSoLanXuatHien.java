/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02007.dem.so.lan.xuat.hien;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J02007DemSoLanXuatHien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i < n ; i++)
                a[i] = sc.nextInt();
            int cnt = 1;
            System.out.println("Test " + x + ":");
            for(int i = 0 ; i < n ; i++){
                cnt = 1;
                for(int j = i+1; j < n ; j++){
                    if( a[i] == a[j] && a[i] != 0){
                        cnt++;
                        a[j] = 0;
                    }
                }
                if(a[i] != 0)
                    System.out.println(a[i] + " xuat hien " + cnt + " lan");
            }
            x++;
        }
    }
    
}
