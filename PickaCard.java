// Cole Petty
// APCS
// Pick a card, any card!

import java.util.Random;
import java.lang.String;

public class PickaCard
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
  public static int hearts;
  public static int clubs;
  public static int spades;
  public static int diamonds;

   public static void main(String[] args)
   {
   int var = 0;
   while (var < 100)
    {
    var++;
      
    // System.out.println ("You pulled a: " );
    Random card = new Random();
    int whatCard = card.nextInt(52)+1;

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
    else 
    {
      System.out.print ("");  
    }
    
    System.out.print (" of " );
    Random suit = new Random();
    int whatSuit = suit.nextInt(3)+1;
    
    if (whatSuit == 1)
    {
      System.out.print("Hearts");
    }
    if (whatSuit == 2)
    {
      System.out.print("Clubs");
    }
    if (whatSuit == 3)
    {
      System.out.print("Diamonds");
    }
    if (whatSuit == 4)
    {
      System.out.print("Spades");
    }
    /*
    if (var == 100)
    {
    double ace1 = (ace/var) * 100;
    double two1 = (two/var) * 100;
    double three1 = (three/var) * 100;
    double four1 = (four/var) * 100;
    double five1 = (five/var) * 100;
    double six1 = (six/var) * 100;
    double seven1 = (seven/var) * 100;
    double eight1 = (eight/var) * 100;
    double nine1 = (nine/var) * 100;
    double ten1 = (ten/var) * 100;
    double jack1 = (jack/var) * 100;
    double queen1 = (queen/var) * 100;
    double king1 = (king/var) * 100;
    double hearts1 = (hearts/var) * 100;
    double clubs1 = (clubs/var) * 100;
    double spades1 = (spades/var) * 100;
    double diamonds1 = (diamonds/var) * 100;
    
    System.out.print("Ace % chance: " + ace1 + " ");
    System.out.print("Two % chance: " + two1 + " ");
    System.out.print("Three % chance: " + three1 + " ");
    System.out.print("Four % chance: " + four1 + " ");
    System.out.print("Five % chance: " + five1 + " ");
    }
 //   */
    else 
    {
      System.out.println ("");  
    }

   }

  }
    
}