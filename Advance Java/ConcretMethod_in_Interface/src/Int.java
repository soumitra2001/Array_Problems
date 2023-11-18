public interface Int {

    void add();

    default void show(){
        System.out.println("showed");
    }

    static boolean isTrue(String s){
        return s.length() > 10;
    }
}
