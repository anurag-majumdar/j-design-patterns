package behavioural_patterns.strategy.Ex2;

import behavioural_patterns.strategy.Ex2.models.Notification;
import behavioural_patterns.strategy.Ex2.services.ApiClientService;

public class NotificationService {

    private ApiClientService apiClientService;

    public NotificationService(
            ApiClientService apiClientService
    ) {
        this.apiClientService = apiClientService;
    }

    public void changeApiClientService(ApiClientService apiClientService) {
        this.apiClientService = apiClientService;
    }

    public String dispatch(Notification notification) {
        return this.apiClientService.dispatch(notification);
    }

    public String getStatus(String sourceId) {
        return this.apiClientService.getStatus(sourceId);
    }
}
