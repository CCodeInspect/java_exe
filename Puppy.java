public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("123" + name);
        //这个构造器仅有一个参数：name
    }

    public void setAge(int age) { //定义setAge()方法
        puppyAge = age;

    }

    public int getAge() { //定义getAge()方法
        System.out.println("小狗的年龄为" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy"); //创建对象 myPuppy
        myPuppy.setAge(2); //set进去
        myPuppy.getAge(); //get()
        System.out.println(myPuppy.puppyAge);


    }
}
