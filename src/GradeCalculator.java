package src;
import java.nio.InvalidMarkException;
import java.util.*;

class Grade
{
    static void calulate()
    {
        Scanner sca=new Scanner(System.in);
        int sub;
        float sum=0,avg;
        System.out.println("Enter the Total Number of Subject :");
        sub=sca.nextInt();
        float marks[]=new float[sub];
        for(int i=0;i<sub;i++)
        {
            System.out.println("Enter the marks in Subject "+i+1+" :");
            marks[i]=sca.nextFloat();
            try{
                if(marks[i]<0 || marks[i]>100)
                {
                    throw new InvalidMarkException();
                }
            }
            catch(InvalidMarkException me)
            {
                System.out.println("!!!---Enter mark between 0 to 100 ---!!!");
                marks[i]=sca.nextFloat();
            }
            sum+=marks[i];
        }
        avg=sum/sub;
        System.out.println("Total Marks :"+sum);
        System.out.println("Average Percentage :"+ avg);

        if(avg<=100 && avg >90)
        {
            System.out.println("Grade : O");
        }
        else if(avg <=90 && avg >80)
        {
            System.out.println("Grade : A");
        }
        else if(avg <=80 && avg >70)
        {
            System.out.println("Grade : B");
        }
        else if(avg <=70 && avg >60)
        {
            System.out.println("Grade : C");
        }
        else if(avg <=60 && avg >=40)
        {
            System.out.println("Grade : D");
        }
        else{
            System.out.println("Grade : F");
        }
    }
}
public class GradeCalculator {
    public static void main(String[] args) {
        Grade.calulate();
    }
}
