package entities;

public class Curriculum {

    private Name name;
    private Headline headline;
    private About about;

    public Curriculum(){}

    public Curriculum(Name name, Headline headline, About about){
        this.name = name;
        this.headline = headline;
        this.about = about;
    }

    @Override
    public String toString() {
        return "Curriculum: " + '\n' +
                "Name: " + name + '\n' +
                "Headline: " + headline + '\n' +
                "About: " + about;
    }
}
