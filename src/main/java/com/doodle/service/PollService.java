package com.doodle.service;

import com.doodle.dto.PollDto;

import java.util.Date;
import java.util.List;

public interface PollService {

    List<PollDto> getPollsForUser(String email);

    List<PollDto> getPollsForTitle(String title);

    List<PollDto> getPollsAfterDate(Date date);
}
