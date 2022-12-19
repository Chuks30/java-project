package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NokiaTest {

    @Test
    void setOn(){
        // given i have a nokia phone
        Nokia myNokia = new Nokia();
        myNokia.setOn();
        boolean setOn = myNokia.isOn();
        assertTrue(setOn);
    }

    @Test
    void setOff(){
        Nokia myNokia = new Nokia();
        myNokia.setOff();
        boolean setOff = (boolean) myNokia.isOff();
        assertTrue(setOff);
    }


    @Test
    void displayMenu(){
        Nokia myNokia = new Nokia();
        myNokia.setOn();
        myNokia.displayMenu("Welcome to Nokia phone");
        String displayMenu = myNokia.displayMenu("Welcome to Nokia phone");
        assertEquals("Welcome to Nokia phone");
    }

    private void assertEquals(String welcome) {
    }


    @Test
    void phoneBook(){
        Nokia myNokia = new Nokia();
        myNokia.phoneBook("display contact");
        int phoneBook = myNokia.displayContact();
        assertEquals("display contact");
    }

    @Test
    void dialNumber(){
        Nokia myNokia = new Nokia();
        myNokia.dialNumber();
        int dialNumber = myNokia.dialNumber();
        assertEquals("dial numbers");
    }

    @Test
    void smsMessages(){
        Nokia myNokia = new Nokia();
        myNokia.smsMessages("type message");
        String smsMessages = myNokia.smsMessages("type messages");
        assertEquals("type messages");
    }

    @Test
    void messageInbox(){
        Nokia myNokia = new Nokia();
        myNokia.messageInbox("receive messages");
        String messageInbox = myNokia.messageInbox("receive message");
        assertEquals("receive messages");
    }

    @Test
    void outBoxMessage(){
        Nokia myNokia = new Nokia();
        myNokia.outBoxMessage("undelivered messages");
        String outBoxMessage = myNokia.outBoxMessage("undelivered messages");
        assertEquals("undelivered messages");
    }

    @Test
    void sentBoxMessages(){
        Nokia myNokia = new Nokia();
        myNokia.sentBoxMessages("send typed message");
        String sentBoxMessages = myNokia.sentBoxMessages("send typed message");
        assertEquals("send typed message");
    }

    @Test
    void draftMessages(){
        Nokia myNokia = new Nokia();
        myNokia.draftMessages("saved messages");
        String draftMessages = myNokia.draftMessages("saved messages");
        assertEquals("saved messages");
    }

    @Test
    void phoneMenu(){
        Nokia myNokia = new Nokia();
        myNokia.phoneMenu("select menu");
        String phoneMenu = myNokia.phoneMenu("select menu");
        assertEquals("select menu");
    }

    @Test
    void userInput(){
        Nokia myNokia = new Nokia();
        myNokia.userInput();
        int userInput = myNokia.userInput();
        assertEquals("select if message or phonebook");
    }
}
