package api.speedtest.resources;

import api.speedtest.models.TestResult;
import api.speedtest.services.PubSubSender;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/speedtest")
public class SpeedtestResource {

    private PubSubSender pubSubSender;

    @Autowired
    public SpeedtestResource(PubSubSender pubSubSender) {
        this.pubSubSender = pubSubSender;
    }

    @GetMapping("/hello/{name}")
    public String GetHello(@PathVariable("name") String name) {
        return String.format("Hello %s", name);
    }

    @PostMapping()
    public String PostMessage(@RequestBody TestResult testResult) {
        Gson gson = new Gson();
        String json = gson.toJson(testResult);
        pubSubSender.Publish(json);

        return "Sent";
    }
}