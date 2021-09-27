public class exe_interface {
    public static void main(String[] args) {
        inter i = new inter() {
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        };
        i.method();
    }
}

interface inter {
    void method();
}