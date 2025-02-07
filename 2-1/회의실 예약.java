//https://softeer.ai/app/assessment/index.html?xid=414972&xsrfToken=S4xk2lfbrbuwid0V4feXfzeMZWtwpGBB&testType=practice
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        List<String> rooms = new ArrayList<>();
        Map<String, List<int[]>> schedules = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String room = scanner.nextLine().trim();
            rooms.add(room);
            schedules.put(room, new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String room = scanner.next();
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            schedules.get(room).add(new int[]{start, end});
        }

        scanner.close();
        Collections.sort(rooms);

        for (int i = 0; i < rooms.size(); i++) {
            String room = rooms.get(i);
            System.out.println("Room " + room + ":");
            List<int[]> booked = schedules.get(room);
            List<String> availableTimes = findAvailableTimes(booked);

            if (availableTimes.isEmpty()) {
                System.out.println("Not available");
            } else {
                System.out.println(availableTimes.size() + " available:");
                for (String time : availableTimes) {
                    System.out.println(time);
                }
            }

            if (i < rooms.size() - 1) {
                System.out.println("-----");
            }
        }
    }

    private static List<String> findAvailableTimes(List<int[]> booked) {
        List<String> availableTimes = new ArrayList<>();
        booked.sort(Comparator.comparingInt(a -> a[0]));
        int start = 9;

        for (int[] slot : booked) {
            if (start < slot[0]) {
                availableTimes.add(formatTime(start) + "-" + formatTime(slot[0]));
            }
            start = slot[1];
        }

        if (start < 18) {
            availableTimes.add(formatTime(start) + "-18");
        }

        return availableTimes;
    }

    private static String formatTime(int hour) {
        return String.format("%02d", hour);
    }
}
