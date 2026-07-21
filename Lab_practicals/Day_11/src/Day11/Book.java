package Day11;

public class Book {
	String bookId;
    String title;
    String author;
    boolean isIssued;

    void assign(String id, String t, String a) {
        bookId = id;
        title = t;
        author = a;
        isIssued = false;
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    void displayBook() {
    	if(isIssued) {
    		System.out.println("Book Status: Issued");
    	}
    	else {
    		System.out.println("Book Status: Available");
    	}
}
}