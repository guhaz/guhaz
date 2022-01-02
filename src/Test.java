import java.util.Random;

public class Test {


    public static void main(String[] args) {
        String aa="LC|";

        String aa1="010,011,012.014,010，014，0155";
        String aa2="010,011,012.014,010，014，0155";
        String aa3="010,011,012.014,010，014，0155";

        if(aa1.indexOf("010") >-1  && aa1.indexOf("011") >-1 ){
            System.out.print("111111111111");
        }else{
            System.out.print("444444="+aa1.indexOf("010"));
    }

        System.out.println(new Random().nextInt(10));

    }
    
}
