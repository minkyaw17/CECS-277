public class Education {
    private String Major;
    private int Research;
    private Degree degree;

    public enum Degree {
        MS, PhD
    }

    public Education() {
        super();
    }

    public Education(String major, int research, Degree degree) {
        this.Major = major;
        this.Research = research;
        this.degree = degree;
    }

    public void setMajor(String major) {
        this.Major = major;
    }

    public String getMajor() {
        return Major;
    }

    public void setResearch(int research) {
        this.Research = research;
    }

    public int getResearch() {
        return Research;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Degree getDegree() {
        return degree;
    }

    public String toString() {
        return "\nMajor: " + Major +
        "\nResearch: " + Research +
        "\nDegree: " + degree;
    }

//    @Override
//    public boolean equals(Object o) {
//        return super.equals(o);
//    }

//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }



    // Attributes
//Degree (MS or PhD )
//Major (Engineering, Chemistry, English, etc ... )
//Research (number of researches)
//Default argument and argument constructors.
//Public methods
//get and set
}
