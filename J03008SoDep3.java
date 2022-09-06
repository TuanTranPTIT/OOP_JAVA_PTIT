/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03008.so.dep.pkg3;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J03008SoDep3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s ;
        sc.nextLine();
        while(t-- > 0){
            s = sc.nextLine();
            int l = s.length();
            int key = 1;
            for(int i = 0 ; i < l ; i++ ){
                int x = s.charAt(i);
                if((x != '2' && x != '3' && x != '5' && x != '7') || s.charAt(i) != s.charAt(l-i-1)){
                    key = 0;
                }
            }
            if(key == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
