package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceListCheckTest {

    @BeforeEach
    void startAllTestWith(){
        PriceList priceList = new PriceList();
    }
    @Test
    void DisplayMenu(){
        PriceList priceList = new PriceList();
        PriceList.selectBook();
        PriceList.selectBag();
        PriceList.selectShoe();
        assertEquals(1, 2, 3);
    }
    @Test
    void PriceList(){
        PriceList priceList = new PriceList();
        PriceList.bookQuantity();
        PriceList.bagQuantity();
        PriceList.shoeQuantity();

        int bookPrice = PriceList.getBookPrice();
        int bagPrice = PriceList.getBagPrice();
        int shoePrice = PriceList.getShoePrice();
        assertEquals(PriceList.getPrice,(0), 3);
    }
    private void assertEquals(int getPrice, int price, int i) {
    }
    @Test
    void UserInput(){
        PriceList priceList = new PriceList();
        PriceList.userInput(1, 2, 3);
        assertEquals(PriceList.userInput(1, 2, 3));
    }
    private void  assertEquals(int userInput) {

    }

    @Test
    void QuantityPrice(){
        PriceList priceList = new PriceList();
        PriceList.QuantityPrice();
        assertEquals(PriceList.quantityPrice());
    }
}
