package stage21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Main_11729 {

    static Stack<Integer> table1 = new Stack<>();
    static Stack<Integer> table2 = new Stack<>();
    static Stack<Integer> table3 = new Stack<>();

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());
            table1.push(0);
            table2.push(0);
            table3.push(0);
            // 하노이의 탑
            // 3개의 스택
            // 각 스택에서 마지막 top에 있는 값을 기준으로 판단
            // 우선순위는 3 > 2 > 1
            // 가장 비용이 작은 쪽으로 이동
            // 마지막 3번째 스택이 N, N - 1, ... , 1 순으로 진행 1이면 stop

            for(int i = N; i > 0; i--) {
                table1.push(i);
            }
            hanoi(N, 0);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void hanoi(int N, int after) {

        if(N == 1) {
            System.out.println("1 3");
            return;
        }

        int table1Top = table1.peek();
        int table2Top = table2.peek();
        int table3Top = table3.peek();
        int moving = after;

        if(table3Top == N) {
            table3Top = 0;
        }

        if(table3Top == 0) {
            int max = 0;
            if(moving == 1) {
                max = table2.pop();
                System.out.println("2 3");
            } else if(moving == 2) {
                max = table1.pop();
                System.out.println("1 3");
            } else {
                if(table1Top > table2Top) {
                    max = table1.pop();
                    System.out.println("1 3");
                } else {
                    max = table2.pop();
                    System.out.println("2 3");
                }
            }
            moving = 3;
            table3.push(max);
        } else if(table2Top == 0) {
            int max = 0;
            if(moving == 1) {
                max = table3.pop();
                System.out.println("3 2");
            } else if(moving == 2) {
                if(table1Top > table3Top) {
                    max = table1.pop();
                    System.out.println("1 2");
                } else {
                    max = table3.pop();
                    System.out.println("3 2");
                }
            } else {
                max = table1.pop();
                System.out.println("1 2");
            }
            moving = 2;
            table2.push(max);
        } else if(table1Top == 0) {
            int max = 0;
            if(moving == 1) {
                if(table2Top > table3Top) {
                    max = table2.pop();
                    System.out.println("2 1");
                } else {
                    max = table3.pop();
                    System.out.println("3 1");
                }
            } else if(moving == 2) {
                max = table3.pop();
                System.out.println("3 1");
            } else {
                max = table2.pop();
                System.out.println("2 1");
            }
            moving = 1;
            table1.push(max);
        } else {

            int min = 0;
            if(moving == 1) {
                if(table2Top < table3Top) {
                    min = table2.pop();
                    if(table3Top > min) {
                        table3.push(min);
                        System.out.println("2 3");
                    } else {
                        table1.push(min);
                        System.out.println("2 1");
                    }
                } else {
                    min = table3.pop();
                    if(table2Top > min) {
                        table2.push(min);
                        System.out.println("3 2");
                    } else {
                        table1.push(min);
                        System.out.println("3 1");
                    }
                }
            } else if(moving == 2) {
                if(table1Top < table3Top) {
                    min = table1.pop();
                    if(table3Top > min) {
                        table3.push(min);
                        System.out.println("1 3");
                    } else {
                        table2.push(min);
                        System.out.println("1 2");
                    }
                } else {
                    min = table3.pop();
                    if(table2Top > min) {
                        table2.push(min);
                        System.out.println("3 2");
                    } else {
                        table1.push(min);
                        System.out.println("3 1");
                    }
                }
            } else {
                if(table1Top < table2Top) {
                    min = table1.pop();
                    if(table3Top > min) {
                        table3.push(min);
                        System.out.println("1 3");
                    } else {
                        table2.push(min);
                        System.out.println("1 2");
                    }
                } else {
                    min = table2.pop();
                    if(table2Top > min) {
                        table3.push(min);
                        System.out.println("2 3");
                    } else {
                        table1.push(min);
                        System.out.println("2 1");
                    }
                }
            }

//            int minTable = Math.min(Math.min(table1Top, table2Top), table3Top);
//
//            if(minTable == table3Top) {
//                int min = table3.pop();
//                if(table1Top < table2Top) {
//                    table1.push(min);
//                    System.out.println("3 1");
//                    moving = 1;
//                } else {
//                    table2.push(min);
//                    System.out.println("3 2");
//                    moving = 2;
//                }
//            } else if(minTable == table2Top) {
//                int min = table2.pop();
//                if(table1Top < table3Top) {
//                    table1.push(min);
//                    System.out.println("2 1");
//                    moving = 1;
//                } else {
//                    table3.push(min);
//                    System.out.println("2 3");
//                    moving = 3;
//                }
//            } else {
//                int min = table1.pop();
//                if(table2Top < table3Top) {
//                    table2.push(min);
//                    System.out.println("1 2");
//                    moving = 2;
//                } else {
//                    table3.push(min);
//                    System.out.println("1 3");
//                    moving = 3;
//                }
//            }
        }
        if(table3.peek() == N) {
            hanoi(--N, moving);
        } else {
            hanoi(N, moving);
        }
    }
}
