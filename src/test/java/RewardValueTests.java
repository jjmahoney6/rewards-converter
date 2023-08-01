
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        // Test data
        double cashValue = 100.0; // Set the cash amount you want to convert
        double expectedMiles = cashValue / 0.0035; // Assuming there's a method to get the conversion rate

        // Create an instance of the RewardValue class
        RewardValue rewardValue = new RewardValue(cashValue);

        // Get the miles value from the RewardValue instance
        double actualMiles = rewardValue.getMilesValue();
    }

    @Test
    void convert_from_miles_to_cash() {
        // Test data
        int milesValue = 5000; // Set the miles amount you want to convert
        double expectedCash = milesValue * 0.0035; // Assuming there's a method to get the conversion rate

        // Create an instance of the RewardValue class
        RewardValue rewardValue = new RewardValue(milesValue);

        // Get the cash value from the RewardValue instance
        double actualCash = rewardValue.getCashValue();

        // Assert that the conversion is accurate
        assertEquals(expectedCash, actualCash, 0.01); // Using a delta of 0.01 for double comparison due to potential floating-point precision issues;
    }
}
