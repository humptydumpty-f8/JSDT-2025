package lec8;

/**
 * Використання регулярних виразів в сетерах
 */
public class Ex3_1 {
    public static void main(String[] args) {

        class Book {
            private long ISBN;
            private String title;
            private String authors;
            private String publisher;
            private int yearOfPublication;
            private double price;

            public void setISBN(long ISBN) {
                if (Long.toString(ISBN).matches("[0-9]{13}")) this.ISBN = ISBN;
            }

            public void setTitle(String title) {
                if (title.matches("[A-Z][a-zA-Z0-9\\s]*")) this.title= title;
            }

            public void setAuthors(String authors) {
                if(authors.matches("[A-Z][a-zA-Z,.\\s]*")) this.authors = authors;
            }

            public void setPublisher(String publisher) {
                if(publisher.matches("[A-Z][a-zA-Z\\s]*")) this.publisher = publisher;
            }

            public void setYearOfPublication(int yearOfPublication) {
                if(Integer.toString(yearOfPublication).matches("(1|2)[0-9]{3}")) this.yearOfPublication = yearOfPublication;
            }

            public void setPrice(double price) {
                if (Double.toString(price).matches("[1-9][0-9]{2}"))this.price = price;
            }

            public Book() {
            }

            public Book(int ISBN, String title, String authors, String publisher, int yearOfPublication, double price) {
                setISBN(ISBN);
                setTitle(title);
                setAuthors(authors);
                setPublisher(publisher);
                setYearOfPublication(yearOfPublication);
                setPrice(price);
            }

            @Override
            public String toString() {
                return "Book{" +
                        "ISBN=" + ISBN +
                        ", title='" + title + '\'' +
                        ", authors='" + authors + '\'' +
                        ", publisher='" + publisher + '\'' +
                        ", yearOfPublication=" + yearOfPublication +
                        ", price=" + price +
                        '}';
            }
        }

        //Сценарій програми
        Book book = new Book(){{
            setISBN(1234567890123L);
            setTitle("Mastering Large Language Models with Python");
            setYearOfPublication(2024);
        }};
        System.out.println(book.toString());
    }
}
