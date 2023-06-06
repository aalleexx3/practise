package Tree;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Double sum=0.0;

        while (true){
           try{
               System.out.println("Enter number:");
               String input=scanner.nextLine();
               if(input.equals("ENDSUM")){
                   break;
               }
               else sum+=Double.parseDouble(input);
           }
           catch (Exception e){
               System.out.println("invalid input!");
           }
        }
        System.out.println("Result:"+sum);
    }
}
