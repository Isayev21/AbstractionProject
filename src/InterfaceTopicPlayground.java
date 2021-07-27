interface Physics {

    default void calculateG() {
        System.out.println("Calculating G...");
    }

    void calculateGravityForce();

}

class PhysicsTeacher implements Physics {

    @Override
    public void calculateGravityForce() {
        calculateG();
        System.out.println("Result is 5N");
    }

}

public class InterfaceTopicPlayground {

    public static void main(String[] args) {

        Physics teacher = new PhysicsTeacher();

        teacher.calculateGravityForce();

    }

}
