// It imports MyPackageClass from the prog33.mypackage package and calls its method.

package  unit_1.prog33;

import unit_1.prog33.mypackage.MyPackageClass;

public class MainClass {
    public static void main(String[] args) {
        MyPackageClass obj = new MyPackageClass();
        obj.showMessage();
    }
}
// Output:
// Hello from MyPackageClass!
