public class LibraryRoyalityCalculator {
    public static void main(String[] args) {

        Author author = new Author("Harper Lee");

        Title printedBook1 = new PrintedBook("To kill a mockingbird","NF",140,200);
        Title printedBook2 = new PrintedBook("Fourth Wing","FIC",200,380);
        Title audioBook = new AudioBook("Yellowface","TE", 100,120);


        author.addTitle(printedBook1);
        author.addTitle(printedBook2);
        author.addTitle(audioBook);

        float totalPay = author.calculateTotalPay();

        System.out.println(author.getName() + ": " + totalPay );
    }
}
