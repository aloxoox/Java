
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class App {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      /* // WPISYWANIE IMIENIA I WYŚWIETLANIE GO
          System.out.println("Podaj swoje imię:");
          String firstName = scanner.nextLine();
          System.out.println("Twoje imię to " + firstName );
          scanner.close();
      */
      /* // KALKULATOR DWÓCH LICZB 
      System.out.println("Podaj pierwszą liczbę");
      int a = scanner.nextInt();
      System.out.println("Podaj drugą liczbę");      
      int b = scanner.nextInt();
      System.out.println(a+" + "+b+" = "+(a+b));      
      */
      /* // IF ELSE
      int nr = 10;
      if(nr == 2){
        System.out.println("Liczba to 2");
      }else if(nr == 3){
        System.out.println("Liczba to 3");
      }else{
        System.out.println("Jakaś inna liczba niż 3 i 2");
      }
      // */




    //DXD

    System.out.println("Podaj pierwszą liczbę");
    Int a = scanner.nextInt();
    System.out.println("Podaj operator:");
    String plus = scanner.nextLine();
    System.out.println("Podaj drugą liczbę");      
    Int b = scanner.nextInt();
    Int dod = a + b;
    Int od = a - b;

    if(String.plus == "+")
    {
      System.out.println("Wynik to: " +dod+ ".");
    }
    else 
    {
      System.out.println("Wynik to: " +od+ ".");
    }


    scanner.close();

}
}