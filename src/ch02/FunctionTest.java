package ch02;

public class FunctionTest {
    //멤버변수 -> 메서드 밖에서 선언된 변수 (여기에는 없음) = 전역변수 = 필드

    //메서드 -> 클래스 내부에서 멤버 변수를 사용하여 클래스 기능을 구현
    //add 라는 함수를 정의
    public static int add(int n1, int n2) {
        //n1, n2 -> 매개변수
        int result = n1 + n2;
        //return 예약어 -> 결과값 반환
        return result;
    }

    //void - 반환할 값이 없을 때 예약어
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        //add 함수 호출 -> 호출 시 스택 메모리 할당 - main() 부터 호출됨
        int sum = add(num1, num2);
        System.out.println(sum);

    }
    //n1, n2 - num1, num2 는 지역변수 -> 서로 다른 스택 메모리 사용
}
//Doit 자바프로그래밍 입문