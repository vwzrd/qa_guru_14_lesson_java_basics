package guru.qa;

public class Pet {
    private String name;
    private int legs;
    private boolean isAquatic;
    private String animal;

    public Pet(String name, int legs, boolean isAquatic) {
        this.name = name;
        this.legs = legs;
        this.isAquatic = isAquatic;
    }

    private void sayTheAnimal() {
            System.out.println(name + " - это " + animal + "!");
    }

    void guessTheAnimal() {
        switch (legs) {
            case 0:
                if (isAquatic) {
                    this.animal = "Рыба";
                } else {
                    this.animal = "Змея";
                }
                break;
            case 2:
                if (isAquatic) {
                    this.animal = "Неизвестный зверь";
                } else {
                this.animal = "Попугай";
                }
                break;
            case 4:
                if (isAquatic) {
                    this.animal = "Черепаха";
                } else {
                    this.animal = "Кошка";
                }
                break;
            default:
                this.animal = "Неизвестный зверь";
        }
        sayTheAnimal();
    }

    void animalSpeak() {
        if (animal == null) {
            System.out.println("Перед тем как питомец заговорит, нужно узнать что это за животное.");
            guessTheAnimal();
        }
        switch (animal) {
            case "Рыба":
                System.out.println(name + " говорит 'Буль-буль'.");
                break;
            case "Змея":
                System.out.println(name + " говорит 'C-c-c'.");
                break;
            case "Попугай":
                System.out.println(name + " говорит 'Hello world!'.");
                break;
            case "Черепаха":
                System.out.println(name + " говорит 'Кх-кх'.");
                break;
            case "Кошка":
                System.out.println(name + " говорит 'Мяу'.");
                break;
            default:
                System.out.println("Неизвестный зверь отказывается говорить.");
        }
    }
}

