
public class Largestnuminarray {

    public static int getlargest(int num[]) {
        int largest = Integer.MIN_VALUE; // minus infinity
        int smallest = Integer.MAX_VALUE; // positive infinity
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        System.out.println("Smallest number is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {

        int number[] = {-89, 1, 2, 6, 3, 5, 12};
        System.out.println("Largest Value is : " + getlargest(number));

    }
}
