package com.harsha.infytel_friend_family.controllers;

import com.harsha.infytel_friend_family.dtos.FriendFamilyDTO;
import com.harsha.infytel_friend_family.services.FriendFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FriendFamilyController {
    @Autowired
    FriendFamilyService friendService;
    //create Friend Family
    @PostMapping(value="/customers/{phoneNo}/friends")
    public void saveFriend(@PathVariable Long phoneNo, @RequestBody FriendFamilyDTO friendDTO){
        System.out.println("Creation request for customer"+ phoneNo +" with data "+friendDTO);
        friendService.saveFriend(phoneNo, friendDTO);
    }
    //Fetches friend and family numbers of a given phoneNo
    @GetMapping("/customers/{phoneNo}/friends")
    public List<Long> getSpecificFriends(@PathVariable Long phoneNo){
        System.out.println("Friends and Family numbers for customer"+ phoneNo);
//        try{
//            Thread.sleep(5000);
//        }
//        catch(InterruptedException e){
//            e.printStackTrace();
//        }
        return friendService.getSpecificFriends(phoneNo);
    }
}
