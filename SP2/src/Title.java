public abstract class Title {
    private String title;
    protected String literatureType;
    protected int literatureTypePoints;
    protected int copies;
    protected double rate;

    public  Title(String title, String literatureType, int copies){
      this.title = title;
      this.literatureType = literatureType;
      this.copies = copies;
    }
    public  double calculateRoyalty(){
     return calculatePoints() * 0.067574;
    }
    protected abstract double calculatePoints();
    protected abstract double calculateLiteraturePoints();
}
