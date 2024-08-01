package com.dongne.its.base.dao;

import com.dongne.its.base.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findBySignId(String signId);
}
