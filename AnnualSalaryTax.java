import java.util.Scanner;

public class AnnualSalaryTax{
    public static void main(String[] args){
        final int Max_element = 10;//max number of elements
        Scanner scnr = new Scanner(System.in);//scanner object

        int annualSalary; //annual salary
        double taxRate; //tax rate
        int taxToPay;// tax to pay
        int totalSarlaries;//total salaries
        int totalTaxes;//total taxes
        int numSalaries;// number of salaries
        boolean keepLooking;//loop control variable
        int i; //loop control variable

        int [] salaries =  {20000, 50000, 100000, 9999999}//array of salaries
        double [] taxRates = {0.10, 0.20, 0.30, 0.40};//array of tax rates
        int [] annualSalaries = new int[MAX_ELEMENTS];//array of annual salaries
        int [] taxesToPay = new int[MAX_ELEMENTS]; //array of taxes to pay

        numSalaries = 0;//initialize number of salaries

        System.out.println("\ Enter annual salary (0 ro exit): "); //prompt user
        annualSalary = scnr.nextInt();//get annual salary

        while ((annualSalary > 0) && (numSalaries < MAX_ELEMENTS)){
            i = 0;//initialize loop control variable
            taxRate =  0;//initialize tax rate
            keepLooking = true;//initialize loop control variable

            while ((i < salaryBase.length)&& keepLooking){  //determine tax rate
                if (annualSalary <= salaries[i]){ //determine tax rate
                    taxRate = taxRates[i];//get tax rate
                    keepLooking = false;//exit loop
                }
                else {
                    ++i; //increment loop control variable
                }
            }//end while

            taxToPay = (int)(annualSalary * taxRate); //calculate tax to pay
            annualSalaries[numSalaries] = annualSalary;//store annual salary
            taxesToPay[numSalaries] = taxToPay;//store tax to pay

            System.out.println("Annual salary: " + annualSalary[numSalaries] + 
                                "\tTax rate: " + taxRate + 
                                "\tTax to pay: " + taxesToPay[numSalaries]);//display results
            ++numSalaries;//increment number of salaries

            //get the next annual salary
            if(numSalaries < MAX_ELEMENTS){
                System.out.println("\nEnter annual salary (0 to exit): ");//prompt user
                annualSalary = scnr.nextInt();//get annual salary
            }
        }//end while

        //sum the annual salaries and taxes to pay and print the totals

        totalSalaries =0;//initialize total salaries
        totalTaxes = 0;//initialize total taxes

        for(i =0; i < numSalaries; ++i){ //sum the annual salaries and taxes to pay
            totalSalaries += annualSalaries[i];//sum annual salaries
            totalTaxes += taxesToPay[i];//sum taxes to pay
        }
        System.out.println("\n Total salaries: " + totalSalaries + "\tTotal taxes: " + totalTaxes);//display totals

    }
}//end main
}//end class
