package org.example.week1_If_Statements;

public class vid_8_print_book_list_loops_if_statements {

    public static void main(String[] args) {

        String[] bookList = {
                "Automate the boring stuff with Python",
                "Java Programming",
                "A very complex and long programming book with a lot of examples and information whoa is that ever a lot of info."
        };

        printBookList(bookList);

        //does bookCount (defined below) exist here?
        //System.out.println(bookcount); //no! error
    }
    public static void printBookList(String[] books) {

        int bookCount = books.length;

        //loops over array of books.length
        for (int x = 0; x < books.length; x++) { //scope of the loop counter
            String book = books[x];

            //truncate longer book names
            if(book.length() > 50) {
                book = book.substring(0, 50) + "...";
            }
            //every book is printed with a number before each book title
            System.out.println(x + 1 + ": " + book);
        }
        //output:
        //1: Automate the boring stuff with Python
        //2: Java Programming
        //3: A very complex and long programming book with a lo...

        //does x exist here?
        //test:
        //System.out.println(x); //error, so nope

        //does book exist here?
        //test:
        //System.out.println(book); //error, so nope

        //does books exist here?
        //test:
        System.out.println(books); //yes

        //does bookCount exist here?
        //test
        System.out.println(bookCount); //yes

    }
}
