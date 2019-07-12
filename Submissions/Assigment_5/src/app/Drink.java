package app;

public class Drink extends Product {
  private int drinkID;
  private String drinkName;
  private float drinkPrice;
  private String drinkMadeInCountry;
  private Boolean isDrinkDiet;
  private int drinkSize;

  public Drink(int drinkID, String drinkName, float drinkPrice, String drinkMadeInCountry, Boolean isDrinkDiet,
      int drinkSize) {
    super(drinkID, drinkName, drinkPrice, drinkMadeInCountry);
    this.setDrinkID(drinkID);
    this.setDrinkName(drinkName);
    this.setDrinkPrice(drinkPrice);
    this.drinkMadeInCountry = drinkMadeInCountry;
    this.isDrinkDiet = isDrinkDiet;
    this.drinkSize = drinkSize;
  }

  public String getDrinkMadeInCountry() {
    return this.drinkMadeInCountry;
  }

  public void setDrinkMadeInCountry(String drinkMadeInCountry) {
    this.drinkMadeInCountry = drinkMadeInCountry;
  }

  public Boolean getIsDrinkDiet() {
    return this.isDrinkDiet;
  }

  public void isIsDrinkDiet(Boolean isDrinkDiet) {
    this.isDrinkDiet = isDrinkDiet;
  }

  public int getDrinkSize() {
    return this.drinkSize;
  }

  public void setDrinkSize(int drinkSize) {
    this.drinkSize = drinkSize;
  }

  public float getDrinkPrice() {
    return drinkPrice;
  }

  public void setDrinkPrice(float drinkPrice) {
    this.drinkPrice = drinkPrice;
  }

  public String getDrinkName() {
    return drinkName;
  }

  public void setDrinkName(String drinkName) {
    this.drinkName = drinkName;
  }

  public int getDrinkID() {
    return drinkID;
  }

  public void setDrinkID(int drinkID) {
    this.drinkID = drinkID;
  }
}