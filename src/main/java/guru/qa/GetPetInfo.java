package guru.qa;

public class GetPetInfo {
    public static void main(String[] args) {
        Pet gena = new Pet("Геннадий", 0, 0.5, true);
        gena.getRelativeAge();
        gena.animalSpeak();
    }
}
