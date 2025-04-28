// oops-encapsulation

public class prog25 {

    public static void main(String[] args) {
        empolyee obj = new empolyee();
        obj.setempid(100);
        System.err.println(obj.getempid());
    }
}

class empolyee {

    private int empid;

    public void setempid(int eid) {
        empid = eid;

    }

    public int getempid() {
        return empid;
    }
}
