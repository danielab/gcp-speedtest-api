package api.speedtest.models;

public class TestResult {
    private String user;
    private Integer device;
    private Long timestamp;
    Data data;

    public String getUser() {
        return user;
    }

    public Integer getDevice() {
        return device;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Data getData() {
        return data;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setDevice(Integer device) {
        this.device = device;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setData(Data dataObject) {
        this.data = dataObject;
    }
}

class Data {
    Speeds Speeds;
    Client Client;
    Server Server;

    // Getter Methods

    public Speeds getSpeeds() {
        return Speeds;
    }

    public Client getClient() {
        return Client;
    }

    public Server getServer() {
        return Server;
    }

    // Setter Methods

    public void setSpeeds(Speeds speedsObject) {
        this.Speeds = speedsObject;
    }

    public void setClient(Client clientObject) {
        this.Client = clientObject;
    }

    public void setServer(Server serverObject) {
        this.Server = serverObject;
    }
}
class Server {
    private String host;
    private Double latitude;
    private Double longitude;
    private String country;
    private Double distance;
    private Integer ping;
    private Integer id;


    // Getter Methods

    public String getHost() {
        return host;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getCountry() {
        return country;
    }

    public Double getDistance() {
        return distance;
    }

    public Integer getPing() {
        return ping;
    }

    public Integer getId() {
        return id;
    }

    // Setter Methods

    public void setHost(String host) {
        this.host = host;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public void setPing(Integer ping) {
        this.ping = ping;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
class Client {
    private String ip;
    private Double longitude;
    private Double latitude;
    private String isp;
    private String country;


    // Getter Methods

    public String getIp() {
        return ip;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public String getIsp() {
        return isp;
    }

    public String getCountry() {
        return country;
    }

    // Setter Methods

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
class Speeds {
    private Double download;
    private Double upload;


    // Getter Methods

    public Double getDownload() {
        return download;
    }

    public Double getUpload() {
        return upload;
    }

    // Setter Methods

    public void setDownload(Double download) {
        this.download = download;
    }

    public void setUpload(Double upload) {
        this.upload = upload;
    }
}