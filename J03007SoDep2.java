/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03007.so.dep.pkg2;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J03007SoDep2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s;
        sc.nextLine();
        while(t-- > 0){
            s = sc.nextLine();
            int n = s.length();
            int key = 1;
            int cnt = 0;
            for(int i = 0 ; i < n ; i++){
                if(s.charAt(i) != s.charAt(n-i-1) || s.charAt(0) != '8' ){
                    key = 0;
                    break;
                }
                cnt += s.charAt(i) - '0';
            }
            if(key == 1 && cnt % 10 == 0 ){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    
}
