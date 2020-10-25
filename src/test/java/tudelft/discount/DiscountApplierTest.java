package tudelft.discount;

import jdk.jfr.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {
    @ParameterizedTest
    @CsvSource({"paper clip,100,BUSINESS,110", "pen,1,BUSINESS, 1.1", "pencil,-1,BUSINESS,-1.1"})
    public void BusinessItemTest(String name, double price, String type, double result){
        Product businessItem = new Product(name, price, type);
        ProductDao productDao = Mockito.mock(ProductDao.class);

        List<Product> returnedResult = Arrays.asList(businessItem);
        Mockito.when(productDao.all()).thenReturn(returnedResult);

        DiscountApplier discountApplier = new DiscountApplier(productDao);
        discountApplier.setNewPrices();

        Assertions.assertEquals(result, productDao.all().stream().findFirst().get().getPrice());
    }
    @ParameterizedTest
    @CsvSource({"paper clip,100,HOME,90", "pen,1,HOME, 0.9", "pencil,-1,HOME,-0.9"})
    public void HomeItemTest(String name, double price, String type, double result){
        Product homeItem = new Product(name, price, type);

        ProductDao productDao = Mockito.mock(ProductDao.class);

        List<Product> returnedResult = Arrays.asList(homeItem);
        Mockito.when(productDao.all()).thenReturn(returnedResult);

        DiscountApplier discountApplier = new DiscountApplier(productDao);
        discountApplier.setNewPrices();

        Assertions.assertEquals(result, productDao.all().stream().findFirst().get().getPrice());
    }
}
