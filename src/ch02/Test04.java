package ch02;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        System.out.print("점 (x,y)의 좌표를 입력하세요 >> ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x >= 50 && x <= 100 && y >= 50 && y <= 100) {
            System.out.println("점(" + x + "," + y + ")은 (50,50)과 (100,100)의 사각형 내에 있습니다.");
        } else {
            System.out.println("점(" + x + "," + y + ")은 (50,50)과 (100,100)의 사각형 밖에 있습니다.");
        }
    }
}
