class Hello{
    public static void main(String[] args) {
       // switch case
         int day = 3;
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;  
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day");
            }
            // switch case new version
            int day1 = 6;
            switch (day1) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Invalid day");
            }

            // switch with yield
            int day2 = 2;
            String dayName = switch (day2) {
                case 1 : yield "Monday";
                case 2 : yield "Tuesday";
                case 3 : yield "Wednesday";
                case 4 : yield "Thursday";
                case 5 : yield "Friday";
                case 6 : yield "Saturday";
                case 7 : yield "Sunday";
                default : yield "Invalid day";
            };
            System.out.println(dayName);
    } 

}