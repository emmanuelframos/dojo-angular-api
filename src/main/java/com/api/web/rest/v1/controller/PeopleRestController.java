package com.api.web.rest.v1.controller;

import com.api.config.APIConfig;
import com.api.utils.PeopleUtils;
import com.api.web.rest.v1.resource.PeopleResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleRestController extends BaseRestController {

    private static Logger logger = LoggerFactory.getLogger(PeopleRestController.class);

    @Autowired
    private APIConfig apiConfig;

    @GetMapping(value = "/people")
    public List<PeopleResource> getPeople() {

        logger.info("Getting people in Rest API {}.", apiConfig.getName());
        List<PeopleResource> people = PeopleUtils.getPeople();
        logger.info("Get people returned [{}] results.", people.size());

        return people;
    }


    @GetMapping(value = "/people/prize")
    public List<PeopleResource> getPeoplePrize() {

        logger.info("Getting people prize in Rest API {}.", apiConfig.getName());
        List<PeopleResource> peoplePrize = PeopleUtils.getPeoplePrize();
        logger.info("Get people prize returned [{}] results.", peoplePrize.size());

        return peoplePrize;
    }
}
