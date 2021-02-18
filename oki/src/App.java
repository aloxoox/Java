import java.util.Scanner;

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
/*
    System.out.println("Podaj pierwszą liczbę");        //switch
    int a = scanner.nextInt();
    System.out.println("Podaj operator: '+','-'','*','/'','%'");
    scanner.nextLine(); 
    String op = scanner.nextLine();
    System.out.println("Podaj drugą liczbę");      
    int b = scanner.nextInt();
    switch(op){
      case "+":
      System.out.println("Wynik to: " +(a+b)+ ".");
        break;
    case "-":
      System.out.println("Wynik to: " +(a-b)+ ".");
       break;
    case "*":
    System.out.println("Wynik to: " +(a*b)+ ".");
       break;
    case "/":
    System.out.println("Wynik to: " +(a/b)+ ".");
      break;
    case "%":
    System.out.println("Wynik to: " +(a%b)+ ".");
       break;
    default: 
    System.out.println("Podano zły operator");
       break;
    }
    */

    /*String[] uczniowie = { "Jaś", "Staś", "Małgosia"};
    System.out.println( uczniowie[2]); //osoba numer 2
    System.out.println( uczniowie.length); //długość (ile jest wszystkich danych)
    */
   /* int[][][] students = {
      {
         {1,2,3},
         {4,5,6}
      },
      {
         {7,8,9},
         {10,11,12},
      }
    };
   System.out.println( students[1][1][1]);
    */




    //PĘTLE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
   
    /*
    String[] licz = {"zero", "jeden", "dwa","trzy"};
    for(String l : licz){
    //   System.out.println("Wykonuje się!");
   //System.out.println(l);//wyrzuca wszystkie elementy tablicy
//deklaracja ze i będzie 0, ma się wykonywać jeżeli jest mniejsza od 4,
   for(int i=-0; i < 4; i++){
      System.out.println(i);
   }
   for(int i = 0; i < licz.length; i++){
      //System.out.println(i);
      System.out.println(i+": "+licz[i]);
   }
    }*/

   

    /*String[][] dane = {
      {"Więcej niż jedno zwierzę","stado","klucz","dwa","owca","lama"},
      {"Sporty na s","sztafeta","skok o tyczce", "skoki narciarskie", "sumo", "szachy"}
    };
    int wynik = 0;
    for(int i = 0; i < dane.length; i++){
      System.out.println(dane[i][0]); 
      String odp = scanner.nextLine(); 
      boolean isAnswerCorrect = false;
      for(int it = 1; it < dane[i].length; it++){
        if(dane[i][it].equals(odp)){
          isAnswerCorrect = true;
          System.out.println( "BRZDĘK" );
          wynik += it*10;
        }
      }
      if(!isAnswerCorrect){
        System.out.println("X");
      }
    }      
    System.out.println("Twój wynik to "+wynik);
    */

   
/*
    Math.max(5,10); //wieksza liczba 
    Math.min(5, 10); // mniejsza
    Math.sqrt(64);
    Math.abs(-4.7);
    Math.random();
    int randomNum = (int) (Math.random()* 101);
  
*//*
    int random = (int)(Math.random() * 11) + 5;
    System.out.println(random);
*/

// WHILE

/*
int nr = 5;
while(nr < 10){
  System.out.println("Wykonuje pętle!" +nr+".");
  nr++;
}*/
/*//While Do
do{
    System.out.println("Wykonuje pętle:" +nr+".");
    nr++;
  }while(nr > 10);
*/

/*//BREAK
int nr = 0;
do{ 
  System.out.println("Wykonuje petle nr: "+nr+".");
  nr++;
  if(nr==4){
    break;    //break służy do kończenia pętli
  }
}while(nr < 10);
*/


/*//CONTINUE  //wyrzuca interpreter i 
int nr = 0;
do{
  nr++;
  if(nr==4){
    continue;
  }
  System.out.println("Wykonuje petle nr: "+nr+".");
}
while(nr < 10);
int nr = 0;
do{
  nr++;
  if(nr % 2 == 0){
    continue;
  }
  System.out.println("Wykonuje petle nr: "+nr+".");
}
while(nr < 10);
*/

/* //Zgadywanka

int random = (int)(Math.random() * 101);


int szansa = 1;

while(szansa <=7)
{
  System.out.println("szansa nr: "+szansa);
  int odp = scanner.nextInt();
  if(odp < random)
  {
    System.out.println("Liszba jest większa");
  }
  else if(odp > random)
  {
    System.out.println("Liczba jest mniejsza");
  }
  else {
    System.out.println("TAK! To: "+ random+".");
  }

  szansa++;
}
System.out.println("Liczba to:"+random+".");

*/



    //scanner.close();
  }
}