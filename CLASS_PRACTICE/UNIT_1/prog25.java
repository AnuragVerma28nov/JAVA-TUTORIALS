// oops-encapsulation
// encapsulation is a mechanism of wrapping the data (variables) and code acting on the data

class employee {
    private int empid;

    public void setempid(int eid) {
        empid = eid;
    }

    public int getempid() {
        return empid;
    }
}

public class prog25 {

    public static void main(String[] args) {
        employee obj = new employee();
        obj.setempid(100);
        System.err.println(obj.getempid());
    }
}
// Output:
// 100
