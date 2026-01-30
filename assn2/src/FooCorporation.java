import java.util.Scanner;

class FooCorporation {
           public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
               System.out.println("Enter base pay and hours worked");
               double basePay = input.nextDouble();
               double hours = input.nextDouble();
               pay(basePay,hours);
           }
           public static void pay(double basePay,double hoursWorked){
               if(basePay<8.00){
                   System.out.println("Error! The basePay is less than 8.00");
                   return;
               }
               if(hoursWorked>60){
                   System.out.println("Error! The hoursWorked is greater than 60");
                   return;
               }
               if(hoursWorked<0){
                   System.out.println("Error! The hoursWorked is negative");
                   return;
               }
               if(hoursWorked<=40){
                   System.out.println("An employee gets paid "+hoursWorked*basePay);
               }
               else {
                   System.out.println("An employee gets paid " + ((hoursWorked - 40) * basePay * 1.5 + 40 * basePay));
               }
           }
}
//public class FooCorporation {
//    // 定义常量：将业务规则与计算逻辑分离
//    // final static 表示这些值是不可修改的物理常数
//    final static double MIN_WAGE = 8.00;
//    final static int MAX_HOURS = 60;
//    final static int REGULAR_HOURS = 40;
//    final static double OVERTIME_RATE = 1.5;
//
//    public static void main(String[] args) {
//        // ... 输入处理 ...
//    }
//
//    public static void pay(double basePay, double hoursWorked) {
//        // 使用常量代替魔法数字，逻辑一目了然
//        if (basePay < MIN_WAGE) {
//            System.out.println("Error: Base pay strictly less than $" + MIN_WAGE);
//            return;
//        }
//        // ...
//
//        if (hoursWorked <= REGULAR_HOURS) {
//             System.out.println("Pay: " + (hoursWorked * basePay));
//        } else { // 加上大括号，提升安全性
//             double overtimeHours = hoursWorked - REGULAR_HOURS;
//             double totalPay = (basePay * REGULAR_HOURS) + (overtimeHours * basePay * OVERTIME_RATE);
//             System.out.println("Pay: " + totalPay);
//        }
//    }
//}