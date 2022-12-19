package chapter2;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account();
        account.setName("account name");

        System.out.printf("My account name is %s%n", account.getName());
        System.out.println("The balance is : "+ account.getBalance());
        account.deposit(2000);
        System.out.println("My new balance is " + account.getBalance());
        account.withdrawal(1000);
        System.out.println("My new balance is -" + account.getBalance());


    }
}
