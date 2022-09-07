/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03004.chuan.hoa.xau.ho.ten.pkg1;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J03004ChuanHoaXauHoTen1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0 ) {
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+");
            StringBuilder res = new StringBuilder();
            for (String item : s) {
                char[] word = item.toCharArray();
                word[0] = Character.toUpperCase(word[0]);
                res.append(new String(word));
                res.append(' ');
            }
            System.out.println(res.toString().trim());
        }
    }
    
}
