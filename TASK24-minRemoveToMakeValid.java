class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder answer = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        boolean[] remove = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    remove[i] = true;
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            remove[stack.pop()] = true;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!remove[i]) {
                answer.append(s.charAt(i));
            }
        }

        return answer.toString();
    }
}
