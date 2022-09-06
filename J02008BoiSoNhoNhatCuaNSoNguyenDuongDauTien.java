/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02008.boi.so.nho.nhat.cua.n.so.nguyen.duong.dau.tien;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J02008BoiSoNhoNhatCuaNSoNguyenDuongDauTien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for(int i = 2 ; i < n+1 ; i++)
                a[i] = i;
            for(int i = 2 ; i < n+1 ; i++){
                for(int j = i+1 ; j < n+1 ; j++){
                    if(a[j] % a[i] == 0){
                        a[j] /= a[i];
                    }
                }
            }
            long res = 1;
            for(int i = 2 ; i < n+1 ; i++){
                res *= a[i];
            }
            System.out.println(res);
        }
    }
    
}