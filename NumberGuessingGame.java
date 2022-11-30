//TaskNo-2 #OASISINFOBYTE By NIKHILESH SATHUA
import java.util.Random;
import java.util.*;

public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t------INTRODUCING YOU NIKHILESH'S NUMBER GUESSING GAME------");
        System.out.println("\t\t------LEVELS & RULES FOR GUESSSING GAME-----");
        System.out.println("\t\t------TOTAL THREE LEVELS IN THE GAME-----");
        System.out.println("\t\t------IN EACH LEVEL YOU HAVE TO GUESS THE NUMBER IN THREE CHANCES------");
        System.out.println("\t\t------LET'S START ,HAVE FUN------");
        System.out.println("\t\t------ALL THE BEST------");
        do{
            System.out.println("CHOOSE COMPETENCY LEVEL:");
            System.out.println("1.Beginner\n2.Intermediate\n3.Advanced\n4.Exit");
            System.out.print("Enter Your Choice:");
            int choice=sc.nextInt();
            if(choice==4)
            {
                System.out.println("Thank You For Your Participation");
                break;
            }
           switch(choice)
            {
               case 1:
               {
                System.out.println("You Have Three Chances To Guess The Answer.");
                int i=0,b=0;
                for( i=1;i<=3;i++)
                {
                System.out.print("Guess Any Number Bewtween 1 And 10:");
                  int a=sc.nextInt();
                  Random r=new Random();
                  b = r.nextInt(10);
              if(a==b)
                {
                System.out.println("Hey! Your Guess is Correct !");
                System.out.println();
                break;

                }
              else  if(a>b)
              {
                System.out.println("Your Guess is Higher; Guess Low ");
              }
              else
              {
                System.out.println("Try To Guess High Again");
              }
            
           }
                if(i==4)
                {
                    System.out.println("Number is:"+b);
                }
             break;
           }
               case 2:
               {
                int i=0,b=0;
                System.out.println("Here You Will Have Five Chances To Guess The Exact Number");
                for( i=1;i<=5;i++)
                {
                System.out.print("Guess Any Number Between 1 And 50:");
                int a=sc.nextInt();
                Random r=new Random();
                b=r.nextInt(50);
              if(a==b)
                {
                System.out.println("Congrats! You Have Guessed Correctly");
                System.out.println();
                break;
                }
            else  if(a>b)
            {
                System.out.println("Your Guess is Again Higher ! Guess Low ");
            }
            else
            {
                System.out.println("Guess High!!");
            }
            
                }
                   if(i==4)
                {
                    System.out.println("Number is:"+b);
                }
                   
               
             break;
               
               }
               case 3:
                   
               {
                   int i=0;
                   int b=0;
                           System.out.println("Here You Have Three Chances To Predict The Correct Answer.");
                for( i=1;i<=3;i++)
                {
                System.out.print("Guess Any Number Bewtween 1 and 100:");
                  int a=sc.nextInt();
             Random r=new Random();
             b=r.nextInt(100);
            if(a==b)
            {
                System.out.println("Congrats Your Guess is Correct");
                System.out.println();
                break;
            }
            else  if(a>b)
            {
                System.out.println("Your guess is higher ! Guess Low ");
            }
            else
            {
                System.out.println("Guess high!");
            }
            
                }
                      if(i==4)
                {
                    System.out.println("Number is:"+b);
                }
               
             
                   break;
               }
            
            }
        }while(true);
        sc.close();
        
    }
    
}

