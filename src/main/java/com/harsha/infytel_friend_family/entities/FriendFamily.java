package com.harsha.infytel_friend_family.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Entity(name="friendfamily")
@Data
public class FriendFamily {
    @Id
    @GeneratedValue
    private int id;
    long phoneNo;
    long friendAndFamily;

}
