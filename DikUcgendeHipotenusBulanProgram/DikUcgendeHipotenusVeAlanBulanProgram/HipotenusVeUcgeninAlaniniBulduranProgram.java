package HipotenusBulanProgram;

import java.util.Scanner;

public class HipotenusVeUcgeninAlaniniBulduranProgram {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("üçgenin 1.kenarını giriniz :");
            double a = scan.nextDouble();
            Scanner scann =  new Scanner(System.in);
            System.out.println("üçgenin 2. kenarını giriniz :");
            double b = scan.nextDouble();
            new Scanner(System.in);
            double c = Math.sqrt(a*a+b*b);
            System.out.println("hipotenüs:" + c);
            double u =(a+b+c)/2.0;
            double  ucgeninAlani = Math.sqrt(u*(u-a)*u*b*(u-c));
            System.out.println("üçgenin alanı : "+ ucgeninAlani);


        }
    }


