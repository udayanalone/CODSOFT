
import java.security.InvalidKeyException;
import java.util.*;

class BankAccount
{
    float balance;
    BankAccount(float amt)
    {
        balance=amt;
    }
}
class Atm
{
    BankAccount ac=new BankAccount(0);
    
    void withDraw(float amt)
    {
        if(amt>0 && ac.balance>=amt)
        {
            
            System.out.println("<---Withdraw in Process--->");
            ac.balance=ac.balance-amt;
            System.out.println("--- Withdraw Completed ---");
        }
        else{
            System.out.println("!!!--- Faliure Due to Insufficent Balance ---!!!");
        }
    }
    void deposit(float amt)
    {
        if(amt>=0)
        {
            System.out.println("<--- Deposit in Process--->");
            ac.balance+=amt;
            System.out.println("--- Deposit Completed ---");
        }
    }
    void getBalance()
    {
        System.out.println("Balance :"+ac.balance);
    }
}

public class AtmInterface {
    public static void main(String[] args) {
        Atm opAtm=new Atm();
        Scanner scanner=new Scanner(System.in);
        int select;
        boolean cont =true;
        float Amount=0;
        
        System.out.println("<---Welcome to ABC Bank Atm--->");
        do{
            System.out.println("(1) Deposite Money");
            System.out.println("(2) Withdraw Momey");
            System.out.println("(3) Check Balance");
            System.out.println("(4) Exit");
            select =scanner.nextInt();
            
            switch(select)
            {
                case 1:
                    System.out.println("Enter Deposite Amount :");
                    Amount=scanner.nextFloat();
                    opAtm.deposit(Amount);;
                    break;
                
                case 2:
                    System.out.println("Enter Withdrawl Amount :");
                    Amount=scanner.nextFloat();
                    opAtm.withDraw(Amount);
                    break;
                
                case 3:
                    opAtm.getBalance();
                    break;
                
                case 4:
                    cont =false;
                    return;
                
                default:
                    System.out.println("!!!--- Invalid Input ---!!!");    
            }
        }while(cont=true);

    }
    
}