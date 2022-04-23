import java.util.ArrayList;


public class Avegare {
     public static <T> double tinhTB (ArrayList<T> TB) {
        double total = 0.0;
        for (int i = 0; i < TB.size(); i++) {
            total += (double)TB.get(i);
        }
        return total/TB.size();  
    }
}
