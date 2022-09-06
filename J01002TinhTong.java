/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01002.tinh.tong;

/**
 *
 * @author trantuan
 */
import java.util.Scanner;
public class J01002TinhTong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            System.out.println(n*(n+1)/2);
        }
    }
    
}
