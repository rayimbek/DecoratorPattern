public class InitialFood implements Food{
    private String foods = "Neapalian Pizza";
    private double price = 60.0;

    @Override
    public void addFood(String food){
        this.foods+=food;
    }

    @Override
    public void addPrice(double price) {
        this.price +=price;
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
