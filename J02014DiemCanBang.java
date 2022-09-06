/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02014.diem.can.bang;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J02014DiemCanBang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int res = 0;
            int cnt = 0;
            for(int i = 0; i < n ;i++){
                a[i] = sc.nextInt();
                res += a[i];
            }
            int key = 0;
            int x = 0;
            for(int i = 1 ; i < n ; i++){
                cnt += a[i-1];
                if(cnt == (res - a[i])/2){
                    key = 1;
                    x = i+1;
                    break;
                } 
            }
            if(key == 1) System.out.println(x);
            else System.out.println("-1");
        }
    }
    
}
