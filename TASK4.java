import java.util.*;
import java.util.Scanner.*;
public class TASK4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any one of the following options");
        System.out.println("1. USD to $");
        System.out.println("2. $ to USD");
        System.out.println("3. $ to USD");

        int exchange = sc.nextInt();
        switch(exchange) {
            case 1 : {
                System.out.println("Enter the number of USD");

                double usd = sc.nextDouble();

                if(usd>=0){
                    System.out.println(usd + "USD is" + usd*0.908 + "$.");
                }

                else{
                    System.out.println("Please put number of USD");

                }
            }
            break;
            case 2: {
            System.out.println("Enter the number of $");
            double  euro = sc.nextDouble();

            if (euro>=0){
                System.out.println(euro + "$ is" + euro*1.101 + "USD.");
                
            }
            }
        }


    }
}