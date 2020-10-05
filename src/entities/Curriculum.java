package entities;

public class Curriculum {

    private Name name;
    private Headline headline;
    private About about;
    private Education education;

    public Curriculum(){}

    public Curriculum(Name name, Headline headline, About about, Education education){
        this.name = name;
        this.headline = headline;
        this.about = about;
        this.education = education;
    }

    @Override
    public String toString() {
        return "Curriculum: " + '\n' + '\n' +
                name + '\n' + '\n' +
                headline + '\n' + '\n' +
                about + '\n' + '\n' +
                education;
    }
}
