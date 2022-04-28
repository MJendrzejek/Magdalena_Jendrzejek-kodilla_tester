public class LeapYear {
    public static void main(String[] args) {
        int year = 400;

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Przestępny!");
        } else if (year % 400 == 0) {
            System.out.println("Przestępny!");
        } else {
            System.out.println("Nieprzestępny!");
        }

    }
}
