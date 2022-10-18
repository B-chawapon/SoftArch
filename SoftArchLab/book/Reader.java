public class Reader {

    public static void printToScreen(Book obj_book) {
        Book book = obj_book;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
