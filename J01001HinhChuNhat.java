
package j01001.hinh.chu.nhat;

import java.util.Scanner;
public class J01001HinhChuNhat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 0 || b <= 0 )
            System.out.println(0);
        else
            System.out.printf("%d %d", (a+b)*2, a*b);
    }
    
}
