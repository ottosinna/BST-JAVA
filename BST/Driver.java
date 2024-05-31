class Driver {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();
        Integer[] ISBNs = {25, 101, 10, 45, 90, 110, 13, 11, 60, 99, 105, 234, 17, 20, 67, 175};

        bst.insert(25, "A");
        bst.insert(101, "B");
        bst.insert(10, "C");
        bst.insert(45, "D");
        bst.insert(90, "E");
        bst.insert(110, "F");

        for (int ISBN : ISBNs) {
            bst.insert(ISBN, "Book" + ISBN);
        }

        int sizeOfBST = bst.size();
        print("Empty? - " + bst.isEmpty());
        insert(bst); // This method is empty, so it doesn't do anything
        print("Display Levels:");
        bst.displayLevel(5);
        print("size - " + sizeOfBST);
        print("Levels " + bst.levels());
        print("Empty? - " + bst.isEmpty());
        print("Search - " + bst.search(25));
        print("Display:");
        bst.display();
        print("Delete? - ");
        bst.delete(67);
        print("size - " + bst.size());
        print("Levels " + bst.levels());
        print("Search - " + bst.search(67));
        print("Display Levels:");
        bst.displayLevel(5);
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void insert(BST<Integer, String> bst) {
        // You can insert more books here if needed
    }
}