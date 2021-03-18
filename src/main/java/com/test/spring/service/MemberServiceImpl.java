package com.test.spring.service;

import org.springframework.stereotype.Service;
import com.test.spring.domain.entity.MemberEntity;
import com.test.spring.mapper.MemberMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {

    private MemberMapper memberMapper;

    @Override
    public Integer insert(MemberEntity memberEntity) {
        return memberMapper.insert(memberEntity);
    }

}