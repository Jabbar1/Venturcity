package com.shaik.service.operations;

import com.shaik.model.Fraction;
import org.springframework.validation.annotation.Validated;

/**
 * Created by jabbars on 1/23/2017.
 */
@Validated
public interface FractionOperations<F extends Fraction,ID extends Long> extends BaseOperations<F,ID> {

}
