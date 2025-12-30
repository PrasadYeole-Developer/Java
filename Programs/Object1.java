class Mahesh{
    int x; 
    int y;  
    void fun1(){
System.out.println("fun1");
    }
    void fun2(){
        System.out.println("fun2");

    }
}

class Object1 {
    public static void main (String []args){
        Mahesh m1 = new Mahesh();
           m1.x = 5;
           System.out.println(m1.x);
           System.out.println(m1.y);


           Mahesh m2 = new Mahesh();
          m2.x = 51;
           System.out.println("Hello");
           System.out.println(m2.y);
           System.out.println(m2.x);

    }
} 