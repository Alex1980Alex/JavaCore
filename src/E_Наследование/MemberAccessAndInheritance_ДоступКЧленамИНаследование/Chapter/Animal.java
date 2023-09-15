package E_Наследование.MemberAccessAndInheritance_ДоступКЧленамИНаследование.Chapter;

public class Animal {
    public String publicField = "I'm public!";
    protected String protectedField = "I'm protected!";
    String defaultField = "I'm default (package-private)!";
    private String privateField = "I'm private!";

    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default (package-private) method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }
}
