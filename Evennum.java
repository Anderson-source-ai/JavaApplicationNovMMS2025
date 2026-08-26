public class Evennum{
    public static void main(String[] args) {
        
        int[] number = {60, 70, 80, 90, 40, 69, 87, 33, 97, 23};
        
        int evennumber = 0;
        int oddnumber = 0;
        
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                evennumber++;
            } else {
                oddnumber++;
            }
        } 

        System.out.printf("The count of even numbers is: %d%n", evennumber);
        System.out.printf("The count of odd numbers is: %d%n", oddnumber);
    }
}