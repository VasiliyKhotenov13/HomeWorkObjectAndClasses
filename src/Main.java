public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("Стивен", "Кинг");
        Book SalemLot = new Book("Жребий Салема", stephenKing, 1975);
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и Мир", levTolstoy,1863);

        System.out.println("Название кники: " + SalemLot.getBookTitle());
        System.out.println("Автор книги: " + SalemLot.getAuthor());
        System.out.println("Дата публикации книги: " + SalemLot.getYearOfPublication());
        SalemLot.setYearOfPublication(1978);
        System.out.println("Дата публикации книги: " + SalemLot.getYearOfPublication());

        System.out.println();

        System.out.println("Название кники: " + warAndPeace.getBookTitle());
        System.out.println("Автор книги: " + warAndPeace.getAuthor());
        System.out.println("Дата публикации книги: " + warAndPeace.getYearOfPublication());
        warAndPeace.setYearOfPublication(1864);
        System.out.println("Дата публикации книги: " + warAndPeace.getYearOfPublication());

        System.out.println();

        System.out.println(stephenKing.toString());
        System.out.println(SalemLot.toString());
        System.out.println(levTolstoy.toString());
        System.out.println(warAndPeace.toString());

        System.out.println("Книги одинаковые: " + SalemLot.equals(warAndPeace));
        System.out.println("Авторы одни и те же: " + stephenKing.equals(levTolstoy));


    }
}