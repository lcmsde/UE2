public class SpeicherPaar {

    public static void main(String[] args){
        Speicher<Paar<Student,String>> servicepoint;
        Speicher<Paar<Boxer,Boxer>> boxEvent;

        servicepoint = new KellerspeicherMitArray<>(4);
        boxEvent = new KellerspeicherMitArray<>(3);

        Student s1 = new Student("Mustermann","Max",1234);
        Paar<Student,String> p1 = new Paar<>(s1,"Frage1");
        servicepoint.push(p1);

        Student s2 = new Student("Mustermann","Max",12345);
        Paar<Student,String> p2 = new Paar<>(s2,"Frage2");
        servicepoint.push(p2);

        Student s3 = new Student("Mustermann","Max",12346);
        Paar<Student,String> p3 = new Paar<>(s3,"Frage3");
        servicepoint.push(p3);

        Student s4 = new Student("Mustermann","Max",12347);
        Paar<Student,String> p4 = new Paar<>(s4,"Frage4");
        servicepoint.push(p4);


        while(servicepoint.size()!=0){
            System.out.println(servicepoint.pop());
        }

    }

}
