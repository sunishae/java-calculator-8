# 프리코스 1주차 - 문자열 덧셈 계산기

---

![Generic badge](https://img.shields.io/badge/precourse-week1-green.svg)

> 우아한테크코스 백엔드 8기 1주차, 문자열 덧셈 계산기를 구현한 저장소입니다.

## 기능 목록

- [x]  문자열 입력 받기
    - 공백 제거
    - “덧셈할 문자열을 입력해 주세요. “. 문구 출력
    - Console.readLine()을 통해 입력


- [x]  덧셈 로직
    - 기본 구분자 : 쉼표(,) 또는 클론(:)
    - 커스텀 구분자 : // 와 \n 사이의 문자를 지정
    - 지정된 구분자 이외의 숫자를 리스트로 생성 및 덧셈
    - 입력이 없으면(null), 결과 값 0


- [x]  결과값 출력
    - “결과 : ” 문구 출력
    - 공백 시 0 출력


- [x]  예외 검증
    - 기본 구분자, 커스텀 구분자 이외의 구분자 입력 시
    - 음수 또는 0 입력 시
    - 숫자 이외의 문자 입력 시
    - IllegalArgumentException 처리

---

## 📁 파일 구조 및 설계

---

최대한 단일책임원(SRP)을 기반으로 핵심 로직을 View/Controller와 분리하여 설계하였습니다.

src/main/java/calculator

├── Application.java          // 프로그램 실행의 시작점 (main)
├── controller
│   └── CalculatorController.java   // 입출력 흐름 제어 및 최종 예외 처리 책임
├── view
│   ├── InputView.java          // 사용자 입력 담당 (Console.readLine)
│   └── OutputView.java         // 결과 출력 담당
└── domain                      // 핵심 로직 
├── StringAddCalculator.java  // 계산 흐름 총괄 및 최종 합산 책임
├── StringParser.java         // 문자열 파싱, 구분자 추출 및 유효하지 않은 구분자 검증 책임
└── PositiveNumber.java       // 숫자 변환, 음수/0/숫자 외 문자 유효성 검증 책임


