public class ForLoop {
    public static void main(String[] args) {
        //When you know exactly how many times you want to loop through a block of code, use the for loop 
        /* Statement 1 is executed (one time) before the execution of the code block.

        Statement 2 defines the condition for executing the code block.

        Statement 3 is executed (every time) after the code block has been executed. */

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
          }

        //There is also a "for-each" loop, which is used exclusively to loop through elements in an array

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
