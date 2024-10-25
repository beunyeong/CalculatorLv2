package secondproject;


import java.util.*;

public class numberbaseballgame {
    public static void main(String[] args) {

        System.out.println("즐거운 숫자 야구 게임");
        System.out.println("START~!");

        System.out.println("3자리 숫자가 생성되었습니다.");

        Scanner scanner = new Scanner(System.in); // 1. 자판기 생성
        int[] answerNumber = new int[3]; // 2. 랜덤 3자리 숫자 배열 저장
        int[] inputNumber = new int[3];  // 3. 자판기로 입력 받은 3자리 숫자 배열 저장


        Set<Integer> randomNumber = new HashSet<>();  // 4. 숫자 중복 제거

        // 5. 3가지 숫자 랜덤 지정
        while (randomNumber.size() < 3) {
            int gameNumber = (int) (Math.random() * 9 + 1);
            randomNumber.add(gameNumber);
        }

        System.out.println(randomNumber);  //정답 조회(비황성화)

        System.out.println("중복되지 않은 3개의 정수를 입력해주세요!");
        while (true) {
            System.out.println("백의 자리 숫자를 입력해주세요");
            int inputNumber1 = scanner.nextInt();
            System.out.println("십의 자리 숫자를 입력해주세요");
            int inputNumber2 = scanner.nextInt();
            System.out.println("일의 자리 숫자를 입력해주세요");
            int inputNumber3 = scanner.nextInt();

            if (inputNumber1 < 1 || inputNumber1 > 9 || inputNumber2 < 1 || inputNumber2 > 9 || inputNumber3 < 1 || inputNumber3 > 9) {
                System.out.println("오류!: 1~9까지의 정수를 입력하세요");
                continue;
            }
            if (inputNumber1 == inputNumber2 || inputNumber1 == inputNumber3 || inputNumber2 == inputNumber3) {
                System.out.println("오류!: 서로 다른 숫자를 입력해주세요.");
                continue;
            }

            while (true) {
                int strike = 0;
                int ball = 0;

                for (int i = 0; i < inputNumber.length; i++) {
                    for (int j = 0; j < answerNumber.length; j++) {
                        if (inputNumber[i] == answerNumber[j] && i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }

                if (strike == 3) {
                    System.out.println("정답입니다~!");
                    break;
                } else if (strike == 0 && ball == 0) {
                    System.out.println("OUT!!");
                } else {
                    System.out.println("strike: " + strike + " " + "ball: " + ball + "입니다.");
                }
            }
        }
    }
}




