package ai.saal.blync.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConferenceRes {



    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Date getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(Date lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    public String getConferenceSecret() {
        return conferenceSecret;
    }

    public void setConferenceSecret(String conferenceSecret) {
        this.conferenceSecret = conferenceSecret;
    }



    public Boolean getHost() {
        return isHost;
    }

    public void setHost(Boolean host) {
        isHost = host;
    }

    public Date getScheduledFrom() {
        return scheduledFrom;
    }

    public void setScheduledFrom(Date scheduledFrom) {
        this.scheduledFrom = scheduledFrom;
    }

    public Date getScheduledTo() {
        return scheduledTo;
    }

    public void setScheduledTo(Date scheduledTo) {
        this.scheduledTo = scheduledTo;
    }

    public Boolean getSecretEnabled() {
        return isSecretEnabled;
    }

    public void setSecretEnabled(Boolean secretEnabled) {
        isSecretEnabled = secretEnabled;
    }

    public Boolean getWaitingEnabled() {
        return isWaitingEnabled;
    }

    public void setWaitingEnabled(Boolean waitingEnabled) {
        isWaitingEnabled = waitingEnabled;
    }

    public Boolean getIsDirectCall() {
        return isDirectCall;
    }
    public void setIsDirectCall(Boolean isDirectCall) {
        this.isDirectCall = isDirectCall;
    }

    private String conferenceId;
    private String conferenceName;
    private Date createdDateTime;
    private Date lastModifiedDateTime;
    private String conferenceSecret;
    private Boolean isHost;
    private Date scheduledFrom;
    private Date scheduledTo;
    private Boolean isSecretEnabled;
    private Boolean isWaitingEnabled;
    private Boolean isDirectCall;
}
