
// 클래스
// public : (접근)제어자,  public(공공의, 공통의)

public class Main {

    // [JDK]
    // (1) compiler: .java -> .class
    // (2) JRE
    // (3) JDB : 디버깅

    // () : 소괄호
    // {} : 중괄호
    // [] : 대괄호

    // main 메소드
    // 자바 프로젝트(앱)는, 제일 먼저 클래싀이 main 메소드를 실행시킨다.
    // = JVM의 약속
    // static : 이 프로그램이 시작될 때 무조건 실행되는 녀석임을 나타냄.

    // output
    // void : 메서드의 출력값의 데이터 타입
    // void : "아무것도 없다." -> 출력은 없다.

    // input
    // String[] args : 매개변수 자리
    public static void main(String[] args) {
        // 객체 : 특징(속성, 변수), 행동(메소드)
        // print -> 줄 바꿈은 하지 x
        // println -> 줄 바꿈 o
        // ln : line
        // System.outprintln("Our First ");

        // 형 변환 예제 : 변수의 타입을 바꾸는 방법
        // 문자열 -> 숫자
        // 정수 -> 실수
        // 실수 -> 정수

        // double형 or float형 -> int
        // 실수 -> 정수 (0.xxxx -> 0)

        double doubleNumber = 10.101010;
        float floatNumber = 10.1010F;

        // 변환

        int intNumber;

        System.out.println("doubleNumber = " + doubleNumber);
        intNumber = (int) doubleNumber;
        System.out.println("intNumber = " + intNumber);

        System.out.println("floatNumber = " + floatNumber);
        intNumber = (int) floatNumber;
        System.out.println("intNumber = " + intNumber);
        System.out.println("------------------------------");
        intNumber = 10;
        System.out.println("intNumber = " + intNumber);

        double doubleNumber2 = (double) intNumber;
        float floatNumber2 = (float) intNumber;

        System.out.println("doubleNumber2 = " + doubleNumber2);
        System.out.println("floatNumber2 = " + floatNumber2);

        System.out.println("-------------------------------");
        // 변수 타입별 크기 순서
        // byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)

        // (1) byte -> int
        byte byteNumber = 10;
        int intNumber3 = (byte) byteNumber;
        System.out.println("intNumber3 = " + intNumber3);

        // (2) char(1 byte) -> int(4) 형변환
        System.out.println("-------------------------------");
        char charAlphabet = 'A';
        int intNumber4 = charAlphabet;
        System.out.println("intNumber4 = " + intNumber4);

        // (3) int -> long number 형변환
        System.out.println("-------------------------------");
        int intNumber5 = 100;
        long longNumber = intNumber5;
        System.out.println("intNumber5 = " + longNumber);

        // (4) int -> double 형변환
        System.out.println("-------------------------------");
        int intNumber6 = 200;
        double doubleNumber7 = intNumber6;
        System.out.println("doubleNumber7 = " + doubleNumber7);
    }
}