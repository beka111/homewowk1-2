import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String  breed;
    private String[] comands;

    public Dog(String name, String breed, String[] comands,
               Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.comands = comands;
        super.setColor(color);
        super.setShelter(shelter);

    }
    public Dog(String name, String breed,
               Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getComands() {
        return comands;
    }

    public void setComands(String[] comands) {
        this.comands = comands;
    }
    public  void makeVoice(){
        System.out.println("Собака издает звук");
    }
    public  void makeVoice(String voice){
        System.out.println("Собака издает звук " + voice );
    }

    public String getInfo(){
        return  super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed +
                "\nComands: " + Arrays.toString(comands);

    }
}