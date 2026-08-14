class Solution {
    public boolean isValid(String s) {

        Stack<Character> newS = new Stack();

        if(s.length() % 2 != 0) return false;

        for(char c : s.toCharArray()){

            if(newS.size() != 0){
                switch(c){
                    case ']':
                        if(newS.pop() != '[')
                            return false;
                        break;
                    case '}':
                        if(newS.pop() != '{')
                            return false;
                        break;
                    case ')':
                        if(newS.pop() != '(')
                            return false;
                        break;
                    default:
                        newS.push(c);
                }
            }
            else
                newS.push(c);
        }

        return newS.size() == 0;
    }
}
