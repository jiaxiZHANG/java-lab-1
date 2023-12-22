public class beef extends Food{
    public String getFilling() {
        return preparedness
                ;
    }

    public void setFilling(String filling) {
        this.preparedness
                = filling;
    }

    private String preparedness
            ;
    public beef(String filling ) {
        super("beef");
        this.preparedness
                = filling;

    }
    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof beef)) return false;
            return preparedness
                    .equals(((beef)arg0).preparedness
                    );
        } else
            return false;
    }

    @Override
    public void consume() {
        System.out.println(  this.toString()+  " съеден");

    }
    @Override
    public String toString(){
        return "preparedness " + preparedness
                ;
    }
}
