package com.shaik.service.operations;

import com.shaik.model.FileDetails;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.List;

/**
 * Created by jabbars on 1/23/2017.
 */
@Validated
public interface BaseOperations<M,ID> {

    M create(@Valid M request);
    M update(@NotNull ID id,@Valid M request);

    List<M> findAll();
    M find(@NotNull ID id);

    void delete(@NotNull ID id);

    List<M> readFromCsv(FileDetails filePath) throws IOException;
}
