package com.doodle.service.impl;

import com.doodle.dto.PollDto;
import com.doodle.model.Poll;
import com.doodle.repository.PollRepository;
import com.doodle.service.PollService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PollServiceImpl implements PollService {

    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private PollRepository pollRepository;

    @Override
    public List<PollDto> getPollsForUser(String email) {
        List<Poll> polls = pollRepository.findByUser(email);
        return mapEntitiesToDtos(polls);
    }

    @Override
    public List<PollDto> getPollsForTitle(String title) {
        List<Poll> polls = pollRepository.findAllByTitle(title);
        return mapEntitiesToDtos(polls);
    }

    @Override
    public List<PollDto> getPollsAfterDate(Date date) {
        List<Poll> polls = pollRepository.findAllByInitiatedAfter(date.getTime());
        return mapEntitiesToDtos(polls);
    }

    private List<PollDto> mapEntitiesToDtos(List<Poll> polls) {
        return polls.stream()
                .map(poll -> modelMapper.map(poll, PollDto.class))
                .collect(Collectors.toList());
    }


}
