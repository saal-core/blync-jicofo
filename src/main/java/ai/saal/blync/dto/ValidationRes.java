package ai.saal.blync.dto;

import ai.saal.blync.enums.ValidationStatus;
import ai.saal.blync.enums.ValidationStatus;

public class ValidationRes {

    private ValidationStatus status;
    private String conferenceId;

    public String getConferenceId() {
        return conferenceId;
    }

    public ValidationStatus getStatus() {
        return status;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public void setStatus(ValidationStatus status) {
        this.status = status;
    }
}
