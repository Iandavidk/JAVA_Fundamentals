public class WhileLoop {
    //The while loop loops through a block of code as long as a specified condition is true:
    public static void main(String[] args) {
        int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}

/*  This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true. */

int x = 0;
do {
  System.out.println(x);
  x++;
}
while (x < 5);

    }
}
