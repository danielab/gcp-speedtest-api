package api.speedtest.models;

public class TestResult {
    private String user;
    private String device;
    private String timestamp;
    Data DataObject;

    public String getUser() {
        return user;
    }

    public String getDevice() {
        return device;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Data getData() {
        return DataObject;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setData(Data dataObject) {
        this.DataObject = dataObject;
    }
}

class Data {
    Speeds SpeedsObject;
    Client ClientObject;
    Server ServerObject;


    // Getter Methods

    public Speeds getSpeeds() {
        return SpeedsObject;
    }

    public Client getClient() {
        return ClientObject;
    }

    public Server getServer() {
        return ServerObject;
    }

    // Setter Methods

    public void setSpeeds(Speeds speedsObject) {
        this.SpeedsObject = speedsObject;
    }

    public void setClient(Client clientObject) {
        this.ClientObject = clientObject;
    }

    public void setServer(Server serverObject) {
        this.ServerObject = serverObject;
    }
}
class Server {
    private String host;
    private String lat;
    private String lon;
    private String country;
    private String distance;
    private String ping;
    private String id;


    // Getter Methods

    public String getHost() {
        return host;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }

    public String getCountry() {
        return country;
    }

    public String getDistance() {
        return distance;
    }

    public String getPing() {
        return ping;
    }

    public String getId() {
        return id;
    }

    // Setter Methods

    public void setHost(String host) {
        this.host = host;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public void setPing(String ping) {
        this.ping = ping;
    }

    public void setId(String id) {
        this.id = id;
    }
}
class Client {
    private String ip;
    private String lat;
    private String lon;
    private String isp;
    private String country;


    // Getter Methods

    public String getIp() {
        return ip;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
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

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
class Speeds {
    private String download;
    private String upload;


    // Getter Methods

    public String getDownload() {
        return download;
    }

    public String getUpload() {
        return upload;
    }

    // Setter Methods

    public void setDownload(String download) {
        this.download = download;
    }

    public void setUpload(String upload) {
        this.upload = upload;
    }
}