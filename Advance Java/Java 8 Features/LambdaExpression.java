import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

interface Country{
    void name(String s);

}


public class LambdaExpression {

    public static void main(String[] args) {
        Country myCountry;

        /*
        myCountry = new Country(){
            public void name(){
                System.out.println("India");
            }
        };

        myCountry=() ->{
            System.out.println("India");
        };

        myCountry=()-> System.out.println("India");

        myCountry=(String str)-> System.out.println(str);

         */

        myCountry= str -> {
            System.out.println(str);
        };

//        myCountry.name("India");


        List<Integer> list= Arrays.asList(3,7,9,1,5);

        list.forEach(num-> {
            num+=10;
            System.out.println(num);
        });
    }

}



