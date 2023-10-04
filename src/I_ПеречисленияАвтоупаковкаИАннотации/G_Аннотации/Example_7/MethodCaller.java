package I_ПеречисленияАвтоупаковкаИАннотации.G_Аннотации.Example_7;


import java.lang.reflect.Method;

public class MethodCaller {
    public void callCallable(Object object){
        for (Method method: object.getClass().getMethods()
             ) {
            if (method.getAnnotation(Callable.class) != null){
                try {
                    method.invoke(object);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
