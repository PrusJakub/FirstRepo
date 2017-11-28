public class StringArrayTest {
    public static List<String> generateStringArray(Integer i){
        List<String> lista = new List<String>();
        String a;
        
        for(Integer n = 0; n<i; n++){
            a = 'Test '+ n;
       		lista.add(a);
        }
        
        return lista;
    }
}