
public abstract class FoodDecorator implements Food{
        public String foods;
        public double price;
        public FoodDecorator(String foods, double price){
            this.foods = foods;
            this.price = price;
        }
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
