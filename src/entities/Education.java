package entities;

public class Education {

    private String school;
    private String degree;
    private String field;
    private Integer yearStart;
    private Integer yearEnd;

    public Education(){}

    public Education(String school, String degree, String field, Integer yearStart, Integer yearEnd) {
        this.school = school;
        this.degree = degree;
        this.field = field;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
    }

    @Override
    public String toString() {
        return  "Education: " + '\n' +
                "School: " + school + '\n' +
                "Degree: " + degree + '\n' +
                "Field: " + field + '\n' +
                "Year start: " + yearStart + '\n' +
                "Year end: " + yearEnd;
    }
}
