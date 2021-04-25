package ai.saal.blync.service;

public interface ConferenceRoomService {

    Boolean updateRoomState(String conferenceId, String Jid);

    Boolean isDirectCall(String conferenceId);
}
