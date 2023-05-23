public class Slizerin extends Hogwarts {
    private final Integer cunning;
    private final Integer determination;
    private final Integer ambition;
    private final Integer resourcefulness;
    private final Integer lustForPower;

    public Slizerin(String firstName, String secondName, Integer magicPower, Integer transgressingDistance, Integer cunning, Integer determination,
                    Integer ambition, Integer resourcefulness, Integer lustForPower) {
        super(firstName, secondName, magicPower, transgressingDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + "У студента присутствуют такие качества, как:" + '\n' +
                "Хитрость - " + cunning + '\n' +
                "Решительность - " + determination + '\n' +
                "Амбициозность - " + ambition + '\n' +
                "Находчивость - " + resourcefulness + '\n' +
                "Жажда власти - " + lustForPower + '\n';
    }

    public Integer summ() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
}
