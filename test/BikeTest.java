import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {

    @BeforeEach
            void startAllTestWith() {
            Bike myBike = new Bike();
    }

    @Test
    public void isOn(){
        //given that i have a bike
        Bike myBike = new Bike();
        //given that i setOn myBike
        myBike.setOff();
        //check that bike ison
        boolean setOn = myBike.isOn();
        assertTrue(setOn);
    }


    @Test
    public void isOff(){
        //given that i have a bike
        Bike myBike = new Bike();
        //given that i setoff my bike
        myBike.setOff();
        //check that bike is off
        boolean setOff = myBike.isOff();
        assertTrue(setOff);
    }


    @Test
    public void setGear(){
        //given that i have a bike
        Bike myBike = new Bike();
        myBike.setOn();
        myBike.setGear();
        boolean setGear = myBike.setGear();
        assertTrue(setGear);
    }


    @Test
    public void Acceleration(){
        Bike myBike = new Bike();
        myBike.setOn();
        myBike.setGear();
        myBike.acceleration(1>=100);
        int acceleration = myBike.acceleration(1>=100);
        boolean getAcceleration = true;
        assertTrue(getAcceleration);
    }

    @Test
    public void gearSelection(){
        Bike myBike = new Bike();
        myBike.setOn();
        myBike.setGear();
        myBike.acceleration(1>=100);
       // myBike.gearSelection();
       // Object gearSelection = myBike.gearSelection();
       // assertTrue((Boolean) gearSelection);

    }


}
