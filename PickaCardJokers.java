// Cole Petty
// APCS
// Pick a card, any card!

import java.util.Random;
import java.lang.String;

public class PickaCardJokers
{
  public static int ace;
  public static int two;
  public static int three;
  public static int four;
  public static int five;
  public static int six;
  public static int seven;
  public static int eight;
  public static int nine;
  public static int ten;
  public static int jack;
  public static int queen;
  public static int king;
  public static int joker;
  public static int hearts;
  public static int clubs;
  public static int spades;
  public static int diamonds;

   public static void main(String[] args)
   {
   int var = 0;
   double x = 1000;
   while (var < x)
    {
    var++;
    System.out.println(" ");
      
    // System.out.println ("You pulled a: " );
    Random card = new Random();
    int whatCard = card.nextInt(54)+1;

    if (whatCard >= 1 && whatCard <= 4) 
    {
      System.out.print("Ace");
      ace++;
    }
    if (whatCard >= 5 && whatCard <= 8)
    {
      System.out.print("Two");
      two++;
    }
    if (whatCard >= 9 && whatCard <= 12)
    {
      System.out.print("Three");
      three++;
    }
    if (whatCard >= 13 && whatCard <=16)
    {
      System.out.print("Four");
      four++;
    }
    if (whatCard >= 17 && whatCard <=20)
    {
      System.out.print("Five");
      five++;
    }
    if (whatCard >= 21 && whatCard <=24)
    {
      System.out.print("Six");
      six++;
    }
    if (whatCard >= 25 && whatCard <=28)
    {
      System.out.print("Seven");
      seven++;
    }
    if (whatCard >= 29 && whatCard <=32)
    {
      System.out.print("Eight");
      eight++;
    }
    if (whatCard >= 33 && whatCard <=36)
    {
      System.out.print("Nine");
      nine++;
    }
    if (whatCard >= 37 && whatCard <=40)
    {
      System.out.print("Ten");
      ten++;
    }
    if (whatCard >= 41 && whatCard <=44)
    {
      System.out.print("Jack");
      jack++;
    }
    if (whatCard >= 45 && whatCard <=48)
    {
      System.out.print("Queen");
      queen++;
    }
    if (whatCard >= 49 && whatCard <=52)
    {
      System.out.print("King");
      king++;
    }
    if (whatCard >=53 && whatCard <=54)
    {
      System.out.print("JOKER");
      joker++;
//      var += var*var; //uncommenting out this line will make the program stop upon it's first JOKER draw
    }
    else 
    {
      System.out.print ("");  
    }
    
    Random suit = new Random();
    int whatSuit = suit.nextInt(3)+1;
    if (whatCard >=53 && whatCard <=54)
    {
      whatSuit += var*var; //simply prevents a suit from being listed when a JOKER is rolled
    }

    if (whatSuit == 1)
    {
      System.out.print(" of Hearts");
    }
    if (whatSuit == 2)
    {
      System.out.print(" of Clubs");
    }
    if (whatSuit == 3)
    {
      System.out.print(" of Diamonds");
    }
    if (whatSuit == 4)
    {
      System.out.print(" of Spades");
    }
    
    if (var == x)
    {
     
    {
    double ace1 = (ace/x) * 100;
    double two1 = (two/x) * 100;
    double three1 = (three/x) * 100;
    double four1 = (four/x) * 100;
    double five1 = (five/x) * 100;
    double six1 = (six/x) * 100;
    double seven1 = (seven/x) * 100;
    double eight1 = (eight/x) * 100;
    double nine1 = (nine/x) * 100;
    double ten1 = (ten/x) * 100;
    double jack1 = (jack/x) * 100;
    double queen1 = (queen/x) * 100;
    double king1 = (king/x) * 100;
    double joker1 = (joker/x) * 100;
    double hearts1 = (hearts/x) * 100;
    double clubs1 = (clubs/x) * 100;
    double spades1 = (spades/x) * 100;
    double diamonds1 = (diamonds/x) * 100;
   // */
    System.out.println("");
    System.out.println("Ace: " + ace + " ");
    System.out.println("Two : " + two + " ");
    System.out.println("Three : " + three + " ");
    System.out.println("Four : " + four + " ");
    System.out.println("Five : " + five + " ");
    System.out.println("Six : " + six + " ");
    System.out.println("Seven : " + seven + " ");
    System.out.println("Eight : " + eight + " ");
    System.out.println("Nine  : " + nine + " ");
    System.out.println("Ten  : " + ten + " ");
    System.out.println("Jack  : " + jack + " ");
    System.out.println("Queen  : " + queen + " ");
    System.out.println("King  : " + king + " ");
    System.out.println("King  : " + joker + " ");
    System.out.println("");
      
    System.out.println("");
    System.out.println("Ace: " + ace1 + "% draw chance this round");
    System.out.println("Two : " + two1 + "% draw chance this round");
    System.out.println("Three : " + three1 + "% draw chance this round");
    System.out.println("Four : " + four1 + "% draw chance this round");
    System.out.println("Five : " + five1 + "% draw chance this round");
    System.out.println("Six : " + six1 + "% draw chance this round");
    System.out.println("Seven : " + seven1 + "% draw chance this round");
    System.out.println("Eight : " + eight1 + "% draw chance this round");
    System.out.println("Nine  : " + nine1 + "% draw chance this round");
    System.out.println("Ten  : " + ten1 + "% draw chance this round");
    System.out.println("Jack  : " + jack1 + "% draw chance this round");
    System.out.println("Queen  : " + queen1 + "% draw chance this round");
    System.out.println("King  : " + king1 + "% draw chance this round");
    System.out.println("JOKER  : " + joker1 + "% draw chance this round");
    System.out.println("");

    }
 //   */
   }
   }
   }
   
}

  
    
