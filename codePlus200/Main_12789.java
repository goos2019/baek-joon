package codePlus200;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_12789 {
    public static void main(String[] args) {

        // 메인 복도 큐, 서브 복도 스택으로 2중 구조
        // 메인 복도에서 현재 순서 count를 찾음 못찾으면 서브 복도로 넘김
        // 그 다음 번호를 찾음 메인 복도에 없으면 서브 복도에 찾음 메인, 서브 복도에 찾을 수 없으면 Sad

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int count = Integer.parseInt(br.readLine());
            String[] order = br.readLine().split(" ");
            Deque<Integer> line = new LinkedList<>(); // 메인 복도
            Stack<Integer> backUpLine = new Stack<>(); // 서브 복도
            int currentOrder = 1;

            for (String s : order) {
                line.offer(Integer.parseInt(s));
            }

            while(line.isEmpty()) {
                if(line.peek() == currentOrder) {
                    line.poll();
                    currentOrder++;
                } else if(backUpLine.peek() == currentOrder){
                    backUpLine.pop();
                    currentOrder++;
                } else {
                    backUpLine.push(line.poll());
                }
            }

            if(line.isEmpty() && backUpLine.isEmpty()) {
                System.out.println("Nice");
            } else {
                System.out.println("Sad");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
