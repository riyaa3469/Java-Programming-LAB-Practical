package Day11;

public class Book_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
        book.assign("B101", "Core Java", "Cay Horstmann");
        book.issueBook();
        book.displayBook();
        book.returnBook();
        book.displayBook();
	}

}
