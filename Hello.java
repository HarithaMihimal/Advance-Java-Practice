class Hello{
    public static void main(String[] args) {
     
    System.out.println("type conversion");
     byte a = 127;
     int b = 256;
     System.out.println("value of a is "+a);
    //  a=b; // this is not work because byte can store only 127 value but we are trying to store 256 value in it so it will give error
     System.out.println("value of b is "+b);
     // this is not work because byte can store only 127 value but we are trying to store 256 value in it so it will give error

     a= (byte) b; // this is called type casting and it will work but it will give wrong value because of overflow
     System.out.println("value of a is "+a);


     byte c = 127;
     int d = c; // this is called implicit type conversion and it will work because int can store more value than byte
     System.out.println("value of c is "+c);

     int aa = 257;
     byte bb = (byte) aa; // this is called type casting and it will work but it will give wrong value because of overflow
     System.out.println("value of aa is "+aa);
     System.out.println("value of bb is "+bb); //modulo operation is performed because of overflow and it will give 1 as output because 257%256=1
    }
}