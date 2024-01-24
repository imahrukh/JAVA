class Noodle1 {
  
  protected double lengthInCentimeters;
  protected double widthInCentimeters;
  protected String shape;
  protected String ingredients;
  protected String texture = "brittle";
  
  Noodle1(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public String getCookPrep() {
    
    return "Boil noodle for 7 minutes and add sauce.";
    
  }
  
  public static void main(String[] args) {
    
    Noodle1 spaghetti, ramen, pho;
    
    spaghetti = new Spaghetti();
    ramen = new Ramen();
    pho = new Pho();
    
    Noodle1[] allTheNoodles = {spaghetti, ramen, pho};
    for(Noodle1 noodle: allTheNoodles){
      System.out.println(noodle.getCookPrep());
    } 
  } 
}
