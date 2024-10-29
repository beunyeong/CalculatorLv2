package Week03.CalculatorHomework;

import java.util.Scanner;

public class CalculatorLv01 {
    public static void main(String[] args) {


        String exit;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("첫번째 숫자를 입력하세요");
            int firstNumber = scanner.nextInt();
            System.out.println("연산자를 입력하세요(+,-,*,/)");
            char operator = scanner.next().charAt(0);
            System.out.println("두번째 숫자를 입력하세요");
            int secondNumber = scanner.nextInt();

            double answer = 0;
            switch (operator) {
                case '+':
                    answer = firstNumber + secondNumber;
                    break;
                case '-':
                    answer = firstNumber - secondNumber;
                    break;
                case '*':
                    answer = firstNumber * secondNumber;
                    break;
                case '/':
                    if (secondNumber == 0) {
                        System.out.println("오류!: 0으로 나눌 수 없습니다.");
                    } else {
                        answer = (double) firstNumber / secondNumber;
                        break;
                    }
                default:
                    System.out.println("오류!: 잘못된 연산자를 입력 했습니다.");
            }
            System.out.println("정답: " + answer);
            System.out.println(" ");
            System.out.println("종료를 원하면 'exit'를 입력하세요 / 계속하려면 아무 키나 입력하세요");
            scanner.nextLine();

            exit = scanner.nextLine();
        } while (!"exit".equals(exit));

    }
}

