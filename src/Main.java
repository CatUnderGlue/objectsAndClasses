public class Main {
    public static void main(String[] args) {
        Author Francis = new Author("Френсис", "Фицджеральд");
        Author Alex = new Author("Александр", "Пушкин");
        Book firstBook = new Book("Загадочная история Бенджамина Баттона", Francis, 1922);
        Book secondBook = new Book("Капитанская дочка", Alex, 1936);
        secondBook.setYearOfPublication(1937);

        System.out.printf("Автор книги %s, %d года выпуска - %s %s%n", firstBook.getTitle(), firstBook.getYearOfPublication(), firstBook.getAuthor().getFirstName(), firstBook.getAuthor().getLastName());
        System.out.printf("Автор книги %s, %d года выпуска - %s %s%n", secondBook.getTitle(), secondBook.getYearOfPublication(), secondBook.getAuthor().getFirstName(), secondBook.getAuthor().getLastName());
    }
}