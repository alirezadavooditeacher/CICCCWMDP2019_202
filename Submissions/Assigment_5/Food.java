package app;

import java.util.ArrayList;

public class Food extends Product {
  private int foodId;
  private String foodName;
  private float foodPrice;
  private String foodMadeInCountry;
  private int foodCalorie;
  private int foodSize;
  private ArrayList<String> foodIngredients;

  public Food(int foodId, String foodName, float foodPrice, String foodMadeInCountry, int foodCalorie, int foodSize,
      ArrayList<String> foodIngredients) {
    super(foodId, foodName, foodPrice, foodMadeInCountry);
    this.foodId = foodId;
    this.foodName = foodName;
    this.foodPrice = foodPrice;
    this.foodMadeInCountry = foodMadeInCountry;
    this.foodCalorie = foodCalorie;
    this.foodSize = foodSize;
    this.setFoodIngredients(foodIngredients);
  }

  public ArrayList<String> getFoodIngredients() {
    return foodIngredients;
  }

  public void setFoodIngredients(ArrayList<String> foodIngredients) {
    this.foodIngredients = foodIngredients;
  }

  public int getFoodId() {
    return this.foodId;
  }

  public void setFoodId(int foodId) {
    this.foodId = foodId;
  }

  public String getFoodName() {
    return this.foodName;
  }

  public void setFoodName(String foodName) {
    this.foodName = foodName;
  }

  public float getFoodPrice() {
    return this.foodPrice;
  }

  public void setFoodPrice(float foodPrice) {
    this.foodPrice = foodPrice;
  }

  public String getFoodMadeInCountry() {
    return this.foodMadeInCountry;
  }

  public void setFoodMadeInCountry(String foodMadeInCountry) {
    this.foodMadeInCountry = foodMadeInCountry;
  }

  public int getFoodCalorie() {
    return this.foodCalorie;
  }

  public void setFoodCalorie(int foodCalorie) {
    this.foodCalorie = foodCalorie;
  }

  public int getFoodSize() {
    return foodSize;
  }

  public Float getPrice() {
    return foodPrice;
  }
}