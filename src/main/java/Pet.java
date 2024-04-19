import java.util.Random;

public class Pet {
    private int age = generateDefaulAge();
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter( Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaulAge(){
        Random random= new Random();
        return random.nextInt (12) +1;
    }
    public String getInfo(){
        return "Age : " +age +
                "\nColor : " + color +
                "\nShelter name : " + shelter.getName() +
                "\nShelter adress : " + shelter.getAdress();
    }
}