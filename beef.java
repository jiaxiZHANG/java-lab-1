public class beef extends Food{
    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    private String filling;
    public beef(String filling ) {
        super("beef");
        this.filling = filling;

    }
    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof beef)) return false;
            return filling.equals(((beef)arg0).filling);
        } else
            return false;
    }

    @Override
    public void consume() {
        System.out.println(  this.toString()+  " съеден");

    }
    @Override
    public String toString(){
        return "preparedness " + filling;
    }
}