package com.harsha.infytel_friend_family.dtos;

import com.harsha.infytel_friend_family.entities.FriendFamily;
import lombok.Data;

@Data
public class FriendFamilyDTO {
    long phoneNo;
    long friendAndFamily;

    //converts DTO to entity
    public FriendFamily createFriend(){
        FriendFamily friend = new FriendFamily();
        friend.setPhoneNo(this.getPhoneNo());
        friend.setFriendAndFamily(this.getFriendAndFamily());
        return friend;
    }
}
