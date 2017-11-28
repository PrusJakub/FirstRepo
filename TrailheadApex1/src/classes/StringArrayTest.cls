public class StringArrayTest {
    public static List<String> generateStringArray(Integer i) {
        List<String> lista = new List<String>();

        for (Integer n = 0; n < i; n++) {
            lista.add('Test ' + n);
        }

        return lista;
    }
}