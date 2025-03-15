package com.example.noneed.dto;

import com.example.noneed.entity.Ranking;
import lombok.Getter;

@Getter
public class RankingResponse extends Ranking {
    private final int rank;

    public RankingResponse(Ranking ranking, int rank) {
        super(ranking.getId(), ranking.getNickname(), ranking.getClearTime(), ranking.getShining(), ranking.getShouting(), ranking.getShaking());
        this.rank = rank;
    }
}
