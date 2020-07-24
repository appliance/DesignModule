import java.util.Scanner;
/**
 * @author: JieCao
 * @date: 2020-07-24
 * @conclusion: 时常考虑让代码容易维护，扩展和复用。
 *     1、面向对象编程思想：封装、继承、多态
 *     2、界面逻辑与运算逻辑分离
 *     3、相似功能提取，抽象类封装(考虑逻辑运算中重复相似的部分进行抽象提取)
 *     4、继承抽象类与多态降低耦合提高程序的扩展能力
 * **/


public class Main {

    public static void main(String[] args) {
        // write your code here
        String flag = "Y";
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Please input the first operation number:");
            double firstNum = scanner.nextDouble();
            System.out.println("Please input the sign of operation:");
            String sign = scanner.next();
            System.out.println("Please input the second operation number:");
            double secondNum = scanner.nextDouble();
            double result = 0;
            Operation operation = OperationFactory.createOperation(sign);
            result = operation.getResult(firstNum,secondNum);
            System.out.printf("%f %s %f = %f /n",firstNum,sign, secondNum,result);
            System.out.println();
            System.out.println("if you want to go on please input Y or input N");
            flag = scanner.next();
        }while ("Y".equals(flag));
    }
}
