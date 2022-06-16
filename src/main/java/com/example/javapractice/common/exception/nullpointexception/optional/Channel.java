package com.example.javapractice.common.exception.nullpointexception.optional;

import java.util.Optional;

public class Channel {

    private int numOfSubscribers;

    // nullPointException이 발생하지 않도록 Optional로 return
    public Optional<MemberShip> defaultMemberShip() {
        if (this.numOfSubscribers < 2000) {
            return Optional.empty();
        }
        return Optional.of(new MemberShip());
    }
}