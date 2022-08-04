package guru.qa;

public class Pet {
    private String name;
    private int legs;
    private double age;
    private boolean isAquatic;
    private String animal;
    private double lifespan;
    private double percentage;

    public Pet(String name, int legs, double age, boolean isAquatic) {
        this.name = name;
        this.legs = legs;
        this.age = age;
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
                    this.lifespan = 3;
                } else {
                    this.animal = "Змея";
                    this.lifespan = 15;
                }
                break;
            case 2:
                if (isAquatic) {
                    this.animal = "Неизвестный зверь";
                } else {
                    this.animal = "Попугай";
                    this.lifespan = 20;
                }
                break;
            case 4:
                if (isAquatic) {
                    this.animal = "Черепаха";
                    this.lifespan = 30;
                } else {
                    this.animal = "Кошка";
                    this.lifespan = 15;
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

    void getRelativeAge() {
        if (animal == null) {
            System.out.println("Сначала узнаем что это за животное.");
            guessTheAnimal();
        }
        if (age <= 0) {
            if (age == 0) {
                System.out.println(name + " новорожденный.");
            } else if (age < 0) {
                System.out.println(name + " еще не родился.");
            }
        } else if (animal == "Неизвестный зверь") {
            System.out.println("Неизвестно сколько живут неизвестные звери.");
        } else {
            percentage = age / lifespan * 100;
            if (percentage > 0 && percentage <= 33) {
                System.out.println(name + " еще детёныш.");
            } else if (percentage > 33 && percentage <= 66) {
                System.out.println(name + " - взрослый зверь.");
            } else if (percentage > 66 && percentage <= 99) {
                System.out.println(name + " уже старичок.");
            } else {
                System.out.println(name + " - долгожитель!");
            }
        }
    }
}


