package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositMoneyTest(){
        //given that emma has an account
        Account emmaAccount = new Account();
        //when emma deposits 1000
        emmaAccount.deposit(1000);
        //check that the balance is 1000
        int balance = emmaAccount.getBalance();
        assertEquals(1000, balance);

    }


    @Test
    public void depositTwiceTest(){
        //given emma has an account;
        Account emmaAccount = new Account();
        // given there is 3000 in the account;
        int balance = emmaAccount.getBalance();
        assertEquals(3000, balance);

        //when i try to deposit 2000;
        emmaAccount.deposit(2000);

        //check that balance is 5000;
        balance = emmaAccount.getBalance();
        assertEquals(5000, balance);

   }

    @Test
    public void depositNegativeAccountTest(){
        //giving i have an account with zerro balance;
        Account emmaAccount = new Account();
        //when i try deposit negative amount (-2300);
        emmaAccount.deposit(-2300);
        //check that balance is zero
        int balance = emmaAccount.getBalance();
        assertEquals(0, balance);
    }

    {
        //given that emma has an account;
        Account emmaAccount = new Account();
        // given that there is 5000 in my account;
        emmaAccount.deposit(5000);
        int balance = 5000;
        assertEquals(5000, balance);

        //when i try to withdrawer 2000;
        emmaAccount.withdrawer(2000);

        //check that balance is 3000
        balance = emmaAccount.getBalance();
        assertEquals(3000, balance);
    }



}
