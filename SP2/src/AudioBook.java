public class AudioBook extends Title{

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        calculateLiteraturePoints();
        return (durationInMinutes * 0.5) * literatureTypePoints * copies;
    }

    @Override
    protected double calculateLiteraturePoints() {
        switch (literatureType) {
            case "BI":
                literatureTypePoints = (int) 1.5;
                break;
            case "TE":
                literatureTypePoints = (int) 1.5;
                break;
            case "LYRIK":
                literatureTypePoints = 3;
                break;
            case "SKØN":
                literatureTypePoints = (int) 0.85;
                break;
            case "FAG":
                literatureTypePoints = (int) 0.5;
                break;
            default:
                literatureTypePoints = 0;
        }
        return 0;
    }
}
