package zjazd3.OverloadingAndRidding;

public class Boy extends Human {

        void eat() {
            System.out.println("Chłopiec je");
        }


    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        Boy boy = new Boy();
        boy.eat();
    }
}

class cokowiek{

}
