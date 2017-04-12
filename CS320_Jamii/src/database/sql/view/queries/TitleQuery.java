package database.sql.view.queries;
/*
import java.util.List;
import java.util.Scanner;

import model.Account;
import model.Group;
import database.DatabaseProvider;
import database.DerbyDatabase;
import database.IDatabase;

public class TitleQuery {
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);

		// Create the default IDatabase instance
		DatabaseProvider.setInstance(new DerbyDatabase());
		
		System.out.print("Enter a title: ");
		String title = keyboard.nextLine();
		
		// get the DB instance and execute transaction
		IDatabase db = DatabaseProvider.getInstance();
		List<Pair<Author, Book>> authorBookList = db.findAuthorAndBookByTitle(title);
		
		// check if anything was returned and output the list
		if (authorBookList.isEmpty()) {
			System.out.println("No books found with title <" + title + ">");
		}
		else {
			for (Pair<Author, Book> authorBook : authorBookList) {
				Author author = authorBook.getLeft();
				Book book = authorBook.getRight();
				System.out.println(author.getLastname() + "," + author.getFirstname() + "," + book.getTitle() + "," + book.getIsbn() + "," + book.getPublished());
			}
		}
	}
}*/
