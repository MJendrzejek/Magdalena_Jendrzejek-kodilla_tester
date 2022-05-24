public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice(){
        if (this.price <600){
            System.out.println("This notebook is very cheap.");
        }
            else if (this.price >=600 && this.price <=1000){
                System.out.println("This notebook is good.");
            }
            else {
                System.out.println("This notebook is expensive.");
            }
    }
    public void checkWeight(){
        if (this.weight <= 1000) {
            System.out.println("This notebook is slight.");
        }
        else if(this.weight >1000 && this.weight <=1600){
            System.out.println("This notebook is not very heavy.");
        }
        else {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void year(){
        if (this.year >2004 && this.price < 2000) {
            System.out.println("This is a very good choice!");
        }
            else if (this.year <= 2004 && this.price < 900){
                System.out.println("It's old but still gold.");
            }
            else if (this.year <=2022 && this.price < 2000){
                System.out.println("This notebook is in good price and not that old.");
            }
            else {
                System.out.println("This is expensive notebook");
            }
        }
}


