//Library Management System.                                                                      Book should have information: Book name, Book Author, Issued to, Issued on, Users should be able to add books,return issued books, issue books.                                             Assume that all users are registered with their names in the central database.
package com.company;

import java.util.ArrayList;

class Book{
     public String name,author;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class MyLibrary{
    public ArrayList<Book>books;
    public MyLibrary(ArrayList<Book>books){
        for (Book b:books){
            this.books=books;
        }
    }
    public void addBook(Book book){
        this.books.add(book);
        System.out.println("The book has been added!");
    }
    public void issueBook(Book book,String issued_to){
        this.books.remove(book);
        System.out.println("The book has been issued from the library!"+ issued_to);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned!");
        this.books.add(b);
    }
}
public class library_mgmt {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithms","CLRS");
        bk.add(b1);
        Book b2 = new Book("Algorithms2","CLRS2");
        bk.add(b2);
        Book b3 = new Book("Algorithms3","CLRS3");
        bk.add(b3);
       MyLibrary l = new MyLibrary(bk);
       l.addBook(new Book("Algorithm4","CLRS"));
        System.out.println(l.books);
       l.issueBook(b3,"Harry");
        System.out.println(l.books); //book deleted from Arraylist.
    }
}
