package Tesr;

public class Book {
    // the title, the number of pages and the publication year
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getName() {
        // return this.title;
        return title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return this.title + " " + this.pages + " " + this.year;
    }
}
