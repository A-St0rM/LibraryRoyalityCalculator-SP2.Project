public abstract class Title { //This is our superclass. It is used for subclasses, PrintedBook and AudioBook
    private String title;
    protected String literatureType;
    protected int copies;
    protected double rate = 0.067574;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    //Calculating RoyalityPoints for every title for the author. Is in superclass, it doesn't change code body.
    public double calculateRoyality(){
        double result = 0;
        result += calculatePoints() * rate;
        return result;
    }

    // Two abstract methods for our subclasses.
    protected abstract double calculatePoints();

    protected abstract double calculateLiteraturePoints();


}
