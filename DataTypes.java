public class DataTypes {
    public static void main(String[] args) {
        /* Data types are divided into two groups:

    Primitive data types - includes byte, short, int, long, float, double, boolean and char
    Non-primitive data types - such as String, Arrays and Classes */
    byte myNum = 100;
    System.out.println(myNum);

    long myNum1 = 15000000000L;
    System.out.println(myNum1);

    float myNum2 = 5.75f;
    System.out.println(myNum2);

    double myNum3 = 19.99d;
    System.out.println(myNum3);

    float f1 = 35e3f;
    double d1 = 12E4d;
    System.out.println(f1);
    System.out.println(d1);

    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);     // Outputs true
    System.out.println(isFishTasty);   // Outputs false

    char myGrade = 'B';
    System.out.println(myGrade);

    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    System.out.println(myVar1);
    System.out.println(myVar2);
    System.out.println(myVar3);

    /* Non-primitive data types are called reference types because they refer to objects.

    The main difference between primitive and non-primitive data types are:

    Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
    Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
    A primitive type has always a value, while non-primitive types can be null.
    A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
    The size of a primitive type depends on the data type, while non-primitive types have all the same size.

    Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. */

    }
}
