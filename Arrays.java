/* Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

To declare an array, define the variable type with square brackets */
public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        // Outputs Volvo

        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        cars2[0] = "Opel";
        System.out.println(cars2[0]);
        // Now outputs Opel instead of Volvo

        String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars3.length);
        // Outputs 4

    }
}
