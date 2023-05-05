package BookMover;

public class FromArchievedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() != Status.ARCHIVED) {
            System.out.println("BookMover.Book is " + book.getStatus() + ". BookMover.Book's status ARCHIEVED is required");
            return;
        }
        if (requestedStatus != Status.AVAILABLE) {
            return;
        }
        book.setStatus(requestedStatus);
        System.out.println("Moved successfully");
    }
}


