package ch02;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.print("두 정수를 입력하세요 >> ");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(x + "+" + y + "은 " + (x + y));


    }
}
