package behavioural_patterns.strategy.Ex2.services;

import behavioural_patterns.strategy.Ex2.models.Notification;

public interface ApiClientService {
    String dispatch(Notification notification);

    String getStatus(String sourceId);
}
