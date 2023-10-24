package com.example.MeetUpRun.repository;

import com.example.MeetUpRun.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club,String> {
Optional<Club> findByTitle(String url);
}
