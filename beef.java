public class beef extends Food{
    public String getpreparedness() {
        return preparedness
                ;
    }

    public void setpreparedness(String preparedness) {
        this.preparedness
                = preparedness;
    }

    private String preparedness
            ;
    public beef(String preparedness ) {
        super("beef");
        this.preparedness
                = preparedness;

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
