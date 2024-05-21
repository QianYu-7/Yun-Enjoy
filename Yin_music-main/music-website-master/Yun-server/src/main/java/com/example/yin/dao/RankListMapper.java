package com.example.yin.dao;

import com.example.yin.domain.RankList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RankListMapper {

    int insert(RankList record);

    int insertSelective(RankList record);


    int selectScoreSum(Long songListId);


    int selectRankNum(Long songListId);


    int selectUserRank(@Param("consumerId") Long consumerId, @Param("songListId")  Long songListId);
}
