package pasur;

public interface Observer {
    /**
     *
     * @param publisher publisher of the event who wants to publish an event
     * @param value Value the publisher wants to publish in the output text file
     */
    public void onPropertyEvent(Publisher publisher, String value);
}
