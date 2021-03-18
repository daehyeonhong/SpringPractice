package com.test.spring.mapper;

import com.test.spring.domain.MemberVO;
import com.test.spring.domain.entity.MemberEntity;
import java.util.List;

public interface MemberMapper {

    int deleteByPrimaryKey(String memberId);

    int insert(MemberEntity record);

    MemberEntity selectByPrimaryKey(String memberId);

    List<MemberEntity> selectAll();

    int updateByPrimaryKey(MemberEntity record);

    MemberVO read(String memberId);

}