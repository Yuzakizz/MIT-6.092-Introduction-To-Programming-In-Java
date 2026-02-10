public class Library {
    String address;
    Book[] bookArray = new Book[100];
    int bookNumber = 0;

    // Add the missing implementation to this class
    public Library(String address) {
        this.address = address;
    }

    public void addBook(Book book) {
        this.bookArray[bookNumber] = book;
        bookNumber++;
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress() {
        System.out.println(this.address);
    }

    public void borrowBook(String bookName) {
        if (this.bookNumber == 0) {
            System.out.println("Sorry, this book is not in our catalog.");
            return;
        }
        for (int i = 0; i < this.bookNumber; i++) {
            if (this.bookArray[i].getTitle().equals(bookName))//找到了
            {
                if (this.bookArray[i].isBorrowed()) {
                    System.out.println("Sorry, this book is already borrowed.");
                } else {
                    System.out.println("You successfully borrowed " + this.bookArray[i].getTitle());
                    this.bookArray[i].borrowed();//加括号
                }
                return;//bushi break;
            }//不加else咋了?
        }
        System.out.println("Sorry, this book is not in our catalog.");

    }

    public void returnBook(String bookName) {
        for (int i = 0; i < this.bookNumber; i++) {
            if (this.bookArray[i].getTitle().equals(bookName))//找到了
            {
                if (!this.bookArray[i].isBorrowed()) {
                    System.out.println("Sorry, this book is already returned.");
                } else {
                    System.out.println("You successfully returned " + this.bookArray[i].getTitle());
                    this.bookArray[i].returned();//加括号
                }
                return;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    public void printAvailableBooks() {
        if (this.bookNumber == 0) {
            System.out.println("No book in catalog");
            return;
        } else {
            for (int i = 0; i < this.bookNumber; i++) {
                if (this.bookArray[i].isBorrowed()) {
                    continue;
                } else {
                    System.out.println(this.bookArray[i].getTitle());
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}

//Library hours:
//Libraries are open daily from 9am to 5pm.
//Library addresses:
//10 Main St.
//228 Liberty St.
//Borrowing The Lord of the Rings:
//You successfully borrowed The Lord of the Rings
//Sorry, this book is already borrowed.
//Sorry, this book is not in our catalog.
//Books available in the first library:
//The Da Vinci Code
//Le Petit Prince
//A Tale of Two Cities
//Books available in the second library:
//No book in catalog
//Returning The Lord of the Rings:
//You successfully returned The Lord of the Rings
//Books available in the first library:
//The Da Vinci Code
//Le Petit Prince
//A Tale of Two Cities
//The Lord of the Rings