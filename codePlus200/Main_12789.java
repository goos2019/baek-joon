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

            while(true) {
                if(!line.isEmpty() && line.peek() == currentOrder) { // 메인 복도 확인
                    line.poll();
                    currentOrder++;
                } else if(!backUpLine.isEmpty() && backUpLine.peek() == currentOrder){ // 서브 복도 확인
                    backUpLine.pop();
                    currentOrder++;
                } else if(line.isEmpty() && backUpLine.isEmpty()) { // 전체 복도 없음(클리어)
                    System.out.println("Nice");
                    break;
                } else if(line.isEmpty() && backUpLine.peek() != currentOrder) { // 불가능
                    System.out.println("Sad");
                    break;
                } else {
                    backUpLine.push(line.poll());
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
