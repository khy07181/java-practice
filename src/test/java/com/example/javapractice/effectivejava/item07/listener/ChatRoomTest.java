package com.example.javapractice.effectivejava.item07.listener;

import org.junit.jupiter.api.Test;

import java.lang.ref.WeakReference;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ChatRoomTest {

    @Test
    void charRoom() throws InterruptedException {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User();
        User user2 = new User();

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        chatRoom.sendMessage("hello");

        user1 = null;

        System.gc();
        Thread.sleep(5000L);

        List<WeakReference<User>> users = chatRoom.getUsers();


        /*
        weakReference를 참조하기 때문에 size가 1로 줄어들 것 같지만 실제로 사라지지 않는다. (List)
        디버깅하면 size는 변하지 않고 참조하는 reference만 null이다.
        따라서 reference가 null인 요소를 비워주는 custom한 List를 만들거나 WeakHashMap을 사용하면 사라진다.
         */
        assertThat(users.size()).isEqualTo(2);
    }

}