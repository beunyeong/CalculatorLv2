package Week03.CalculatorHomework02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 객체를 인스턴스화
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String exit;

        do {
            System.out.println("첫번째 숫자를 입력하세요");
            int firstNumber = scanner.nextInt();

            System.out.println("연산자를 입력하세요(+,-,*,/)");
            char operator = scanner.next().charAt(0);

            System.out.println("두번째 숫자를 입력하세요");
            int secondNumber = scanner.nextInt();

            double result = calculator.calculate(firstNumber,operator,secondNumber);
            System.out.println(result);
            calculator.setResult(result);

            System.out.println("종료를 원하면 'exit'를 입력하세요 / 계속하려면 아무 키나 입력하세요");
            scanner.nextLine();
            exit = scanner.nextLine();

        } while (!"exit".equals(exit));


//        List<Double> resultList = calculator.getResult();
//        for(Double result : resultList) {
//            System.out.println(result);
//        }

    }
}