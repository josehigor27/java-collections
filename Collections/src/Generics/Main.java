package Generics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();

        Box<String> stringBox = new Box();

        Pair<String,Integer> p1 = new OrderPair<>("Teste 1",2);
        Pair<Integer,String> p2 = new OrderPair<>(1,"Teste 2");
        Pair<Boolean,Integer> p3 = new OrderPair<>(Boolean.TRUE,2);


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }
}
