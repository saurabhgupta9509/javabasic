import java.util.*;
class oddeven{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("the numbers are equal ");
        }
        else if(a>b){
            System.out.println("the is greater then b ");
        }
        else{
            System.out.println("the b is greater then a");
        }

    }

}