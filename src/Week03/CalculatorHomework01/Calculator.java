package Week03.CalculatorHomework01;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> result = new ArrayList<>();

    public Double calculate(int firstNumber, char operator, int secondNumber) {

        Double result = 0.0;

        switch (operator) {
            case '+':
                result = (double)firstNumber + secondNumber;
                break;
            case '-':
                result = (double)firstNumber - secondNumber;
                break;
            case '*':
                result = (double)firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("오류!: 0으로 나눌 수 없습니다.");
                } else {
                    result = (double)firstNumber / secondNumber;
                    break;
                }
            default:
                System.out.println("오류!: 잘못된 연산자를 입력 했습니다.");
        }
        return result;
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