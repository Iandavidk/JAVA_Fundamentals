public class ArrayLoop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
            }

        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String a : cars2) {
         System.out.println(a);
            }
            

    }
}
