package behavioural_patterns.Ex2;

import behavioural_patterns.strategy.Ex2.NotificationService;
import behavioural_patterns.strategy.Ex2.services.ApiClient;
import behavioural_patterns.strategy.Ex2.services.ApiClientMock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestNotificationService {
    @Test
    public void TestDispatch() {
        // Handle tests
        ApiClientMock apiClientMock = new ApiClientMock();
        NotificationService notificationService = new NotificationService(apiClientMock);

//        notificationService.changeApiClientService(new ApiClient());

        assertNotNull(notificationService.getStatus("2"));
    }
}
