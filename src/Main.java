/*This is a simple program about constructors*/


import java.util.Scanner;
class MyClass{
    int  x ;

    MyClass(int i){
        x = i;
    }
}

public class Main {
    public static void main(String[] args) {
    MyClass a = new MyClass(10);
    System.out.println(a.x);
    }
}