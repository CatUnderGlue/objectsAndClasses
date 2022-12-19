public class Main {
    public static void main(String[] args) {
        Author francis = new Author("Френсис", "Фицджеральд");
        Author alex = new Author("Александр", "Пушкин");
        Book firstBook = new Book("Загадочная история Бенджамина Баттона", francis, 1922);
        Book secondBook = new Book("Капитанская дочка", alex, 1936);
        secondBook.setYearOfPublication(1937);

        System.out.printf("Автор книги %s, %d года выпуска - %s %s%n", firstBook.getTitle(), firstBook.getYearOfPublication(), firstBook.getAuthor().getFirstName(), firstBook.getAuthor().getLastName());
        System.out.printf("Автор книги %s, %d года выпуска - %s %s%n", secondBook.getTitle(), secondBook.getYearOfPublication(), secondBook.getAuthor().getFirstName(), secondBook.getAuthor().getLastName());
    }
}