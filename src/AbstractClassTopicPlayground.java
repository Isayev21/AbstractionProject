abstract class Math {

    public void calculateLimit() {
        System.out.println("Calculating limit of integration...");
        calculateIntegral();
    }

    abstract public void calculateIntegral();

}

class MathTeacher extends Math {

    @Override
    public void calculateIntegral() {
        System.out.println("Result of integration is 5x + C");
    }

}

public class AbstractClassTopicPlayground {

    public static void main(String[] args) {

        Math teacher = new MathTeacher();

        teacher.calculateLimit();

    }

}
