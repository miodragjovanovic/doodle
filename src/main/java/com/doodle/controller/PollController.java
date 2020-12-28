package com.doodle.controller;

import com.doodle.dto.PollDto;
import com.doodle.service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class PollController {

    @Autowired
    private PollService pollService;

    @RequestMapping(value = "/user/{email}/polls", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    List<PollDto> getPollsForUser(@PathVariable("email") String email) {
        return pollService.getPollsForUser(email);
    }

    @RequestMapping(value = "/polls/title/{title}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    List<PollDto> getPollsForTitle(@PathVariable("title") String title) {
        return pollService.getPollsForTitle(title);
    }

    @RequestMapping(value = "/polls/date/{date}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    List<PollDto> getPollsForTitle(@PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date) {
        return pollService.getPollsAfterDate(date);
    }

}
