/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3Input;

import java.util.Scanner;
/**
 *
 * @author Aris Prabowo
 * IF10K
 * 10119914
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan nama anda: ");
        Scanner scanner = new Scanner(System.in);
       
        String nama = scanner.next();
        System.out.println("nama anda adalah : " + nama);
    }
    
}
