/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01008.phan.tich.thua.so.nguyen.to;


import java.util.*;
public class J01008PhanTichThuaSoNguyenTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        while( t-- > 0){
            int n = sc.nextInt();
            int sqr = (int) Math.sqrt(n);
            int cnt = 0;
            System.out.print("Test " + x + ":");
            x++ ;
            for (int i = 2 ; i <= sqr ; i++){
                while( n % i == 0){
                    cnt++;
                    n /= i;
                }
                if(cnt > 0) {
                    System.out.print(" " + i + "(" + cnt + ")" );
                }
                cnt = 0;
            }
            if( n > sqr) System.out.print(" " + n + "(1)");
            System.out.print("\n");
        }
    }
    
}
