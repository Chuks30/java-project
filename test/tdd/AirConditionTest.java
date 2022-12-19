package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {

    @Test
    public void isOn(){
        //given that i have an aircondition
        AirCondition myAirCondition = new AirCondition();
        //given that i seton the aircondition
        myAirCondition.setOn();
        //check that aircondition ison
        boolean setOn = myAirCondition.isOn();
        assertTrue(setOn);


    }

    @Test
    public void isOff(){
        //given that i have an aircondition
        AirCondition myAircondition = new AirCondition();
        //given that i set off my aircondition
        myAircondition.isOff();
        //check that aircondition iso-ff
        boolean setOff = myAircondition.isOff();
        assertFalse(setOff);
    }

    @Test
    public void LG(){
        //given that i have an aircondition
        AirCondition myAirCondition = new AirCondition();
        //given that the name of my aircondition is lg
       myAirCondition.setName();
       //given that aircondition name is lg
        String setName =myAirCondition.LG();
        assertEquals(setName);

    }

    private void assertEquals(String setName) {
    }


    @Test
    public void decreesTemperature(){
      //given that i have an aircondition
        AirCondition myAircondition = new AirCondition();
        //given that myaircondition isOn
        boolean setOn = myAircondition.isOn();
        //given that the initial temperature is 17
        myAircondition.initialTemperature();
        //given that temperature was decrees
        myAircondition.decreesTemperature();


    }
}
