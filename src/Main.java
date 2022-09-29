public class Main {
    public static void main(String[] args) {
        // Задача 6
        System.out.println("Задача 6");
        var boxer1Waight  = 78.2;
        var boxer2Waight  = 82.7;
        System.out.println("Общий вес двух бойцов: " + (boxer1Waight + boxer2Waight));
        System.out.println("Разница в весе двух бойцов: " + (boxer2Waight - boxer1Waight));

        // Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница весов двух бойцов (1 способ): " + (boxer2Waight - boxer1Waight));
        System.out.println("Разница весов двух бойцов (2 способ): " + (boxer2Waight % boxer1Waight));

        // Задача 8
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours / hoursPerDay;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");

        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * hoursPerDay;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + totalWorkingHours + " часа работы может быть поделено между сотрудниками ");

    }
}