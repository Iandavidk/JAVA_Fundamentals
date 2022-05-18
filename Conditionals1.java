public class Conditionals1 {
    public static void main(String[] args) {
        int x = 20;
        int y = 18;
        if (x > y) {
        System.out.println("x is greater than y");

        int time = 20;
        if (time < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }
        // Outputs "Good evening."

        int time1 = 22;
        if (time1 < 10) {
         System.out.println("Good morning.");
        } else if (time1 < 20) {
        System.out.println("Good day.");
        } else {
         System.out.println("Good evening.");
        }
        // Outputs "Good evening."

        //Short Hand if...else
        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

}

    }
}
