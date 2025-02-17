package pj;

import pj1.Book;

public class BookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setBookInfo("스프링5", "스프링에 관한 내용");
		book.bookInfoPrint();
		book.setBookInfo("스프링5", "스프링에 관한 내용", "최범균");
		book.bookInfoPrint();
		book.setBookInfo("스프링5", "스프링에 관한 내용", "최범균", "IT서적");
		book.bookInfoPrint();
		book.setBookInfo("스프링5", "스프링에 관한 내용", "최범균", "IT서적", 26500);
		book.bookInfoPrint();
	}

}
