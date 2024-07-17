 public class StaticExample {
    // Constructor
    public StaticExample() {
        System.out.println("Constructor called");
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("Non-static method called");
    }

    // Static method 1
    public static void staticMethod1() {
        System.out.println("Static method 1 called");
    }

    // Static method 2
    public static void staticMethod2() {
        System.out.println("Static method 2 called");
    }

    public static void main(String[] args) {
        StaticExample example = new StaticExample(); // Constructor called
        example.nonStaticMethod(); // Non-static method called
        staticMethod1(); // Static method 1 called
        staticMethod2(); // Static method 2 called
    }
} 
    

