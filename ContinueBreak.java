public class ContinueBreak {
    public static void main(String[] args) {
        //The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i);
          }

            int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
        if (a == 4) {
            break;
            }
        }

            int b = 0;
        while (b < 10) {
        if (b == 4) {
            b++;
            continue;
        }
        System.out.println(b);
            b++;
        }
    }
}
