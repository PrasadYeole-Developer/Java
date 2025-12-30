class Example{
    protected int x,y;
    void f1(int x, int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);

    }
}

class Example1 extends Example{
    int x,y;
    void f3(int x,int y){
        super.x=x; // if i had used this instead of super then the value will be assigned to the x and y of this class as i used super keyword the value that passed through the fuction f3(); will be assign to the x and y of the parent class (Example class). 
        super.y=y;
    }
    void f4(){
        System.out.println(super.x);
        System.out.println(this.y);
    }
}

class ThisK {
    public static void main(String[] args) {

Example1 e1 = new Example1();
e1.f3(7, 9);
e1.f4();


        // Example e1 = new Example();
        // e1.f1(55, 66);
        // e1.display();
        // Example e2 = new Example();

    }
}
