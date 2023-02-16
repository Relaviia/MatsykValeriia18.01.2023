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

        System.out.println("Состав стандартного бургера: " + standart.bun + ", " + standart.meat + ", " + standart.cheese + ", " + standart.greens + ", " + standart.mayonnaise);
        burger diet = new burger();
        diet.bun = "bun";
        diet.meat = "meat";
        diet.cheese = "cheese";
        diet.greens = "greens";

        System.out.println("Состав диетического бургера: " + diet.bun + ", " + diet.meat + ", " + diet.cheese + ", " + diet.greens);
        burger kingsize = new burger();
        kingsize.bun = "bun";
        kingsize.meat = "meat";
        kingsize.cheese = "cheese";
        kingsize.greens = "greens";
        kingsize.mayonnaise = "double mayonnaise";

        System.out.println("Состав двойного бургера: " + kingsize.bun + ", " + kingsize.meat + ", " + kingsize.cheese + ", " + kingsize.greens + ", " + kingsize.mayonnaise);
    }
}