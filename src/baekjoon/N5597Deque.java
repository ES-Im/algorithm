package baekjoon;

import java.util.*;

public class N5597Deque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 출석번호
        int students = 30;
        Deque<Integer> attendance = new ArrayDeque<>();
        for (int i = 0; i < students; i++) {
            attendance.offerLast(i+1);
        }

        // 제출한 학생 수(submitted)
        int submitted = 28;
        // 제출한 학생
        Deque<Integer> submitStudent = new ArrayDeque<>();
        for (int i = 0; i < submitted; i++) {
            int input = scanner.nextInt();
            submitStudent.offerLast(input);
        }
        // 제출하지 않은 학생
        Deque<Integer> target = new ArrayDeque<>(attendance);
        target.removeAll(submitStudent);

        System.out.println(target.getFirst());
        System.out.println(target.getLast());


    }

}
