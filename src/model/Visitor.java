package model;

public class Visitor {
    private int visitorId;
    private String name;
    private String mobile;
    private String purpose;
    private String host;

    public Visitor(String name, String mobile, String purpose, String host) {
        this.name = name;
        this.mobile = mobile;
        this.purpose = purpose;
        this.host = host;
    }

    public int getVisitorId() {
        return visitorId;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getHost() {
        return host;
    }
}
