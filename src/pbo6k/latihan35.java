/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class latihan35 {

public static String DEFAULT_POSITIF_ANSWER = "Menikah";

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);

        System.out.println("===== Program Tunjangan =====");
        System.out.print("Berapa Gaji Pokok anda perbulan?\t: ");
        double gaji = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        String status = scannerText.nextLine();        

        Slipgaji payslip = new Slipgaji(gaji, status.equalsIgnoreCase(DEFAULT_POSITIF_ANSWER));
        payslip.calculateSalary();
    }    
}
