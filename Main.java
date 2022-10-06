import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);


    // User inputs
    System.out.println("Enter total bill: ");
    double totalBill = scan.nextDouble();

    System.out.println("Enter tip percentage as a whole number without the percent sign: ");
    int tipPercent = scan.nextInt();

    System.out.println("Number of people: ");
    int numPeople = scan.nextInt();


    //Finding tip amount by multiplying bill by tip percentage which is found by dividing user inputted tip percent by 100 
    
    
    double tipAmount = (double) totalBill * ((double) tipPercent / 100);
    
    //Rounded to nearest hundreths by scaling up and then scaling back down
    tipAmount = Math.round(tipAmount * 100.0) / 100.0;

    double tipPerPerson = tipAmount / numPeople;
    
    tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;
    
    //Adding both tip amount and the bill to get bill total after tip is added 
    double billAndTip = tipAmount + totalBill;
    billAndTip = Math.round(billAndTip * 100.0) / 100.0;


    //Dividing final bill amount by the number of people to cost per person 
    double amountPerPerson = (double) billAndTip / numPeople; 
    
    amountPerPerson = Math.round(amountPerPerson * 100.0) / 100.0;
    
    
    System.out.println(String.format("The total tip amount is: $%s. \n The total bill including tip is $%s. \n The tip per person is $%s. \n The total per person is $%s", tipAmount, billAndTip, tipPerPerson, amountPerPerson));
  }
}