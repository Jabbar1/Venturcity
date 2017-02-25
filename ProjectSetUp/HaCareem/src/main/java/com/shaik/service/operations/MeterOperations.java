package com.shaik.service.operations;

import com.shaik.model.Meter;
import org.springframework.validation.annotation.Validated;

/**
 * Created by jabbars on 1/23/2017.
 */
@Validated
public interface MeterOperations<M extends Meter,ID extends Long> extends BaseOperations<M,ID> {

}
