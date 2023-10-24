package com.example.MeetUpRun.service;

import com.example.MeetUpRun.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
