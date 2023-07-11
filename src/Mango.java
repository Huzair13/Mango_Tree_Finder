import java.util.Scanner;

public class Mango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int treeNumber = scanner.nextInt();
        System.out.println(isMangoTree(rows, columns, treeNumber));
    }

    //Checking whether it is a Mango Tree
    public static boolean isMangoTree(int rows, int columns, int treeNumber) {
        return treeNumber % columns == 1 || treeNumber == 1 || treeNumber == columns || treeNumber%columns==0 || treeNumber<=rows;
    }
}