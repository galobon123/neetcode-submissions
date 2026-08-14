class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int number;
        int second;

        for(String i : tokens){
            if(i.equals("+")){

                number = stack.pop() + stack.pop();

                stack.push(number);
            } else if(i.equals("-")){

                number = -stack.pop() + stack.pop();

                stack.push(number);
            } else if(i.equals("*")){

                number = stack.pop() * stack.pop();

                stack.push(number);
            } else if(i.equals("/")){
                second = stack.pop();

                number = stack.pop() / second;

                stack.push(number);
            } else {
                number = Integer.parseInt(i);

                stack.push(number);
            }
        }

        return stack.pop();
    }
}
