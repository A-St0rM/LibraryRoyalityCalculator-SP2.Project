public class PrintedBook extends Title{

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }


    @Override
    protected double calculatePoints() {
        return 0;
    }

    @Override
    protected double calculateLiteraturePoints() {
        return 0;
    }
}
