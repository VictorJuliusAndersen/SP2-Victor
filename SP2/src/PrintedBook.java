public class PrintedBook extends Title {
    private int pages;
    public PrintedBook(String title, String literatureType, int copies, int pages){
       super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {
        calculateLiteraturePoints();
        return pages * literatureTypePoints * copies;
    }

    @Override
    protected double calculateLiteraturePoints() {
        switch (literatureType) {
            case "BI":
                literatureTypePoints = 3;
                break;
            case "TE":
                literatureTypePoints = 3;
                break;
            case "LYRIK":
                literatureTypePoints = 6;
                break;
            case "SKØN":
                literatureTypePoints = (int) 1.7;
                break;
            case "FAG":
                literatureTypePoints = 1;
                break;
            default:
                literatureTypePoints = 0;
        }
        return 0;
    }
}
