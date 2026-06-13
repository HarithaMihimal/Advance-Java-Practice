class Hello{
    public static void main(String[] args) {
     
    
        System.out.println("Arithmetic Operators ");
        int num1 = 10;
        int num2 = 5;
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));    
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
        System.out.println("\nRelational Operators ");
        System.out.println("Equal to: " + (num1 == num2));
        System.out.println("Not equal to: " + (num1 != num2));
        System.out.println("Greater than: " + (num1 > num2));
        System.out.println("Less than: " + (num1 < num2));
        System.out.println("Greater than or equal to: " + (num1 >= num2));
        System.out.println("Less than or equal to: " + (num1 <= num2
        ));
        System.out.println("\nLogical Operators ");
        boolean a = true;
        boolean b = false;
        System.out.println("Logical AND: " + (a && b));
        System.out.println("Logical OR: " + (a || b));
        System.out.println("Logical NOT: " + (!a));
        System.out.println("\nAssignment Operators ");
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("Addition Assignment: " + c);
        c -= 3; // c = c - 3
        System.out.println("Subtraction Assignment: " + c);
        c *= 2; // c = c * 2
        System.out.println("Multiplication Assignment: " + c);
        c /= 4; // c = c / 4
        System.out.println("Division Assignment: " + c);
        c %= 3; // c = c % 3
        System.out.println("Modulus Assignment: " + c);

    } 

}