package com.ubicompsystem.htng.async.service;

import com.ubicompsystem.htng.async.types.v1.Guest;

public interface GuestService {

    Guest getGuest(Guest searchCriteria);
    Guest saveGuest(Guest guest);

}
