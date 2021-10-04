
public class Second extends FoodDecorator {

    public Second(String foods, double price){
        super(foods,price);
    }
    @Override
    public void addFood(String food){
        this.foods+= ',' + food ;
    }

    @Override
    public void addPrice(double price) {
        this.price += price;
    }

    @Override
    public String ShowFoods() {
        return this.foods;
    }

    @Override
    public double ShowPrice() {
        return this.price;
    }
}
