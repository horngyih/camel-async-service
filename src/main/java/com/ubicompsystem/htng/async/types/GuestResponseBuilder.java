package com.ubicompsystem.htng.async.types;

import com.ubicompsystem.htng.async.types.v1.Guest;
import com.ubicompsystem.htng.async.types.v1.GuestResponse;
import org.springframework.stereotype.Repository;

@Repository("guestResponseBuilder")
public class GuestResponseBuilder {

    public GuestResponse build(Guest guest ){
        GuestResponse response = new GuestResponse();
        response.setSuccess("SUCCESS");
        response.setGuest(guest);
        return response;
    }
}
