package com.harsha.infytel_friend_family.services;

import com.harsha.infytel_friend_family.dtos.FriendFamilyDTO;
import com.harsha.infytel_friend_family.entities.FriendFamily;
import com.harsha.infytel_friend_family.repositories.FriendFamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FriendFamilyService {
    @Autowired
    FriendFamilyRepository friendRepo;
    public void saveFriend(long phoneNo, FriendFamilyDTO friendFamilyDTO){
        System.out.println("Creation request for customer"+phoneNo+" with data "+friendFamilyDTO);
        friendFamilyDTO.setPhoneNo(phoneNo);
        FriendFamily friend = friendFamilyDTO.createFriend();
        friendRepo.save(friend);
    }
    //get friend and family phone number list of a given customer
    public List<Long> getSpecificFriends(Long phoneNo){
        System.out.println("Friend and family details for customer "+ phoneNo);
        List<Long> friendList = new ArrayList<>();
        List<FriendFamily> friends = friendRepo.findByPhoneNo(phoneNo);
        for(FriendFamily friendFamily: friends){
            friendList.add(friendFamily.getFriendAndFamily());
        }
        System.out.println("The friend List is for customer"+ phoneNo+" is "+ friendList);
        return friendList;
    }
}
