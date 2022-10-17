public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // Задача 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Задача 3
        dog = dog - 3;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        var fighter1 = 78.2;
        var fighter2 = 82.7;
        var sumWeight = fighter1 + fighter2;
        System.out.println("Общий вес двух бойцов " + sumWeight + " кг");
        var diffWeight = fighter2 - fighter1;
        System.out.println("Разница между весами бойцов " + diffWeight + " кг");

        // Задача 7
        diffWeight = fighter2 - fighter1;
        System.out.println(diffWeight);
        diffWeight = fighter2 % fighter1;
        System.out.println(diffWeight);

        // Задача 8
        var workHours = 640;
        var personalHours = 8;
        var employees = 640 / 8;
        System.out.println("Всего работников в компании - " + employees + " человек.");
        employees = employees + 94;
        workHours = employees * personalHours;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками.");
    }
}