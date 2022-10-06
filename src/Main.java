public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Author keyHorstmann = new Author("Key", "Horstmann");

        Book warAndPeace = new Book("War and peace", levTolstoy, 1865);
        Book cleanCode = new Book("Clean Code", keyHorstmann, 2000);
        Book newCleanCode = new Book("Clean Code", keyHorstmann, 2010);

        System.out.println("warAndPeace.levTolstoy = " + warAndPeace.getAuthor().getFirstName() + " " + warAndPeace.getAuthor().getLastName());
        System.out.println("cleanCode.publishYear = " + cleanCode.getPublishYear());

        cleanCode.setPublishYear(2010);
        System.out.println("cleanCode.publishYear " + cleanCode.getPublishYear());

        System.out.println(levTolstoy);

        System.out.println(warAndPeace);

        System.out.println(cleanCode.equals(warAndPeace));
        System.out.println(cleanCode.equals(newCleanCode));
    }


}