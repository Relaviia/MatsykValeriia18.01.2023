public class burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    public static void main(String[] args) {
        burger standart = new burger();
        standart.bun = "bun";
        standart.meat = "meat";
        standart.cheese = "cheese";
        standart.greens = "greens";
        standart.mayonnaise = "mayonnaise";

        System.out.println("Состав стандартного бургера: " + standart.bun + ", " + standart.meat + ", " + standart.cheese + ", " + standart.greens  + ", " + standart.mayonnaise);
    }
}
