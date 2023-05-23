public class Hogwarts {
    private final String firstName;
    private final String secondName;
    private final Integer magicPower;
    private final Integer transgressingDistance;

    public Hogwarts(String firstName, String secondName, Integer magicPower, Integer transgressingDistance) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.magicPower = magicPower;
        this.transgressingDistance = transgressingDistance;
    }

    public Integer getMagicPower() {
        return magicPower;
    }

    public Integer getTransgressingDistance() {
        return transgressingDistance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Студент " + firstName + " " + secondName + " имеет силу магии " + magicPower +
                " и может трансгрессировать на расстояние " + transgressingDistance + '\n';
    }
}
