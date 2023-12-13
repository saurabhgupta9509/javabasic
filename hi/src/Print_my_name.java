import java.util.*;
public class Print_my_name {
    public static void name(String nam1){
        System.out.println(nam1);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nam1 = sc.next();
        name(nam1);
    }
    
}

