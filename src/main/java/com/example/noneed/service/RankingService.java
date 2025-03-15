package com.example.noneed.service;

import com.example.noneed.dto.RankingResponse;
import com.example.noneed.entity.Ranking;
import com.example.noneed.repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class RankingService {
    @Autowired
    private RankingRepository rankingRepository;
    public Ranking saveRanking(Ranking ranking) {
        ranking.setClearTime(ranking.getClearTime() / 1000);
        return rankingRepository.save(ranking);
    }
    public List<RankingResponse> getRankings() {
        List<Ranking> rankingList =  rankingRepository.findAllByOrderByClearTimeAsc();
        List<RankingResponse> response = new ArrayList<>();
        AtomicInteger rank = new AtomicInteger();

        rankingList.forEach(ranking -> {
            response.add(new RankingResponse(ranking, rank.incrementAndGet()));
        });

        return response;
    }
}
