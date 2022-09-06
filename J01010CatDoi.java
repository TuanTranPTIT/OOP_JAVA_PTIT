/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01010.cat.doi;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01010CatDoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0){
            String s = sc.next();
            int l = s.length();
            int x = 20;
            char[] c = s.toCharArray();
            for( int i = 0 ; i < l ; i++ ){
                if( c[i] == '0' || c[i] == '8' || c[i] == '9' ){
                    c[i] = '0';
                }
                if( c[i] == '1' && x > i){
                    x = i;
                }
                if(c[i] != '0' && c[i] != '1' && c[i] != '8' && c[i] != '9'){
                    x = 20;
                    break;
                }
            }
            if(x == 20){
                System.out.print("INVALID");
            }
            else 
                for( int i = x ; i < l ; i++ )
                    System.out.print(c[i]);
            System.out.print("\n");
        }
    }
    
}
