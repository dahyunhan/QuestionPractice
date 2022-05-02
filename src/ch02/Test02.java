package ch02;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        System.out.print("몇 층인지 입력하세요 >> ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println((a * 5) + "m 입니다.");
    }

}