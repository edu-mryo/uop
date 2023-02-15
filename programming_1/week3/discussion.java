/**
 * discussion
 */
public class discussion {

    public static void main(String[] args) {
        int a = 0;
        int b = 2;

        multi( a, b);

    }

    public static void multi(int a, int b) {
        do {
            b = b * 2;
            a++;
            System.out.println(b);
        } while (a < 10);
    }
}