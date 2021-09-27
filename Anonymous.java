class Polygon {
    public void display() {
        System.out.println("在 Polygon类内部");
    }
}

class Anonymous {
    public void createClass() {
        Polygon p1 = new Polygon() { //继承类Polygon类，实例化为p1
            public void display() { //重写display方法
                System.out.println("在匿名类内部");
            }
        };
        p1.display();
    }
}

class Main {
    public static void main(String[] args) {
        Anonymous an = new Anonymous();
        an.createClass();

    }
}