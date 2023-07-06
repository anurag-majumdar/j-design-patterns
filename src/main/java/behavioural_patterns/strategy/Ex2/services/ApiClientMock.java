package behavioural_patterns.strategy.Ex2.services;

import behavioural_patterns.strategy.Ex2.models.Notification;

public class ApiClientMock implements ApiClientService {

    @Override
    public String dispatch(Notification notification) {
        return "Mock Dispatch";
    }

    @Override
    public String getStatus(String sourceId) {
        return "Mock Status";
    }
}
