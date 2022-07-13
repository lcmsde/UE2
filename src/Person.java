public abstract class Person {



    private String name;
    private String vorname;

    public Person(String name, String vorname){
        this.name = name;
        this.vorname = vorname;
    }


    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    @Override
    public String toString() {
        return name+", "+vorname;
    }
}
