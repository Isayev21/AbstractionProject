package alternativeWay;

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

public class AnonimousWayPlayground {

    public static void main(String[] args) {

        Mercedes mercedesCar = new Mercedes(new CarManufacturerDuties() {

            @Override
            public void testSafety() {
                System.out.println("Mercedes tests safety...");
            }

        });

        mercedesCar.testEverything();

    }

}
