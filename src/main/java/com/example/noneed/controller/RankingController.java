package com.example.noneed.controller;

import com.example.noneed.dto.RankingResponse;
import com.example.noneed.entity.Ranking;
import com.example.noneed.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/rankings")
@CrossOrigin(origins = "*")
public class RankingController {
    @Autowired
    private RankingService rankingService;
    @PostMapping
    public Ranking addRanking(@RequestBody Ranking ranking) {
        return rankingService.saveRanking(ranking);
    }
    @GetMapping
    public List<RankingResponse> getRankings() {
        return rankingService.getRankings();
    }
}
