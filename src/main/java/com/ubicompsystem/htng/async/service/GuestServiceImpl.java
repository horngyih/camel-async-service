package com.ubicompsystem.htng.async.service;

import com.ubicompsystem.htng.async.types.v1.Guest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Scope("singleton")
public class GuestServiceImpl implements GuestService {

    Logger log = LoggerFactory.getLogger(this.getClass());
    public static int currentId = 0;

    Map<Integer, Guest> guestMap = new HashMap<>();

    @Override
    public Guest getGuest(Guest searchCriteria) {
        Integer id = Integer.parseInt(searchCriteria.getGuestID());
        log.info( "Get Guest : " + id );
        if( id != null ){
            return guestMap.get(id);
        }
        return null;
    }

    @Override
    public Guest saveGuest(Guest guest) {
        if( guest != null ){
            if(guest.getGuestID()!=null){
                guestMap.put( Integer.parseInt(guest.getGuestID()), guest );
            } else {
                guestMap.put( ++currentId, guest );
                guest.setGuestID(""+currentId);
            }
            return guest;
        }
        return null;
    }

}
