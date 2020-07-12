package ai.saal.blync.service.impl;


import ai.saal.blync.dto.BlyncUrl;
import ai.saal.blync.dto.HostJidReq;
import ai.saal.blync.dto.ValidationRes;
import ai.saal.blync.enums.ValidationStatus;
import ai.saal.blync.service.ConferenceHostService;
import ai.saal.blync.util.RestClient;
import org.jitsi.jicofo.xmpp.FocusComponent;
import org.jitsi.utils.logging.Logger;

public class ConferenceHostServiceImpl implements ConferenceHostService {

    private final static Logger logger
            = Logger.getLogger(ConferenceHostServiceImpl.class);


    private static String url = BlyncUrl.URL+"conferences/{confId}/verifyhost";


    @Override
    public Boolean validateHostPermission(String conferenceId, String Jid) {

        HostJidReq hostJidReq = new HostJidReq();
        hostJidReq.setJid(Jid);
        conferenceId = conferenceId.split("@")[0];
        String hostUrl = url.replace("{confId}",conferenceId);
        logger.info("Requesting Blync management service for validating host room creation permission ------- host Id = "+ Jid +" Room name "+conferenceId);
        ValidationRes validationRes = RestClient.invokeHostValidation(hostUrl, hostJidReq);
        logger.info("Response from Blync manager for host Id = "+ Jid +" Room name "+conferenceId +" Status is =>"+validationRes.getStatus());
        return validationRes.getStatus().toString().equals("SUCCESS") ? true : false;
    }
}
