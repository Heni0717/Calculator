![header](https://capsule-render.vercel.app/api?type=rounded&color=F8E0E6&height=200&section=header&text=Calculator%20&fontSize=70)

---
## [Spring 5기] CH2 계산기 과제

### 개요

&nbsp;▶️ 목적 : 자바의 기본 문법, 객체지향 프로그래밍 개념 적용

&nbsp;▶️ 접근 방식 <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1) 클래스❌: 기본 문법만을 사용한 변수, 메소드를 이용한 절차적 프로그래밍<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2) 클래스⭕: 클래스, 메소드, 생성자를 활용해 클래스와 객체의 개념 이해, 활용

---
### 개발 프로세스
&nbsp;▶️ 개발 환경 : <img src="https://img.shields.io/badge/IntelliJ IDEA-000000?style=flatsquare&logo=intellijidea&logoColor="/> <img src="https://img.shields.io/badge/JDK 17-0174DF?style=flatsquare&logo=&logoColor="/>

&nbsp;▶️ 요구사항
- 필요기능 정의
    - lv1 :  exit 입력시 까지 계속해서 2개의 숫자,사칙연산될 문자를 입력받고 연산 결과를 반환
    - lv2 : Lv1의 기능 + 계산된 결과 값들을 기록하는 컬렉션,
      가장 먼저 저장된 데이터 삭제
- 사용자 인터페이스 방식 : 콘솔 기반
- 예외 처리
    - 사칙연산기호가 아닌 입력 : 초기화된 결과값 0을 반환하며, 잘못되었음을 알리는 메시지 출력
    - 나눗셈의 분모가 0인 경우 : 초기화된 결과값 0을 반환하며, 잘못되었음을 알리는 메시지 출력

&nbsp;▶️ 설계
- 클래스
    - Lv1 : `App`
    - Lv2 : `App` `Calculator`
- 기능 분해
    - 클래스를 사용한 Lv2의 Calculator 클래스
        - `Calculator(생성자) : 연산, 결과 출력` `getResultList() : 컬렉션 필드에 저장된 결과 가져오기`<br>
          `getResult() : 연산된 결과값 가져오기` `deleteResult() : 컬렉션 필드에 저장된 결과 삭제`
- 데이터 흐름
    - input : 2개의 정수, 사칙연산 기호
    - operate : 입력받은 매개변수들이 Calculator를 통해 연산 수행 후 결과값 반환 및 저장
    - output : 연산수행 결과 및 컬렉션 필드에 저장된 결과값들 출력

---
### 필수 기능

<details>
<summary>Lv1. 클래스❌</summary>    
<br>  

- [x] : 양의 정수 2개를 각각 하나씩, 적당한 타입의 변수에 입력받아 저장 - `Scanner`

- [x] : 적당한 타입의 변수에 사칙연산 기호 입력받아 저장 - `charAt(0)`
- [x] : 입력받은 정수들과 사칙연산 기호를 사용해 연산 진행 후 결과값 출력 - `if : 연산 오류 구분` `switch`
- [x] : “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드수정 - `while(true)`
</details>

<details>
<summary>Lv2. 클래스⭕</summary>  
<br>  

- [x] : 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스 생성 - `Calculator()`

- [x] : 사칙연산 수행 후, 결과값 반환하는 메서드 구현 - `Calculator(int num1, int num2, char operator)`
- [x] : 연산 결과를 저장하는 컬렉션 타입 필드 생성, 결과값들 저장하는 코드 작성<br> - `Queue<> resultList` `result.add()`
- [x] : App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정<br> - `Calculator calc = new Calculator() : 인스턴스화`
- [x] : App 클래스의 main 메서드가 컬렉션 필드에 직접 접근하지 못하도록 수정 - `private : 캡슐화`
- [x] : 간접 접근을 통해 필드에 접근하여 가져오고, 수정할 수 있도록 구현<br> - `getResultList()` `setResultList()` `getResult()` `setResult()`
- [x] : 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 메소드 구현과 Main에서의 활용<br> - `Calculator(){ ... deleteResult(){} ... }` `main(){ ... calc.deleteResult() ... }`
</details>

---
### 트러블 슈팅

- <a href="https://heni0717.tistory.com/8">TIL 링크</a>
---
### 자체 평가
&nbsp;▶️ 완성도

- [x] (❗필수) Lv1,2 기능 구현
- [ ] Lv3 기능 구현

&nbsp;▶️ 이해도
- [x] (❗필수) 트러블 슈팅 TIL
- [x] 디렉토리 적절한 분리
- [x] ? 변수명 등 코드의 직관성과 이해성
- [x] 주석을 통한 코드 설명

&nbsp;▶️ 우수성
- [x] (❗필수) ReadMe 작성
- [x] 예외 처리 2개 이상 구현
- [ ] 커밋 컨벤션을 지킨 커밋 10회 이상

---
![footer](https://capsule-render.vercel.app/api?type=transparent&color=F8E0E6&height=200&section=footer&text=&fontSize=)