package Week03.CalculatorHomework;

import java.util.ArrayList;
import java.util.List;

// 연산 결과는 Calculator 클래스의 연산 결과를 저장하는 필드에 저장
public class Calculator {
    private List<Double> result;

    // 1. 사칙연산을 수행 후, 결과값 반환 메서드
    // 1) 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아-----(완료)
    // 2) 결과 값을 반환하는 메서드와 연산 결과를 저장하는 '컬렉션 타입' 필드를 가진 Calculator 클래스를 생성합니다

    public Double calculate(int firstNumber, char operator, int secondNumber) {

        // 컬렉션 타입: List 사용
        List<Double> result = new ArrayList<>();
        
        switch (operator) {
            case '+':
                result.add((double)(firstNumber + secondNumber));
                break;
            case '-':
                result.add((double)(firstNumber - secondNumber));
                break;
            case '*':
                result.add((double)(firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("오류!: 0으로 나눌 수 없습니다.");
                } else {
                    result.add((double)(firstNumber / secondNumber));
                    break;
                }
            default:
                System.out.println("오류!: 잘못된 연산자를 입력 했습니다.");
        }
        return result.get(result.size()-1);
    }
    // Getter 메서드
    public List<Double> getResult(){
        return result;
    }
    // Setter 메서드
    public void setResult(Double result){
        this.result.add(result);
    }
}


