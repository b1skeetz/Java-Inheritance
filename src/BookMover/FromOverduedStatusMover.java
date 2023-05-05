package BookMover;

public class FromOverduedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch(book.getStatus()){
            case OVERDUED:
                switch(requestedStatus){
                    case ARCHIVED, AVAILABLE -> {
                        book.setStatus(requestedStatus);
                        System.out.println("Moved successfully");
                    }
                    default -> System.out.println("Invalid status. Move it according to scheme");
                }
                break;
            default: System.out.println("BookMover.Book is " + book.getStatus() + ". BookMover.Book's status AVAILABLE is required");
        }
    }
}