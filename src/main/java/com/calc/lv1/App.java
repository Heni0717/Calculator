package com.calc.lv1;

import java.util.Scanner;

// Lv1. 클래스 없이 기본적인 연산 수행하는 계산기
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // (4-1) 무한으로 계산하는 반복문 - while
        while (true){
            // (1) 양의 정수 2개 입력받기
            System.out.print("첫 번째 수 입력: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 수 입력: ");
            int num2 = sc.nextInt();

            // (2) 사칙연산 기호 입력받기
            System.out.println("사칙연산 기호(+,-,*,/) 입력: ");
            char operator = sc.next().charAt(0);

            // (3) 제어문을 활용해 연산 구현, 결과 출력 - switch
            int result = 0;
            switch (operator){
                case '+':
                    result=num1+num2;
                    break;
                case '-':
                    result=num1-num2;
                    break;
                case '*':
                    result=num1*num2;
                    break;
                case '/':
                    if(num2!=0){
                        result=num1/num2;
                    }else{
                        // 연산오류 발생 시 오류 출력(예; 나눗셈 연산에서 분모에 0이 입력될 수 없음)
                        System.out.println("나눗셈 연산오류: 분모에 0 입력 불가");
                        continue;
                    }
                    break;
                default:
                    System.out.println("연산기호 입력 오류");
            }

            // (4-2) exit 입력시 반복문 종료
            System.out.println("결과 : "+result);
            System.out.println("더 계산하려면 아무거나 입력 (exit 입력 시 종료)");
            String exit = sc.next();

            if(exit.equals("exit")){
                System.out.println("계산기 프로그램 종료");
                break;
            }
        }
    }
}
