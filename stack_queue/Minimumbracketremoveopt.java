package stack_queue;

public class Minimumbracketremoveopt {
    public static int Minimumbracketremoveopt(String s) {
        int count = 0;
        int ans = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
            } else {
                count--;
                if (count < 0) {
                    ans++;
                    count = 0;
                }
            }
        }
        return count + ans;
    }

    public static void main(String[] args) {
        String s = ")))(((";
        System.out.println(Minimumbracketremoveopt(s));
    }
}
