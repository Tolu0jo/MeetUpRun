package com.example.MeetUpRun.controller;

import com.example.MeetUpRun.dto.ClubDto;
import com.example.MeetUpRun.models.Club;
import com.example.MeetUpRun.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClubController {

    private ClubService clubService;

    @Autowired
    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @GetMapping("/clubs")
    public String listClubs(Model model){
        List<ClubDto> clubs = clubService.findAllClubs();
        model.addAttribute("clubs",clubs);
        return "clubs-list";
    }

    @GetMapping("/club/new")
    public String createClubForm(Model model){
        Club club = new Club();
        model.addAttribute("club",club);
         return "club-create";
    }

}
