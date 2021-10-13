/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlwork;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Controlwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("| Введите любое трехзначное число |");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int x = number / 100;
        int y = (number % 100)/10;
        int z = number % 10;
        int answer = x+y+z;
            System.out.println("Сумма:"+answer);
    }
    
}
