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
    public String compareStudent(Object student1, Object student2) {
        Integer magicPower1 = -1;
        Integer transgressingDistance1 = -1;
        Integer magicPower2 = -1;
        Integer transgressingDistance2 = -1;
        String name1, name2, response;

        if (student1 instanceof Griffindor) {
            magicPower1 = ((Griffindor) student1).getMagicPower();
            transgressingDistance1 = ((Griffindor) student1).getTransgressingDistance();
            name1 = ((Griffindor) student1).getFirstName() + " " + ((Griffindor) student1).getSecondName();
        } else if (student1 instanceof Puffenduy) {
            magicPower1 = ((Puffenduy) student1).getMagicPower();
            transgressingDistance1 = ((Puffenduy) student1).getTransgressingDistance();
            name1 = ((Puffenduy) student1).getFirstName() + " " + ((Puffenduy) student1).getSecondName();
        } else if (student1 instanceof Kogtevran) {
            magicPower1 = ((Kogtevran) student1).getMagicPower();
            transgressingDistance1 = ((Kogtevran) student1).getTransgressingDistance();
            name1 = ((Kogtevran) student1).getFirstName() + " " + ((Kogtevran) student1).getSecondName();
        } else if (student1 instanceof Slizerin) {
            magicPower1 = ((Slizerin) student1).getMagicPower();
            transgressingDistance1 = ((Slizerin) student1).getTransgressingDistance();
            name1 = ((Slizerin) student1).getFirstName() + " " + ((Slizerin) student1).getSecondName();
        } else {
            return "Студент не учится в Хогвартсе";
        }

        if (student2 instanceof Griffindor) {
            magicPower2 = ((Griffindor) student2).getMagicPower();
            transgressingDistance2 = ((Griffindor) student2).getTransgressingDistance();
            name2 = ((Griffindor) student2).getFirstName() + " " + ((Griffindor) student2).getSecondName();
        } else if (student2 instanceof Puffenduy) {
            magicPower2 = ((Puffenduy) student2).getMagicPower();
            transgressingDistance2 = ((Puffenduy) student2).getTransgressingDistance();
            name2 = ((Puffenduy) student2).getFirstName() + " " + ((Puffenduy) student2).getSecondName();
        } else if (student2 instanceof Kogtevran) {
            magicPower2 = ((Kogtevran) student2).getMagicPower();
            transgressingDistance2 = ((Kogtevran) student2).getTransgressingDistance();
            name2 = ((Kogtevran) student2).getFirstName() + " " + ((Kogtevran) student2).getSecondName();
        } else if (student2 instanceof Slizerin) {
            magicPower2 = ((Slizerin) student2).getMagicPower();
            transgressingDistance2 = ((Slizerin) student2).getTransgressingDistance();
            name2 = ((Slizerin) student2).getFirstName() + " " + ((Slizerin) student2).getSecondName();
        } else {
            return "Студент не учится в Хогвартсе";
        }

        if (magicPower1 > magicPower2) {
            response = name1 + " обладает большей мощностью магии, чем " + name2;
        } else {
            response = name2 + " обладает большей мощностью магии, чем " + name1;
        }
        response += '\n';
        if (transgressingDistance1 > transgressingDistance2) {
            response += name1 + " обладает большей способностью трансгрессировать на какое-то расстояние, чем " + name2;
        } else {
            response += name2 + " обладает большей способностью трансгрессировать на какое-то расстояние, чем " + name1;
        }

        return response;
    }
}
