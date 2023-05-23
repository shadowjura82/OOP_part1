public class Puffenduy extends Hogwarts {
    private final Integer hardworking;
    private final Integer loyal;
    private final Integer honest;

    public Puffenduy(String firstName, String secondName, Integer magicPower, Integer transgressingDistance,
                     Integer hardworking, Integer loyal, Integer honest) {
        super(firstName, secondName, magicPower, transgressingDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public Integer getHardworking() {
        return hardworking;
    }

    public Integer getLoyal() {
        return loyal;
    }

    public Integer getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return super.toString() + "У студента присутствуют такие качества, как:" + '\n' +
                "Трудолюбие - " + hardworking + '\n' +
                "Лояльность - " + loyal + '\n' +
                "Честность - " + honest + '\n';
    }

    public Integer summ() {
        return hardworking + loyal + honest;
    }
}
