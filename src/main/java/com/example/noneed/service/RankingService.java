package com.example.noneed.service;

import com.example.noneed.entity.Ranking;
import com.example.noneed.repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RankingService {
    @Autowired
    private RankingRepository rankingRepository;
    public Ranking saveRanking(Ranking ranking) {
        return rankingRepository.save(ranking);
    }
    public List<Ranking> getRankings() {
        return rankingRepository.findAllByOrderByClearTimeAsc();
    }
}
