package ch02;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] srgs) {

        System.out.print("논리 연산을 입력하세요 >> ");

        Scanner scanner = new Scanner(System.in);
        Boolean x = scanner.nextBoolean();
        String b = scanner.next();
        Boolean y = scanner.nextBoolean();

        switch (b) {
            case "AND":
                System.out.println(x && y);

                break;
            case "OR":
                System.out.println(x || y);
                break;
            default:
                System.out.println("AND 나 OR 입력");
            }
        }
    }
