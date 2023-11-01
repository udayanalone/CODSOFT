import java.util.*;
import java.lang.Math;
class NumberGame
{
    public static void main(String[] args)
    {
        int attempt=5,gus;
        int round =0;
        int se;
        boolean cont;
        Scanner sca1=new Scanner(System.in);
        int b = (int)(Math.random()*(100-1+1)+1);
        System.out.println("Guess the number between 1 to 100 in 5 attempt :");
        do{
            round++;
            for(int i_=attempt;i_>0;i_--)
            {
                System.out.println("Guess Remain :"+i_);
                System.out.println("Enter the Number :");
                gus=sca1.nextInt();
                if(gus>b)
                {
                    System.out.println("Too High !!");
                }
                else if(gus<b)
                {
                    System.out.println("Too Low !!");
                }
                else 
                {
                    System.out.println("Correct !!");
                    System.out.println("You Won in Round :"+round);
                    return;
                }
            }
            System.out.println("<------ To Play Again ------>");
            System.out.print("y (1) / n (0):");
            se=sca1.nextInt();
            if(se==1)
            {cont=true;}
            else{cont=false;}
        }while(cont);
    }
}