/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01018.so.khong.lien.ke;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01018SoKhongLienKe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0 ){
            String s = sc.next();
            int l = s.length();
            char[] c = s.toCharArray();
            int cnt = 0;
            int key = 0;
            for(int i = 0 ; i < l ; i++ ){
                cnt += (c[i] - '0');
            }
            for(int i = 0 ; i < l - 1 ; i++ ){
                int x = (c[i] - '0') - (c[i+1] - '0');
                if( x != 2 && x != -2 ){
                    key = 1;
                    break;
                }
            }
            if( cnt % 10 == 0 && key == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
