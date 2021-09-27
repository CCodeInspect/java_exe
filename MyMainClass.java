class OuterClass { //非静态的内部类
    int x = 10;

    class InnerClass {
        int y = 5;
        int q = 2;

        public int myInnerMethod() {
            return x;
        }
    }

//    static class InnerClass_0 {
//        int z = 5; //静态内部类，可以直接访问
//    }

}

public class MyMainClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass(); //对象名字叫myOuter
//        OuterClass.InnerClass myInner = myOuter.new InnerClass(); //对象名叫myInner
        OuterClass.InnerClass myInner_0 = myOuter.new InnerClass(); //内部类的一个高级用法就是可以访问外部类的属性和方法
//        OuterClass.InnerClass myInner = new OuterClass.InnerClass_0(); //静态内部类
        System.out.println(myInner_0.y + myOuter.x + myInner_0.q);
    }


}
