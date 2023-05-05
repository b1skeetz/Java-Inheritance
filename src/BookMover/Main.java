package BookMover;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings"); // AVAILABLE
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromArchievedStatusMover = new FromArchievedStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();


        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println(book.getStatus()); // AVAILABLE -> ARCHIVED

        fromArchievedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus()); // ARCHIVED -> AVAILABLE

        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus()); // AVAILABLE -> BORROWED

        fromBorrowedStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getStatus()); // BORROWED -> OVERDUED

        fromOverduedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus()); // OVERDUED -> AVAILABLE
    }
}
