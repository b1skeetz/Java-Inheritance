package BookMover;

public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() != Status.AVAILABLE) {
            System.out.println("BookMover.Book is " + book.getStatus() + ". BookMover.Book's status AVAILABLE is required");
            return;
        }
        switch (requestedStatus) {
            case ARCHIVED, BORROWED -> {
                book.setStatus(requestedStatus);
                System.out.println("Moved successfully");
            }
            default -> System.out.println("Invalid status. Move it according to scheme");
        }
    }
}
