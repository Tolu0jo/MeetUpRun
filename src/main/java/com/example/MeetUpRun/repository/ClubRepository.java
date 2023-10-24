package com.example.MeetUpRun.repository;

import com.example.MeetUpRun.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClubRepository extends JpaRepository<Club,String> {
Optional<Club> findByTitle(String url);
}
