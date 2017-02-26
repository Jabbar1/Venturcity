package com.shaik.service.impl.ride;

import com.shaik.domain.entity.ECaptain;
import com.shaik.domain.repository.BaseRepository;
import com.shaik.domain.repository.CaptainRepository;
import com.shaik.model.Captain;
import com.shaik.model.TrackDetails;
import com.shaik.service.operations.ride.CaptainOperations;

import javax.inject.Named;
import java.util.UUID;

/**
 * Created by jabbars on 2/25/2017.
 */
@Named("CaptainTemplate")
public class CaptainTemplate extends CabTemplate<Captain,ECaptain,UUID> implements CaptainOperations{

    private CaptainRepository captainRepository;

    public CaptainTemplate(BaseRepository<ECaptain, UUID> baseRepositorys, CaptainRepository captainRepository) {
        super(baseRepositorys);
        this.captainRepository = captainRepository;
    }

    @Override
    public void sendData(UUID id, TrackDetails trackDetails) {

    }

    @Override
    public void acceptRide(UUID id) {

    }
}
