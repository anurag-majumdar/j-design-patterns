package behavioural_patterns.strategy.Ex2.services;

import behavioural_patterns.strategy.Ex2.models.Notification;

/**
 * Actual implementation
 */
public class ApiClient implements ApiClientService {

    @Override
    public String dispatch(Notification notification) {
        return "SUCCESS";
    }

    @Override
    public String getStatus(String sourceId) {
        return "SUCCESS";
    }
}
