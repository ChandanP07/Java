public class AdvancedPattern {

    // Hollow Rectangle
    // public static void hollow_rectangle(int totrows, int totcolumns) {
    //     // outer loop
    //     for (int i = 1; i <= totrows; i++) {
    //         // inner loop-columns
    //         for (int j = 1; j <= totcolumns; j++) {
    //             // cell - (i,j)
    //             if (i == 1 || j == 1 || i == totrows || j == totcolumns) {
    //                 // boundary cells
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }


    // Inverted Rotated Half Pyramid
    // public static void inverted_rotated_half_pyramid(int n) {
    //     // outer-line number
    //     for (int i = 1; i <= n; i++) {

    //         // inner spaces-inside each line
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }

    //         // inner stars -inside each line
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    // Inverted Half Pyramid withnumbers
    // public static void inverted_half_pyramid_withnumbers(int n) {
    //     // outer
    //     for (int i = 1; i <= n; i++) {
    //         // inner
    //         for (int j = 1; j <= (n - i + 1); j++) {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }


    // Floyds Triangle
    // public static void floyds_triangle(int n) {
    //     int counter = 1;
    //     // outer
    //     for (int i = 1; i <= n; i++) {
    //         // inner- how many times counter will be printed
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(counter + " ");
    //             counter++;
    //         }
    //         System.out.println();
    //     }
    // }


    // Zero One Triangle
    // public static void zero_one_triangle(int n) {
    //     // outer
    //     for (int i = 1; i <= n; i++) {
    //         // inner
    //         for (int j = 1; j <= i; j++) {
    //             if ((i + j) % 2 == 0) {
    //                 System.out.print(1);
    //             } else {
    //                 System.out.print(0);
    //             }
    //         }
    //         System.out.println();
    //     }
    // }


    //Butterfly 
    // public static void butterfly(int n) {
    //     // 1st Half
    //     // outer
    //     for (int i = 1; i <= n; i++) {
    //         // inner stars-i
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         // inner spaces=2*n-i
    //         for (int j = 1; j <= 2 * (n - i); j++) {
    //             System.out.print(" ");
    //         }
    //         // inner stars-i
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     // 2nd Half
    //     // outer
    //     for (int i = n; i >= 1; i--) {
    //         // inner stars-i
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         // inner spaces=2*n-i
    //         for (int j = 1; j <= 2 * (n - i); j++) {
    //             System.out.print(" ");
    //         }
    //         // inner stars-i
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    // Solid Rhombus
    // public static void solid_rhombus(int n) {
    //     // outer
    //     for (int i = 1; i <= n; i++) {
    //         // inner spaces
    //         for (int j = 1; j <= (n - i); j++) {
    //             System.out.print(" ");
    //         }
    //         // inner stars
    //         for (int j = 1; j <= n; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    //  Hollow Rhombus
    // public static void hollow_rhombus(int n) {
    //     // outer
    //     for (int i = 1; i <= n; i++) {
    //         // spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <= n; j++) {
    //             if (i == 1 || j == 1 || i == n || j == n) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }


    // Diamond shape
    // public static void diamond(int n) {
    //     // outer-!st Half
    //     for (int i = 1; i <= n; i++) {
    //         // inner- for spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         // inner- for stars
    //         for (int j = 1; j <= (2 * i) - 1; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     // inner- 2nd Half
    //     for (int i = n; i >= 1; i--) {
    //         // inner- for spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         // inner- for stars
    //         for (int j = 1; j <= (2 * i) - 1; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    // }


    // Number Pyramid
    // public static void number_pyramid(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(i + " ");
    //         }
    //         System.out.println();
    //     }
    // }


    // Palindromic With Numbers 
    // public static void palindromic_with_numbers(int n) {
    //     //outer
    //     for (int i = 1; i <= n; i++) {
    //         //inner- for spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         //inner - for i to 1 nums
    //         for (int j = i; j >= 1; j--) {
    //             System.out.print(j);
    //         }
    //         //inner - for 2 to i nums
    //         for (int j = 2; j <= i; j++) {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        // hollow_rectangle(10, 7);
        // inverted_rotated_half_pyramid(7);
        // inverted_half_pyramid_withnumbers(5);
        // floyds_triangle(5);
        // zero_one_triangle(5);
        // butterfly(5);
        // solid_rhombus(7);
        // hollow_rhombus(5);
        // diamond(7);
        // number_pyramid(5);
        // palindromic_with_numbers(5);

    }

}
