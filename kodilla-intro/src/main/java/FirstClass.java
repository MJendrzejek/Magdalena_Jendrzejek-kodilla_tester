public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2022);
        System.out.println(notebook.weight + " " + notebook.price +" "+ notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.year();

        Notebook heavyNotebook = new Notebook(2000, 2000, 2015);
        System.out.println(heavyNotebook.weight + " "+ heavyNotebook.price+" "+ heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.year();

        Notebook oldNotebook = new Notebook(1200, 599, 2004);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price+" "+ oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.year();
    }
}
