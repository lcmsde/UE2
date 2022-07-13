public class Paar<E,Z> {

    private E erstes;
    private Z zweites;


    public Paar(E e, Z z){

        erstes = e;
        zweites = z;
    }

    public E getErstes() {
        return erstes;
    }
    public Z getZweites(){
        return zweites;
    }

    public void setErstes(E e){
        erstes = e;
    }

    public void setZweites(Z z){
        zweites = z;
    }

    public void setBeide(E e, Z z){
        erstes = e;
        zweites = z;
    }

    public Boolean equals(Paar<E,Z> p){
        boolean b = p.getErstes() == this.getErstes() & p.getZweites() == this.getZweites();
        return b;
    }

    public String toString(){
        return "("+ erstes.toString()+", "+zweites.toString()+")";
    }





}
