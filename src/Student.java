public class Student extends Person{

    public int getMatrnr() {
        return matrnr;
    }

    private int matrnr;

    public Student(String name, String vorname, int matrnr) {
        super(name, vorname);
        this.matrnr = matrnr;
    }

    @Override
    public String toString() {
        return super.toString()+", "+matrnr;
    }

    public Boolean equals(Student std) {
        return (this.matrnr==std.matrnr&this.getName()==std.getName()&this.getVorname()==std.getVorname());
    }
}


