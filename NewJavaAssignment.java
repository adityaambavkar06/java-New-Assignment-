import java.util.Scanner;

public class NumberStarPattern {

    static String[][] numbers = {

        {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        },

        {
            "  *  ",
            " **  ",
            "  *  ",
            "  *  ",
            " *** "
        },

        {
            " *** ",
            "    *",
            " *** ",
            "*    ",
            " *** "
        },

        {
            " *** ",
            "    *",
            " *** ",
            "    *",
            " *** "
        },

        {
            "*   *",
            "*   *",
            "*****",
            "    *",
            "    *"
        },

        {
            "*****",
            "*    ",
            "**** ",
            "    *",
            "**** "
        },

        {
            " ****",
            "*    ",
            "**** ",
            "*   *",
            " ****"
        },

        {
            "*****",
            "    *",
            "   * ",
            "  *  ",
            " *   "
        },

        {
            " *** ",
            "*   *",
            " *** ",
            "*   *",
            " *** "
        },

        {
            " ****",
            "*   *",
            " ****",
            "    *",
            " ****"
        }
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit (0-9): ");
        int num = sc.nextInt();

        if (num >= 0 && num <= 9) {
            for (String line : numbers[num]) {
                System.out.println(line);
            }
        } else {
            System.out.println("Please enter a valid digit (0-9).");
        }

        sc.close();
    }
}