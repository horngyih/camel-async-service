package com.ubicompsystem.htng.async;

import com.google.gson.GsonBuilder;
import com.ubicompsystem.htng.async.service.GuestService;
import com.ubicompsystem.htng.async.types.v1.Guest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("getGuestHandler")
public class GetGuestHandler {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GuestService guestService;

    public Guest getGuest(Guest searchCriteria ){
        log.info( "Get Guest" );
        if( searchCriteria != null ){
            Guest retrieved = guestService.getGuest(searchCriteria);
            log.info( "Guest : " + new GsonBuilder().setPrettyPrinting().create().toJson(retrieved) );
            return retrieved;
        }
        return null;
    }
}
