package stack_queue;

public class minAddToMakeValidcounter {
    public static int count(String s) {
        int open = 0;
        int add = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    add++;
                }
            }
        }
        return open + add;
    }

    public static void main(String[] args) {
        String s = "()))";
        System.out.println(count(s));
    }
}
