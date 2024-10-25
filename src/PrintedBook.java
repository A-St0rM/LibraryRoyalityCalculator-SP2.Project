public class PrintedBook extends Title{

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }


    @Override
    protected double calculatePoints() {
        double result = 0;
        double pointForType = calculateLiteraturePoints();
        result += pages * pointForType * copies;
        return result;
    }

    //Method to check how many points for a specifik literatureType.
    @Override
    protected double calculateLiteraturePoints() {
        if(literatureType.equals("BI")){
            return 3;
        }
        else if(literatureType.equals("TE")){
            return 3;
        }
        else if(literatureType.equals("LYRIC")){
            return 6;
        }
        else if(literatureType.equals("FIC")){
            return 1.7;
        }
        else if(literatureType.equals("NF")){
            return 1;
        }
        return 0;
    }
}
