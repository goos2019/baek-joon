package codePlus200;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_4949 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // (, [ 시작 괄호만 수집 이후 1번이라도 닫는 괄호 ), ] 가 등장하면 시작 괄호를 제거
        // 이후 문자열이 끝날때까지 남는게 있으면 no 아니면 yes

        try {
            while(true) {
                String data = br.readLine();
                if(data.equals(".")) break;
                Stack<String> stack = new Stack<>();
                String[] line = data.split("");
                String state = "";

                for(int i = 0; i < line.length; i++) {
                    if(line[i].equals("(") || line[i].equals("[")) { // 시작 괄호면
                        stack.push(line[i]);
                    } else if(line[i].equals(")") || line[i].equals("]")) { // 닫는 괄호면
                        if(stack.empty()) { // 비어 있으면
                            state = "no";
                            break;
                        } else { // 비어 있지 않으면
                            String pop = stack.pop();
                            // 닫는 쌍이 안맞으면
                            if(pop.equals("(") && !line[i].equals(")")) {
                                state = "no";
                                break;
                            }
                            if(pop.equals("[") && !line[i].equals("]")) {
                                state = "no";
                                break;
                            }
                        }
                    }
                }

                // 남는게 없으면(완벽히 쌍으로 되어있다면)
                if(stack.empty() && state.isEmpty()) {
                    sb.append("yes").append('\n');
                } else {
                    sb.append("no").append('\n');
                }
            }

            System.out.println(sb);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
