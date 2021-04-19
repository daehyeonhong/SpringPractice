package com.practice.spring.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paging {

    private int nowPage, startPage, endPage, total, countPerPage, lastPage, start, end;

    private int countPage = 5;

    public Paging() {
    }

    public Paging(int total, int nowPage, int countPerPage) {
        setNowPage(nowPage);
        setCountPage(countPerPage);
        setTotal(total);
    }

    public void calcLastPage(int total, int countPerPage) {
        setLastPage((int) Math.ceil(total / countPerPage));
    }

    public void calcStartEndPage(int nowPage, int countPage) {
        setEndPage(((int) Math.ceil(nowPage / countPage)) * countPage);
        if (getLastPage() < getEndPage()) {
            setEndPage(getLastPage());
        }
        setStartPage(getEndPage() - countPage + 1);
        if (getStartPage() < 1) {
            setStartPage(1);
        }
    }

    public void calcStartEnd(int nowPage, int cntPerPage) {
        setEnd(nowPage * cntPerPage);
        setStart(getEnd() - cntPerPage + 1);
    }

}