package com.example.javapractice.common.exception.nullpointexception.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

class ChannelTest {

    @Test
    void nullPointException() {
        Channel channel = new Channel();
        Optional<MemberShip> optional = channel.defaultMemberShip();
        optional.ifPresent(MemberShip::hello);
    }

}