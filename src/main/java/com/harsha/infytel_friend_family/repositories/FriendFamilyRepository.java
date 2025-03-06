package com.harsha.infytel_friend_family.repositories;

import com.harsha.infytel_friend_family.entities.FriendFamily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FriendFamilyRepository extends JpaRepository<FriendFamily, Integer> {
    List<FriendFamily> findByPhoneNo(long phoneNo);
}
