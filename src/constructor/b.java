package constructor;

public class b extends a{
    public b(){
        super(5);
        System.out.println("New system b");
    }

    public static void main(String[] args) {
        b bb = new b();
        init();

    }
}
