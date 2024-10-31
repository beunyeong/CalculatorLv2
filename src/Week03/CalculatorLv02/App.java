package Week03.CalculatorHomework02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String exit;  // 끝내는 변수
        String choiceremove;  //진행 여부 확인 변수

        do {
            System.out.println("첫번째 숫자를 입력하세요");
            int firstNumber = scanner.nextInt();

            System.out.println("연산자를 입력하세요(+,-,*,/)");
            char operator = scanner.next().charAt(0);

            System.out.println("두번째 숫자를 입력하세요");
            int secondNumber = scanner.nextInt();

            System.out.println(calculator.calculate(firstNumber,operator,secondNumber));
            calculator.getResultList();  //저장된 데이터 출력

            scanner.nextLine();   //버퍼비우기


            //저장된 결과를 확인하고 삭제하는 반복문
            while (true) {
                System.out.print("이전 결과를 삭제하시겠습니까? / remove 입력 시 삭제 : ");
                choiceremove = scanner.nextLine();
                if (choiceremove.equals("remove")) {
                    calculator.getResultList();  //이후의 저장된 연산 결과 출력
                    calculator.setRemoveResult();  //첫 번째 데이터를 삭제
                } else {
                    break;
                }
            }

            System.out.println("종료를 원하면 'exit'를 입력하세요 / 계속하려면 아무 키나 입력하세요 : ");
            scanner.nextLine();
            exit = scanner.nextLine();

        } while (!"exit".equals(exit));


    }
}