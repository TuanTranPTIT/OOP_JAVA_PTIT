/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02104.danh.sach.canh;

import java.util.*;

/**
 *
 * @author trantuan
 */
public class J02104DanhSachCanh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(matrix[i][j] == 1){
                    System.out.println("(" + (i+1) + "," + (j+1) + ")");
                }
            }
        }
    }
    
}
