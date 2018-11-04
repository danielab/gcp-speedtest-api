package api.speedtest.services;

import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

@Component
public class PubSubSender {

    private PubSubTemplate pubSub;

    public PubSubSender(PubSubTemplate pubSubTemplate) {
        this.pubSub = pubSubTemplate;
    }

    public void Publish(String message) {
        this.pubSub.publish("speedtest", message);
    }
}