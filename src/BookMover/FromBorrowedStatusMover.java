package BookMover;

public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() != Status.BORROWED) {
            System.out.println("BookMover.Book is " + book.getStatus() + ". BookMover.Book's status BORROWED is required");
            return;
        }
        if(requestedStatus == Status.BORROWED){
            System.out.println("Invalid status. Move it according to scheme");
            return;
        }
        book.setStatus(requestedStatus);
        System.out.println("Moved successfully");
    }
}
