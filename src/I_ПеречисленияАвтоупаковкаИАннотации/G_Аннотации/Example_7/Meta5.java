package I_ПеречисленияАвтоупаковкаИАннотации.G_Аннотации.Example_7;

public class Meta5 {
    public static void main(String[] args) {
        final MethodCaller methodCaller = new MethodCaller();
        methodCaller.callCallable(new Single());

    }
    private static class Single{

        public void toCall(){
            System.out.println("call");
        }
        @Callable
        public void notCall(){
            System.out.println("not call");
        }
    }
}
