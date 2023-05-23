import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Заполнение массива студентами и создание экземпляра для работы с данными
        Object[] students = new Object[]{
                new Griffindor("Гарри", "Поттер", rnd(), rnd(), rnd(), rnd(), rnd()),
                new Griffindor("Гермиона", "Грейнджер", rnd(), rnd(), rnd(), rnd(), rnd()),
                new Griffindor("Рон", "Уизли", rnd(), rnd(), rnd(), rnd(), rnd()),
                new Slizerin("Драко", "Малфой", rnd(), rnd(), rnd(), rnd(), rnd(), rnd(), rnd()),
                new Slizerin("Грэхэм", "Монтегю", rnd(), rnd(), rnd(), rnd(), rnd(), rnd(), rnd()),
                new Slizerin("Грегори", "Гойл", rnd(), rnd(), rnd(), rnd(), rnd(), rnd(), rnd()),
                new Puffenduy("Захария", "Смит", rnd(), rnd(), rnd(), rnd(), rnd()),
                new Puffenduy("Седрик", "Диггори", rnd(), rnd(), rnd(), rnd(), rnd()),
                new Puffenduy("Джастин", "Финч-Флетчли", rnd(), rnd(), rnd(), rnd(), rnd()),
                new Kogtevran("Чжоу", "Чанг", rnd(), rnd(), rnd(), rnd(), rnd(), rnd()),
                new Kogtevran("Падма", "Патил", rnd(), rnd(), rnd(), rnd(), rnd(), rnd()),
                new Kogtevran("Маркус", "Белби", rnd(), rnd(), rnd(), rnd(), rnd(), rnd())
        };
        MethodsSet methodsSet = new MethodsSet();

        // Выполнение задания
        printDevider("Метод, который выводит на экран описание студента");
        System.out.println(methodsSet.printStudent(students[0]));
        printDevider("Методы, которые сравнивают между собой двух учеников одного факультета по свойствам");
        methodsSet.bestGriffindor(students[0], students[2]);
        methodsSet.bestKogtevran(students[10],students[11]);
        methodsSet.bestPuffenduy(students[6],students[8]);
        methodsSet.bestSlizerin(students[3],students[4]);
        methodsSet.bestSlizerin(students[3],students[10]);
        methodsSet.bestSlizerin(students[3],students[6]);
        printDevider("Метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии");
        System.out.println(methodsSet.compareStudent(students[0], students[2]));
        System.out.println();
        System.out.println(methodsSet.compareStudent(students[6],students[8]));
        System.out.println();
        System.out.println(methodsSet.compareStudent(students[3],students[10]));
        System.out.println();
        System.out.println(methodsSet.compareStudent(students[3],students[6]));
    }

    public static Integer rnd() {
        Random rnd = new Random();
        return rnd.nextInt(100);
    }

    public static void printDevider(String str) {
        System.out.println("******************************************************************************************");
        System.out.println(str);
        System.out.println("******************************************************************************************");
    }
}