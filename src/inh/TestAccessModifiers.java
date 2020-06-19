package inh;

public class TestAccessModifiers {

    public void Test(){
        Parent p = new Parent();
        p.show();

        Parent c = new Child();
        c.show();

    }

    class Parent{
        void show(){
            System.out.println("parent -> show");
        }

        public void display(){
            System.out.println("parent -> display");
        }
    }

    class Child extends Parent{
        @Override
        protected void show(){
            System.out.println("child -> show");
        }


        public void display(){
            System.out.println("child -> display");
        }
    }
}
