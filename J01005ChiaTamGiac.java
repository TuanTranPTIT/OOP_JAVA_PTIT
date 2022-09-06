/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01005.chia.tam.giac;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01005ChiaTamGiac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0 ){
            float n = sc.nextFloat();
            float h = sc.nextFloat();
            for(float i = 1; i <= n-1 ; i++){
                System.out.printf("%.6f ", (h*Math.sqrt(i))/Math.sqrt(n));
            }
            System.out.print("\n");
        }
    }
    
}
