public class MethodsSet {

    // Метод для вывода информации о студенте в консоль
    public String printStudent(Object student) {
        if (student instanceof Griffindor) {
            student = (Griffindor) student;
            return "Студент учится на факультете Гриффиндор. \n" + student.toString();
        } else if (student instanceof Puffenduy) {
            student = (Puffenduy) student;
            return "Студент учится на факультете Пуффендуй. \n" + student.toString();
        } else if (student instanceof Kogtevran) {
            student = (Kogtevran) student;
            return "Студент учится на факультете Когтевран. \n" + student.toString();
        } else if (student instanceof Slizerin) {
            student = (Slizerin) student;
            return "Студент учится на факультете Слизерин. \n" + student.toString();
        }
        return "Студент не учится в Хогвартсе";
    }

    // Следующие 4 метода используются для сравнения студентов в рамках одного факультета
    public void bestGriffindor(Object student1, Object student2) {
        if (student1 instanceof Griffindor && student2 instanceof Griffindor) {
            if (((Griffindor) student1).summ() > ((Griffindor) student2).summ()) {
                System.out.println(((Griffindor) student1).getFirstName() + " лучший Гриффиндорец, чем "
                        + ((Griffindor) student2).getFirstName());
            } else {
                System.out.println(((Griffindor) student2).getFirstName() + " лучший Гриффиндорец, чем "
                        + ((Griffindor) student1).getFirstName());
            }
        } else {
            System.out.println("Студенты учатся на разных факультетах");
        }
    }

    public void bestPuffenduy(Object student1, Object student2) {
        if (student1 instanceof Puffenduy && student2 instanceof Puffenduy) {
            if (((Puffenduy) student1).summ() > ((Puffenduy) student2).summ()) {
                System.out.println(((Puffenduy) student1).getFirstName() + " лучший Пуффендуец, чем "
                        + ((Puffenduy) student2).getFirstName());
            } else {
                System.out.println(((Puffenduy) student2).getFirstName() + " лучший Пуффендуец, чем "
                        + ((Puffenduy) student1).getFirstName());
            }
        } else {
            System.out.println("Студенты учатся на разных факультетах");
        }
    }

    public void bestKogtevran(Object student1, Object student2) {
        if (student1 instanceof Kogtevran && student2 instanceof Kogtevran) {
            if (((Kogtevran) student1).summ() > ((Kogtevran) student2).summ()) {
                System.out.println(((Kogtevran) student1).getFirstName() + " лучший Когтевранец, чем "
                        + ((Kogtevran) student2).getFirstName());
            } else {
                System.out.println(((Kogtevran) student2).getFirstName() + " лучший Когтевранец, чем "
                        + ((Kogtevran) student1).getFirstName());
            }
        } else {
            System.out.println("Студенты учатся на разных факультетах");
        }
    }

    public void bestSlizerin(Object student1, Object student2) {
        if (student1 instanceof Slizerin && student2 instanceof Slizerin) {
            if (((Slizerin) student1).summ() > ((Slizerin) student2).summ()) {
                System.out.println(((Slizerin) student1).getFirstName() + " лучший Слизеринец, чем "
                        + ((Slizerin) student2).getFirstName());
            } else {
                System.out.println(((Slizerin) student2).getFirstName() + " лучший Слизеринец, чем "
                        + ((Slizerin) student1).getFirstName());
            }
        } else {
            System.out.println("Студенты учатся на разных факультетах");
        }
    }

    // Метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии
    // Реализация этого метода мне оооочень не нравится, но я не знаю как его оптимизировать. Дело в том, что я не знаю как
    // получить доступ к общим полям (полям родителя) без приведения типа от Object к конкретному классу
    // Подскажите, пожалуйста как можно оптимизировать?
    public void compareStudent(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagicPower() > student2.getMagicPower()) {
            System.out.println(student1.getFirstName() + " " + student1.getSecondName() + " обладает большей мощностью магии, " +
                    "чем " + student2.getFirstName() + " " + student2.getSecondName());
        } else {
            System.out.println(student2.getFirstName() + " " + student2.getSecondName() + " обладает большей мощностью магии, " +
                    "чем " + student1.getFirstName() + " " + student1.getSecondName());
        }
        if (student1.getTransgressingDistance() > student2.getTransgressingDistance()) {
            System.out.println(student1.getFirstName() + " " + student1.getSecondName() + " обладает большим расстоянием трансгрессии, " +
                    "чем " + student2.getFirstName() + " " + student2.getSecondName());
        } else {
            System.out.println(student2.getFirstName() + " " + student2.getSecondName() + " обладает большим расстоянием трансгрессии, " +
                    "чем " + student1.getFirstName() + " " + student1.getSecondName());
        }
    }
}
