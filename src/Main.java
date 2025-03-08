//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
        }
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний");
        }
        if (age < 18) {
            System.out.printf("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("\nНа улице " + temperature + " градусов, " + "нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, " + "можно идти без шапки");
        }
        int speed = 65;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        int yearsOld = 23;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");
        }
        if (yearsOld >= 7 && yearsOld <= 17) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
        }
        if (yearsOld >= 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет");
        }
        if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу");
        }
        int childAge = 13;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }
        if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении");
        }
        if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        int peopleInTheCarriage = 59;
        if (peopleInTheCarriage < 60) {
            System.out.println("Если в вагоне находится " + peopleInTheCarriage + " людей, то в вагоне есть сидячее место");
            if (peopleInTheCarriage > 60 && peopleInTheCarriage <= 102) {
                System.out.println("Если в вагоне находится " + peopleInTheCarriage + " людей, то в вагоне осталось только стоячее место");
            }
        } else {
            System.out.println("Если в вагоне находится " + peopleInTheCarriage + " людей, то в вагоне не осталось мест");
        }
        int one = 1;
        if (one > 2) {
            System.out.println("Самое большее из трех чисел - 1");
        }
        int two = 2;
        if (two > 3) {
            System.out.println("Самое большее из трех чисел - 2");
        } else {
            System.out.println("Самое большее из трех чисел - 3");
            int three = 3;
        }
    }
}



