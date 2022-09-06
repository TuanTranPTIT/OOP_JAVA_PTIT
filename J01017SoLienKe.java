/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01017.so.lien.ke;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01017SoLienKe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0){
            String s = sc.next();
            int l = s.length();
            int key = 0;
            char[] c = s.toCharArray();
            for( int i = 0 ; i < l-1 ; i++ ){
                int x = c[i] - '0';
                int y = c[i+1] - '0';
                if( x - y != 1 && x - y != -1 ){
                    key = 1;
                    break;
                }
            }
            if( key == 0 ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
