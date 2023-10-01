package I_ПеречисленияАвтоупаковкаИАннотации.E_ОболочкиТипов.Exapmle;

public class Wrap {
    public static void main(String[] args) {
        // упаковка
        Integer iOb = Integer.valueOf (100) ;
        // распаковка
        int i = iOb.intValue();
        System.out.println(i +" "+ iOb );// выводит 100 100

        Integer iOb_2 = 100 ; // автоупаковка значения int
        int i_2 = iOb ; // автораспаковка

        System.out.println(i_2 +" "+ iOb_2 );// выводит 100 100
    }
}
