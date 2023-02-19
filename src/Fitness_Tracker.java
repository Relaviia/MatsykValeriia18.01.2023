public class Fitness_Tracker {
  private String name;
  private int DOB;
  private int MOB;
  private int YOB;
  private String email;
  private String telephone;
 private  String surname;
  private double weight;
  private double pressure;
  private double steps;
    private int age;
  Fitness_Tracker( String name, int DOB, int MOB, int YOB, String email, String telephone, String surname,double weight,double pressure,double steps){
  this.name = name;
  this.DOB = DOB;
  this.MOB = MOB;
  this.YOB = YOB;
  this.email = email;
  this.telephone = telephone;
  this.surname = surname;
  this.weight = weight;
  this.pressure = pressure;
  this.steps = steps;
      this.age = 2020 - YOB;
  }
public String getname() {
    return this.name;
}
    public int getDOB() {
        return this.DOB;
}
    public int getMOB() {
        return this.MOB;
    }
    public int getYOB() {
        return this.YOB;
    }
    public String getemail() {
        return this.email;
    }
    public String gettelephone() {
        return this.telephone;
    }
    public String getsurname() {
        return this.surname;
    }
    public double getWeight() {
        return this.weight;
    }
    public double getpressure() {
        return this.pressure;
    }
    public double getsteps() {
        return this.steps;
    }
    public int getage() {
        return this.age;
    }
    public void setsurname(String surname) {
        this.surname = surname;
    }
    public void setweight(double weight) {
        this.weight = weight;
    }
    public void setpressure(double pressure) {
        this.pressure = pressure;
    }
    public void setsteps(double steps) {
        this.steps = steps;
    }

    public void printAccountInfo() {
        System.out.println(this);
    }

    public String toString() {
        return "Fitness_data:" +
                "name " + this.name + " " +
                "dayOfBirth " + this.DOB + " " +
                "monthOfBirth " + this.MOB + " " +
                "yearOfBirth " + this.YOB + " " +
                "email " + this.email + " " +
                "telephone " + this.telephone + " " +
                "surname " + this.surname + " " +
                "weight " + this.weight + " " +
                "pressure " + this.pressure + " " +
                "stepsByDay " + this.steps + " ";
    }
    public static void main(String args[]) {
        new Fitness_Tracker("Andrew", 15, 5, 1995, "andrew1995@gmail.com", "+2326595232", "Kingsman", 65, 85, 5800).printAccountInfo();
        new Fitness_Tracker("Nancy", 23, 9, 1979, "nancy1979@gmail.com", "+1465133123", "Lady", 55, 90, 10000).printAccountInfo();

        Fitness_Tracker Dan = new Fitness_Tracker("Dan", 16, 4, 1991, "dan@gmail.com", "+165165369", "Hill", 72, 89, 2030);
        Dan.printAccountInfo();
        Dan.setsurname("Pit");
        Dan.setweight(70);
        Dan.setpressure(100);
        Dan.setsteps(4050);
        Dan.printAccountInfo();
    }
}