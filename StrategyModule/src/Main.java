import java.util.Scanner;

/**
 * @author: jiecao
 * @date: 2020/7/25
 * @conclusion:
 *
 * **/

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String door = "Y";
        double price = 0;
        int number = 0;
        double totalPrice = 0;
        String record = "";
        do{
            System.out.println("please input the name of the goods:");
            String name = scanner.next();
            System.out.println("please input the price of the goods:");
            price = scanner.nextDouble();
            System.out.println("please input the total number of the goods:");
            number = scanner.nextInt();

            // discount
            System.out.println("please input the discount of the goods:");
            System.out.println("*******dicount menu*******");
            System.out.println("1：normal");
            System.out.println("2：more than 300 renturn 100");
            System.out.println("3: 8 discount");
            System.out.println("**************************");
            int discount = scanner.nextInt();

            CashContext cashContext = null;
            switch (discount){
                case 1:
                    cashContext = new CashContext("normal");
                    break;
                case 2:
                    cashContext = new CashContext("more than 300 return 100");
                    break;
                case 3:
                    cashContext = new CashContext("8 discount");
                    break;
            }

            totalPrice += cashContext.getResult(number * price);
            record += "you have bought " + number +" "+ name + " currently." + "\n";
            System.out.print(record);
            System.out.println("the totoal money is " + totalPrice);
            System.out.println("if you wanna go on, please input Y or N");
            door = scanner.next();
        }while("Y".equals(door));

    }


}
