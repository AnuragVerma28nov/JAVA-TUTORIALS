package Module_5_CONDITIONALS;

import java.util.Scanner;

public class ProfitLoss {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter cost price: ");
         double  cp= sc.nextDouble ();

         System.out.print("Enter selling price: ");
         double  sp = sc.nextDouble();

         if( sp < cp){
             double totalLoss = cp - sp;
             System.out.print("Total Loss: " + totalLoss);
         } if( sp == cp){
             System.out.print("No Profit.No Loss.");
         }else{
             double totalProfit = sp - cp;
             System.out.print("Total Profit: " + totalProfit);
         }

         sc.close();
    }
}
