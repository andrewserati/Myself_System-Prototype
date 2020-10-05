package entities;

public class Headline {

    private String headline;

    public Headline(){}

    public Headline(String headline){
        this.headline = headline;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @Override
    public String toString() {
        return headline;
    }
}
