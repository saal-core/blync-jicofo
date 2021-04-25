package ai.saal.blync.service;

public interface ConferenceHostService {

    Boolean validateHostPermission(String conferenceId, String Jid);
}
