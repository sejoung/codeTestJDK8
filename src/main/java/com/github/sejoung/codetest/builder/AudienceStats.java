package com.github.sejoung.codetest.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
//통계 정보
public class AudienceStats {
    // 날짜 yyyymmdd
    private String statsDttm;
    // 구좌노출
    private int totEprsCnt;
    //매체 기준 노출
    private int parEprsCnt;
    // 클릭
    private int clickCnt;
    // 광고 단가
    private BigDecimal advrtesAmt;

    @Builder
    public AudienceStats(String statsDttm, int totEprsCnt, int parEprsCnt, int clickCnt, BigDecimal advrtesAmt) {
        this.statsDttm = statsDttm;
        this.totEprsCnt = totEprsCnt;
        this.parEprsCnt = parEprsCnt;
        this.clickCnt = clickCnt;
        this.advrtesAmt = advrtesAmt;
    }


}
