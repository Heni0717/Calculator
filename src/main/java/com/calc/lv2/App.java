package com.calc.lv2;

import java.util.Scanner;

// Lv2. 클래스를 적용해 기본적인 연산 수행하는 계산기
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // (2) Calulator클래스 활용 : 인스턴스화
        Calculator calc = new Calculator();

        // 최종 기능 : 사칙연산, 계산 결과 조회, 오래된 결과 1개 삭제, 프로그램 종료
        while (true){
            System.out.println("(1):계산 (2):결과 조회 (3):결과 삭제 (4):프로그램 종료");
            int input = sc.nextInt();
            switch (input){
                case 1:
                    // 양의 정수 2개 입력받기
                    System.out.print("첫 번째 수 입력: ");
                    int num1 = sc.nextInt();
                    System.out.print("두 번째 수 입력: ");
                    int num2 = sc.nextInt();
                    // 사칙연산 기호 입력받기
                    System.out.println("사칙연산 기호(+,-,*,/) 입력: ");
                    char operator = sc.next().charAt(0);
                    // 연산, 결과 출력
                    calc.calculator(num1, num2, operator);
                    calc.getResult();
                    break;
                case 2:
                    System.out.println("결과 내역: "+calc.getResultList());
                    break;
                case 3:
                    calc.deleteResult();
                    System.out.println("결과 내역: "+calc.getResultList());
                    break;
                case 4:
                    System.out.println("계산기 프로그램 종료");
                    break;
                default:
                    System.out.println("잘못된 입력");
                    break;
            }
            if (input==4){
                break;
            }
        }
    }
}

