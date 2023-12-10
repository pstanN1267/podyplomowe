package zjazd3.Construktor;

public class ConstructorHierarchy {

    public static void main(String[] args) {
        new C();
        System.out.println("ad.3");
        new C(false);
        System.out.println("ad.4");
        new A(false);
    }

}

    class A {

    boolean question;

        public A(boolean question) {

            this.question = question;

            if (!question){
                System.out.println("Wywołany konstruktor A(" + question + ")");

            }
        }

        public A(){
            System.out.println("Wywołany konstruktor A");

        }
    }

    class B extends A{
        public B(){
            System.out.println("Wywołany konstruktor B");
        }
        public B(boolean question) {
            super(true);
            this.question = question;

            if (!question){
                System.out.println("Wywołany konstruktor B(" + question + ")");

            }
        }
    }

    class C extends B{
        public C(){
            super();
            System.out.println("Wywołany konstruktor C");
        }
        public C(boolean question) {
        super(true);
            this.question = question;

            if (!question){
                System.out.println("Wywołany konstruktor C(" + question + ")");

            }
        }
    }
