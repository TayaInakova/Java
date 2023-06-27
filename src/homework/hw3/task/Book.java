package homework.hw3.task;

public class Book {
    private String bookName;
    private String surnameOfAuthor;
    private Integer price;
    private Integer publicationDate;
    private Integer pageCount;

    public Book(String bookName, String surnameOfAuthor, Integer price, Integer publicationDate, Integer pageCount) {
        this.bookName = bookName;
        this.surnameOfAuthor = surnameOfAuthor;
        this.price = price;
        this.publicationDate = publicationDate;
        this.pageCount = pageCount;
    }

    public Book() {

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getSurnameOfAuthor() {
        return surnameOfAuthor;
    }

    public void setSurnameOfAuthor(String surnameOfAuthor) {
        this.surnameOfAuthor = surnameOfAuthor;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Integer publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Назание: '" + bookName + '\'' +
                ", Фамилия автора: '" + surnameOfAuthor + '\'' +
                ", Цена: " + price +
                ", Год издания: " + publicationDate +
                ", Количество страниц: " + pageCount +
                "}\n";
    }
}
