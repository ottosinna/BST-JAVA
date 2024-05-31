import java.util.Scanner;

public class DriverS {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 9) {
            System.out.println("\nBSTMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Display Level");
            System.out.println("6. Size");
            System.out.println("7. Check if Empty");
            System.out.println("8. Levels");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter key and value to insert: ");
                        int key = scanner.nextInt();
                        String value = scanner.next();
                        bst.insert(key, value);
                        break;
                    case 2:
                        System.out.print("Enter key to delete: ");
                        int deleteKey = scanner.nextInt();
                        bst.delete(deleteKey);
                        break;
                    case 3:
                        System.out.print("Enter key to search: ");
                        int searchKey = scanner.nextInt();
                        if (bst.search(searchKey)) {
                            System.out.println(searchKey);
                        } else {
                            System.out.println(searchKey + " not found");
                        }
                        break;
                    case 4:
                        System.out.println("Displaying:");
                        bst.display();
                        break;
                    case 5:
                        System.out.print("Enter display level: ");
                        int level = scanner.nextInt();
                        bst.displayLevel(level);
                        break;
                    case 6:
                        System.out.println("Size is " + bst.size());
                        break;
                    case 7:
                        System.out.println("is Empty? " + bst.isEmpty());
                        break;
                    case 8:
                        System.out.println("Levels: " + bst.levels());
                        break;
                    case 9:
                        System.out.println("Exiting...");
                        break;
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }
        scanner.close();
    }
}
