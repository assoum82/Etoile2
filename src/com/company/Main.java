
package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        int space, ligne;
        String etoile = "";

        Scanner read = new Scanner(System.in);
        
        System.out.println("Donner le nombre de ligne du triangle ");
        ligne = read.nextInt(); 

        for (int i = 0; i < ligne; i++) {

            space = (ligne-1) - i;

            for (int j = 0; j < space; j++)
            {

                System.out.print(" ");

            }
            etoile = etoile + "* ";
            System.out.println(etoile);

        }
    }
}
