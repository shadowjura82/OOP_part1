public class Kogtevran extends Hogwarts {
    private final Integer smart;
    private final Integer wise;
    private final Integer witty;
    private final Integer creativity;

    public Kogtevran(String firstName, String secondName, Integer magicPower, Integer transgressingDistance,
                     Integer smart, Integer wise, Integer witty, Integer creativity) {
        super(firstName, secondName, magicPower, transgressingDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public Integer getSmart() {
        return smart;
    }

    public Integer getWise() {
        return wise;
    }

    public Integer getWitty() {
        return witty;
    }

    public Integer getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return super.toString() + "У студента присутствуют такие качества, как:" + '\n' +
                "Ум - " + smart + '\n' +
                "Мудрость - " + wise + '\n' +
                "Остроумие - " + witty + '\n' +
                "Креативность - " + creativity + '\n';
    }

    public Integer summ() {
        return smart + wise + witty + creativity;
    }
}
