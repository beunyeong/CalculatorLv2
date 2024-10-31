package CalculatorLv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 연산 결과를 저장하는 resultList() , 외부에서 접근 할 수 없도록 private 선언
    private List<Double> resultList = new ArrayList<>();

    public Double calculate(int firstNumber, char operator, int secondNumber) {
        switch (operator) {
            case '+':
                resultList.add((double)(firstNumber + secondNumber));
                break;
            case '-':
                resultList.add((double)(firstNumber - secondNumber));
                break;
            case '*':
                resultList.add((double)(firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("오류!: 0으로 나눌 수 없습니다.");
                } else {
                    resultList.add((double)(firstNumber / secondNumber));
                    break;
                }
            default:
                System.out.println("오류!: 잘못된 연산자를 입력 했습니다.");
        }
        return resultList.get(resultList.size()-1);
    }

    //결과를 조회하는 메서드 : getter
    public void getResultList() {
        if (resultList.isEmpty()) {
            System.out.println("현재 계산 결과가 없습니다.");
        } else {
            System.out.println("현재 저장된 데이터");
            for (int i = 0; i < resultList.size(); i++) {
                System.out.println((i + 1) + "번째 연산 결과 : " + resultList.get(i));

            }
        }
    }

    // 저장된 이전 결과를 삭제하는 메서드 : Setter
    public void setRemoveResult(){
        if (resultList.isEmpty()) {
            System.out.print("");
        } else {
            System.out.println("삭제되었습니다.");
            resultList.removeFirst();
        }
    }

}