/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01024.so.tam.phan;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01024SoTamPhan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0 ){
            String s = sc.next();
            int l = s.length();
            int key = 0;
            char[] c = s.toCharArray();
            for( int i = 0 ; i < l ; i++ ){
                if( c[i] != '0' && c[i] != '1' && c[i] != '2'){
                    System.out.println("NO");
                    key = 1;
                    break;
                }
            }
            if( key == 0 ) System.out.println("YES");
        }
    }
    
}
