package study;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Calculator {

    @Test
    void calculate() throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        String value = scanner.nextLine();

        String value = "2 + 3 * 4 / 2";
        String[] values = value.split(" ");
        int result = 0;
        Queue<String> queue = new LinkedList<>();
        for (String str : values) {
            queue.add(str);
            if (queue.size() == 3) {
                int first = Integer.valueOf(queue.poll());
                String operator = queue.poll();
                int second = Integer.valueOf(queue.poll());

                switch (operator) {
                    case "+":
                        result = first + second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        result = first / second;
                        break;
                }

                queue.add(String.valueOf(result));
            }
        }

        System.out.println("result = " + result);
    }
}
