package school.model;

public class Part13_Packages {
    private String packageName;

    public Part13_Packages(String packageName) {
        this.packageName = packageName;
    }

    public void printPackageInfo() {
        System.out.println("Executing class organized inside package: " + packageName);
    }

    public static void main(String[] args) {
        Part13_Packages pkgDemo = new Part13_Packages("school.model");
        pkgDemo.printPackageInfo();
    }
}