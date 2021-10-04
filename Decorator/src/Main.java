
public class Main {
    public static void main(String[] args){
        Food fi = new InitialFood();
            System.out.println(fi.ShowFoods());
            System.out.println(fi.ShowPrice());
        Food f1 = new First(fi.ShowFoods(), fi.ShowPrice());
            f1.addFood("Suchi");
            System.out.println(f1.ShowFoods());
            f1.addPrice(53);
            System.out.println(f1.ShowPrice());
        Food f2 = new Second(fi.ShowFoods(), fi.ShowPrice());
            f2.addFood("Biscuit");
            System.out.println(f2.ShowFoods());
            f2.addPrice(36.2);
            System.out.println(f2.ShowPrice());
        Food f3 = new Third(fi.ShowFoods(), fi.ShowPrice());
            f3.addFood("Sandwich");
            System.out.println(f3.ShowFoods());
            f3.addPrice(23);
            System.out.println(f3.ShowPrice());

    }

}
