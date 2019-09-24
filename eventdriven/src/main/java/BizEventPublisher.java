public interface BizEventPublisher {

    void publishEvent(Object eventData);

    void publishEventAsync(Object eventData);
}
