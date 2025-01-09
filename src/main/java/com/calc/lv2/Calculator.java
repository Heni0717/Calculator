package com.calc.lv2;

// (1) 사칙연산 수행, 결과값 반환 & 컬렉션 타입에 연산결과 저장하는 Calculator 클래스

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    // (1-1) 결과값, 결과값을 저장하는 컬렉션 타입의 필드 생성
    // (3-1) App의 Main메소드에서 Calculator의 필드값에 직접 접근하지 못하도록 캡슐화 - private 선언
    private Queue<Integer> resultList = new LinkedList<>();
    private int result = 0;

    // (1-2) 양의정수 2개와 연산기호를 입력받아 사칙연산 기능을 수행, 결과값 반환
    public int calculator(int num1, int num2, char operator){
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
                    System.out.println("나눗셈 연산오류: 분모에 0 입력 불가");
                }
                break;
            default:
                System.out.println("연산기호 입력 오류");
        }
        // 컬렉션 필드에 연산 결과 저장하며, 현재의 결과값 출력
        resultList.add(result);
        return result;
    }

    // (3-2) 캡슐화된 컬렉션 필드에 간접 접근하도록 구현 - Getter, Setter
    //  계산 결과들을 저장한 컬렉션 필드
    public Queue<Integer> getResultList(){
        return resultList;
    }
    public void setResultList(Queue<Integer> resultList){
        this.resultList = resultList;
    }
    //  계산 결과 하나를 가져오는 필드 ?
    public void getResult(){
        System.out.println("계산결과: "+result);
    }
    public void setResult(int result){
        this.result = result;
    }

    // (4) 저장된 연산결과중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메소드 구현
    //      -> Queue는 FIFO 구조이기에 poll() 메소드로 가장 먼저 들어온 값 먼저 삭제
    public void deleteResult(){
        resultList.poll();
    }



}
