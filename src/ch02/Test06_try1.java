package ch02;

import java.util.Scanner;

public class Test06_try1 {
    public static void main(String[] args) {
        System.out.print("돈의 액수를 입력하세요 >> ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        if (a > 50000) {

            int x = a / 50000;
            System.out.print("오만원" + x + "개, ");

            int x1 = (a - x * 50000) / 10000;
            System.out.print("만원" + x1 + "개, ");

            int z = (a - (x * 50000 + x1 * 10000)) / 1000;
            System.out.print("천원" + z + "개, ");


            if (500 < (a - (x * 50000 + x1 * 10000 + z * 1000))) {

                int i = (a - (x * 50000 + x1 * 10000 + z * 1000)) / 500;
                System.out.print("500원" + i + "개, ");

                int i1 = (a - (x * 50000 + x1 * 10000 + z * 1000 + i * 500)) / 100;
                System.out.print("100원" + i1 + "개, ");

                int j = (a - (x * 50000 + x1 * 10000 + z * 1000 + i * 500 + i1 * 100)) / 10;
                System.out.print("10원" + j + "개, ");

                int k = a - (x * 50000 + x1 * 10000 + z * 1000 + i * 500 + i1 * 100 + j * 10);
                System.out.print("1원" + k + "개");
            } else {

                int i1 = (a - (x * 50000 + x1 * 10000 + z * 1000)) / 100;
                System.out.print("100원" + i1 + "개, ");

                int j = (a - (x * 50000 + x1 * 10000 + z * 1000 + i1 * 100)) / 10;
                System.out.print("10원" + j + "개, ");

                int k = a - (x * 50000 + x1 * 10000 + z * 1000 + i1 * 100 + j * 10);
                System.out.print("1원" + k + "개");
            }

        } else if (a < 50000) {

            int y = a / 10000;
            System.out.print("만원" + y + "개, ");

            int z = a - (y * 10000) / 1000;
            System.out.print("천원" + z + "개, ");

            if (500 < (a - (y * 10000 + z * 1000))) {

                int i = (a - (y * 10000 + z * 1000)) / 500;
                System.out.print("500원" + i + "개, ");

                int i1 = (a - (y * 10000 + z * 1000 + i * 500)) / 100;
                System.out.print("100원" + i1 + "개, ");

                int j = (a - (y * 10000 + z * 1000 + i * 500 + i1 * 100)) / 10;
                System.out.print("10원" + j + "개, ");

                int k = a - (y * 10000 + z * 1000 + i * 500 + i1 * 100 + j * 10);
                System.out.print("1원" + k + "개");
            } else {

                int i1 = (a - (y * 10000 + z * 1000)) / 100;
                System.out.print("100원" + i1 + "개, ");

                int j = (a - (y * 10000 + z * 1000 + i1 * 100)) / 10;
                System.out.print("10원" + j + "개, ");
                int k = a - (y * 10000 + z * 1000 + i1 * 100 + j * 10);
                System.out.print("1원" + k + "개");
            }

        }

    }
}
//500원 0개면 0개라고 출력해야함.