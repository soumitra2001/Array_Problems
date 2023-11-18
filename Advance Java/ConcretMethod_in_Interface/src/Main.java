public class Main implements Int{
    public static void main(String[] args) {
        Main obj=new Main();
        obj.add();
        obj.show();
        System.out.println(Int.isTrue("hello"));
    }

    @Override
    public void add() {
        System.out.println("added");
    }

}