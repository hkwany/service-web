package sg.ncl;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Te Ye
 */
@ConfigurationProperties(prefix = ConnectionProperties.PREFIX)
public class ConnectionProperties {

    public static final String PREFIX = "ncl.web.service";

    private String sioAddress;
    private String sioPort;
    private String authEndpoint;
    private String credEndpoint;
    private String regEndpoint;
    private String userEndpoint;
    private String teamEndpoint;

    public String getSioAddress() {
        return sioAddress;
    }

    public void setSioAddress(String sioAddress) {
        this.sioAddress = sioAddress;
    }

    public String getSioPort() {
        return sioPort;
    }

    public void setSioPort(String sioPort) {
        this.sioPort = sioPort;
    }

    public String getAuthEndpoint() {
        return authEndpoint;
    }

    public void setAuthEndpoint(String authEndpoint) {
        this.authEndpoint = authEndpoint;
    }

    public String getCredEndpoint() {
        return credEndpoint;
    }

    public void setCredEndpoint(String credEndpoint) {
        this.credEndpoint = credEndpoint;
    }

    public String getRegEndpoint() {
        return regEndpoint;
    }

    public void setRegEndpoint(String regEndpoint) {
        this.regEndpoint = regEndpoint;
    }

    public String getUserEndpoint() {
        return userEndpoint;
    }

    public void setUserEndpoint(String userEndpoint) {
        this.userEndpoint = userEndpoint;
    }

    public String getTeamEndpoint() {
        return teamEndpoint;
    }

    public void setTeamEndpoint(String teamEndpoint) {
        this.teamEndpoint = teamEndpoint;
    }

    public String getSioUsersUrl() {
        return "http://" + sioAddress + ":" + sioPort + "/" + userEndpoint + "/";
    }

    public String getSioTeamsUrl() {
        return "http://" + sioAddress + ":" + sioPort + "/" + teamEndpoint + "/";
    }
    public String getSioAuthUrl() {
        return "http://" + sioAddress + ":" + sioPort + "/" + authEndpoint + "/";
    }

    public String getSioCredUrl() {
        return "http://" + sioAddress + ":" + sioPort + "/" + credEndpoint + "/";
    }

    public String getSioRegUrl() {
        return "http://" + sioAddress + ":" + sioPort + "/" + regEndpoint + "/";
    }
}
