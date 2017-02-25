package com.shaik.rest;

import com.shaik.model.Meter;
import com.shaik.service.operations.MeterOperations;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by jabbars on 1/23/2017.
 */
/*
@Api(basePath = "v1/api/meter",
        value = "Fraction",
        description = "Operations with Fraction",
        produces = "application/json")
@RestController("MeterResource")*/
@RequestMapping(value = "v1/api/meter")
public class MeterResource extends BaseResource<Meter,Long> {

    MeterOperations<Meter,Long> meterMeterOperations;

    @Inject
    public MeterResource(@Named("caseStudyMeterTemplate")MeterOperations<Meter,Long> meterMeterOperations) {
        super(meterMeterOperations);
        this.meterMeterOperations = meterMeterOperations;
    }
}
