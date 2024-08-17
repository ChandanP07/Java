
public class LinearSearch {

    public static int linearsearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = {"Dosa", "Sandwich", "Chole Bhature", "Samosa"};
        String key = "Dosa";
        int chosen = linearsearch(menu, key);
        if (chosen == -1) {
            System.out.println("NOT Found");
        } else {
            System.out.println("chosen is at index : " + chosen);
        }

    }
}
