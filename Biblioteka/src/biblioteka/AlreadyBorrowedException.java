
package biblioteka;

public class AlreadyBorrowedException extends Exception {

    public AlreadyBorrowedException() {
    }

    public AlreadyBorrowedException(String msg) {
        super(msg);
    }
}
