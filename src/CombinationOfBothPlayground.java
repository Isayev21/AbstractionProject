interface CarManufacturerDuties {

    void testSafety();

}

class Car {

    CarManufacturerDuties duties;

    public Car(CarManufacturerDuties duties) {
        this.duties = duties;
    }

    void testEverything() {
        //other tests.....
        duties.testSafety();
    }

}

class Mercedes extends Car {

    public Mercedes(CarManufacturerDuties duties) {
        super(duties);
    }

}

class MercedesDuties implements CarManufacturerDuties {

    @Override
    public void testSafety() {
        System.out.println("Mercedes tests safety...");
    }

}

public class CombinationOfBothPlayground {

    public static void main(String[] args) {

        CarManufacturerDuties dutiesOfMercedes = new MercedesDuties();
        Mercedes mercedesCar = new Mercedes(dutiesOfMercedes);

        mercedesCar.testEverything();

    }

}
