package tdd;

public class Baby {
    private int age;
    private int weightInKg;
    private String name;

    public Baby(int babyWeightAtBirth){
    weightInKg = babyWeightAtBirth;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getWeightInKg() {
        return weightInKg;
    }

}
