import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles = new ArrayList<>();
    Title title;

    public Author(String name) {
        this.name = name;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public float calculateTotalPay(){
        float total = 0;
        for(Title title : titles){
            total += title.calculateRoyality();
        }
        return total;
    }

    public String getName() {
        return name;
    }
}
