import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addTitle(Title title){
        titles.add(title);
    }

    public float calculateTotalPay(){
        float sum = 0;
        int count = 0;
        for (Title t : titles) {
            sum+=(float)titles.get(count).calculateRoyalty();
            count = count + 1;
        }
        return sum;
    }
}
