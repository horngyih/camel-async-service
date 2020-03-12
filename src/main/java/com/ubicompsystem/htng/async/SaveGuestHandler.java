package com.ubicompsystem.htng.async;

import com.ubicompsystem.htng.async.service.GuestService;
import com.ubicompsystem.htng.async.types.v1.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("saveGuestHandler")
public class SaveGuestHandler {

    @Autowired
    GuestService guestService;

    public Guest save( Guest guest ){
        if( guest != null ){
            return guestService.saveGuest(guest);
        }
        return null;
    }
}
