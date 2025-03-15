package com.example.noneed.repository;

import com.example.noneed.entity.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RankingRepository extends JpaRepository<Ranking, Long> {
    List<Ranking> findAllByOrderByClearTimeAsc();
}
