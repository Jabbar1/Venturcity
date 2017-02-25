package com.shaik.rest;

import com.shaik.service.operations.BaseCrudOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jabbars on 1/23/2017.
 */
public abstract class BaseResource<L, ID> {

    protected BaseCrudOperations<L, ID> baseCrudOperations;

    public BaseResource(BaseCrudOperations<L, ID> baseCrudOperations) {
        this.baseCrudOperations = baseCrudOperations;
    }


    /**
     * Create
     *
     * @param meter
     * @return
     */
    @RequestMapping(
            value = "",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.CREATED)
    public L create(@RequestBody L request) {
        return baseCrudOperations.create(request);
    }

    /**
     * Update
     *
     * @param id
     * @param request
     * @return
     */
    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public L update(@PathVariable(value = "id") ID id,
                    @RequestBody L request) {
        return baseCrudOperations.update(id, request);
    }

    /**
     * Find All
     *
     * @return
     */
    @RequestMapping(
            value = "",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public List<L> findAll() {
        return baseCrudOperations.findAll();
    }

    /**
     * Find One record
     *
     * @param id
     * @return
     */
    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public L find(@PathVariable("id") ID id) {
        return baseCrudOperations.find(id);
    }

    /**
     * Delete data
     *
     * @param id
     */
    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") ID id) {
        baseCrudOperations.delete(id);
    }

}
