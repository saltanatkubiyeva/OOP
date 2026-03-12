package p5;

public class PhDStudent extends Student{
    private String researchField;

    public PhDStudent(String name, int age, String major, String researchField) {
        super(name,age,major);
        this.researchField = researchField;
    }

    public String getResearchField() { return researchField; }

    public void setResearchField(String researchField) {this.researchField = researchField;}


    @Override
    public void assignPet(Animal pet) {
        if(pet instanceof Dog) {
            System.err.println(getName() + " is a phDStudent and cannot have a dog:( ");
        } else{
            super.assignPet(pet);
        }
    }

    @Override
    public String getOccupation() {
        return "PhD" + super.getOccupation() + " | Research: "
                + researchField;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
