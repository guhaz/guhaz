import java.util.Random;

public class Test {


    public static void main(String[] args) {
        String aa="LC|";

        String aa1="010,011,012.014，019";
        if(aa1.indexOf("010") >-1  && aa1.indexOf("011") >-1 ){
            System.out.print("111111111111");
        }else{
            System.out.print("444444="+aa1.indexOf("010"));
        }

        System.out.println(new Random().nextInt(10));

    }
    
}
