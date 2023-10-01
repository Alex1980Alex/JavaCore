package I_ПеречисленияАвтоупаковкаИАннотации.D_ПеречисленияУнаследованыОтEnum.Example;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap , ap2, apЗ;
        // Получить все порядковые номера с применением ordinal ( ) .
        System.out.println (
                "Bce константы перечисления Apple вместе с их порядковыми номерами : ") ;
        for (Apple a: Apple.values ())
        System.out.println( a + " " + a.ordinal () );
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        apЗ = Apple.RedDel;
        System.out.println ();
        // Демонстрация использования compareTo () и equals () .
        if ( ap.compareTo (ap2) < 0)
        System.out.println ( ap + " находится перед " + ap2 ) ;

        if ( ap.compareTo (ap2) > 0)
            System.out.println ( ap2 + " находится перед " + ap) ;

        if (ap.compareTo (apЗ) == 0)
            System.out.println ( ap + " равно " + apЗ ) ;
        System.out.println ("-----------") ;

        if (ap.equals (ap2) )
        System.out.println ( "Oшибкa");

        if (ap.equals (apЗ))
            System.out.println (ap + " равно " + apЗ ) ;
    }
}
