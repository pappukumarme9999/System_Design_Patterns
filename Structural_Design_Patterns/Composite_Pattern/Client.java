package Composite_Pattern;

// Client Code

public class Client {
    public static void main(String[] args) {

        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        Directory directory = new Directory("Documents");
        directory.addItem(file1);
        directory.addItem(file2);

        directory.display();





        // Directory root = new Directory("root");
        // Directory home = new Directory("home");
        // Directory user = new Directory("user");
        // File file1 = new File("file1");
        // File file2 = new File("file2");
        // File file3 = new File("file3");
        // File file4 = new File("file4");

        // root.addItem(home);
        // home.addItem(user);
        // root.addItem(file1);
        // user.addItem(file2);
        // user.addItem(file3);
        // user.addItem(file4);

        // root.display();
    }
}