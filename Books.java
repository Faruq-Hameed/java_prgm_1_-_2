
public class Books {

    private String name;
    private int publicationYear;

    public Books(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compare) {
        // check if they reference same location in memory
        if (this == compare) {
            return true;
        }

        // compare if they are from different instances i.e from diff class
        if (!(compare instanceof Books)) {
            return false;
        }

        // type cast and check for variables equality
        Books books = (Books) compare;
        return this.name.equals(books.name) && this.publicationYear == books.publicationYear;
    }

}
