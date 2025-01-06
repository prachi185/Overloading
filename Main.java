class Sample {
    public void print(int a){      //public void print(int a) is not valid as written. Java does not recognize in as modifier or keywords in modifier method.
        System.out.println("int-"+a);  //
    }
    public void print(double a) {
        System.out.println("double-"+a);
    }
    public void print(String a) {
        System.out.println("string-"+a);
    }
}

public class Main {
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.print(10);
        obj.print(10.2);
        obj.print("abc");
    }
}
