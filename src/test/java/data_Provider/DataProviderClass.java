package data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
    @DataProvider(name = "SingleValue")
    public Object[][] storeSingleValue() {
        return new Object[][]{
                {"Rifat"},
                {"Mohammad"},
                {"Ashraf"}

        };
    }

    @DataProvider(name = "MultipleValues")
    public Object[][] storeMultipleValues() {
        return new Object[][]{
                {"Rifart", "Florida", 33018},
                {"Farid", "New York", 12458},
                {"Ashraf", "Bangladesh", 1207}
        };
    }

    @DataProvider(name = "RealAprRates")
    public Object[][] storeRealAprRates() {
        return new Object[][] {
                {"200000", "15000", "3", "3.130%"}
        };
    }

    //    @Test(dataProvider = "SingleValue")
    public void run(String name) {
        System.out.println("[Single value] name is: " + name);
    }

    @Test(dataProvider = "MultipleValues")
    public void run(String name, String state, int zipCode) {
        System.out.println("[Multiple value] name is: " + name);
        System.out.println("[Multiple value] state is: " + state);
        System.out.println("[Multiple value] zip Code is: " + zipCode);
    }

}
