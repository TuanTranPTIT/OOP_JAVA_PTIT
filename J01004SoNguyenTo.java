/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01004.so.nguyen.to;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J01004SoNguyenTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int k = 0;
            int sqr = (int) Math.sqrt(n) ;
            if(n <= 2){
                if(n < 2)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else{
                for(int i = 2 ; i <= sqr ; i++){
                    if(n % i == 0){
                        System.out.println("NO");
                        k = 1;
                        break;
                    }
                }
                if(k == 0)
                    System.out.println("YES");
            }
        }
    }
    
}
