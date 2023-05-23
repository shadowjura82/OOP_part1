public class Griffindor extends Hogwarts {
    private final Integer nobility;
    private final Integer honor;
    private final Integer courage;

    public Griffindor(String firstName, String secondName, Integer magicPower, Integer transgressingDistance,
                      Integer nobility, Integer honor, Integer courage) {
        super(firstName, secondName, magicPower, transgressingDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public Integer getNobility() {
        return nobility;
    }

    public Integer getHonor() {
        return honor;
    }

    public Integer getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return super.toString() + "У студента присутствуют такие качества, как:" + '\n' +
                "Благородство - " + nobility + '\n' +
                "Честь - " + honor + '\n' +
                "Храбрость - " + courage + '\n';
    }

    public Integer summ() {
        return nobility + honor + courage;
    }
}
