public class AudioBook extends Title{

    private int durationInMinutes;

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        double result = 0;
        double pointsForType = calculateLiteraturePoints();
        result += (durationInMinutes * 0.5) * pointsForType * copies;
        return result;
    }

    @Override //Method to check how many points for a specifik literatureType.
    protected double calculateLiteraturePoints() {
        if(literatureType.equals("BI")){
            return 1.5;
        }
        else if(literatureType.equals("TE")){
            return 1.5;
        }
        else if(literatureType.equals("LYRIC")){
            return 3;
        }
        else if(literatureType.equals("FIC")){
            return 0.85;
        }
        else if(literatureType.equals("NF")){
            return 0.5;
        }
        return 0;
    }



}
