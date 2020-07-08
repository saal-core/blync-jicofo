package org.jitsi.impl.protocol.xmpp;

import java.util.HashMap;

public class ConfRoomHostMapper {

    public static final HashMap<String,String> ROOM_USER_MAP = new HashMap<String,String>();

    public static void addChatRoom(String chatRoom ,String host){
        ROOM_USER_MAP.put(chatRoom,host);
    }

    public static Boolean isChatRoomPermissionAvailable(String chatRoom,String host){
       if(ROOM_USER_MAP.containsKey(chatRoom)){
            String auth_host=ROOM_USER_MAP.get(chatRoom);
            return auth_host.equals(host);
       }else{
           return false;
       }
    }
}
