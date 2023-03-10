public class Film {
    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori){
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Actor[] getActori() {
        return actori;
    }

    public String getNume() {
        return nume;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }
}
