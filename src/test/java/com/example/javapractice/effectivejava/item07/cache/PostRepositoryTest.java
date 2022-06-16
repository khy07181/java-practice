package com.example.javapractice.effectivejava.item07.cache;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

class PostRepositoryTest {

    @Test
    void cache() throws InterruptedException {
        PostRepository postRepository = new PostRepository();

        // WeakHashMap을 사용할 떄는 referenceType의 key를 사용해야 한다.
        CacheKey key = new CacheKey(1);
        postRepository.getPostById(key);

        assertThat(postRepository.getCache().isEmpty()).isFalse();

        key = null;

        System.out.println("run gc");
        // gc가 실행된다는 보장은 없다..(?)
        System.gc();
        System.out.println("wait");
        Thread.sleep(3000L);

        assertThat(postRepository.getCache()).isEmpty();
    }


    // background thread를 사용해 주기적으로 clean up해서 객체의 참조를 해제
    @Test
    void backgroundThread() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        PostRepository postRepository = new PostRepository();
        CacheKey key1 = new CacheKey(1);
        postRepository.getPostById(key1);

        Runnable removeOldCache = () -> {
            System.out.println("running removeOldCache task");
            Map<CacheKey, Post> cache = postRepository.getCache();
            Set<CacheKey> cacheKeys = cache.keySet();
            Optional<CacheKey> key = cacheKeys.stream().min(Comparator.comparing(CacheKey::getCreated));
            key.ifPresent((k) -> {
                System.out.println("removing " + k);
                cache.remove(k);
            });
        };

        System.out.println("The time is : " + new Date());

        executor.scheduleAtFixedRate(removeOldCache,
                1, 3, TimeUnit.SECONDS);

        Thread.sleep(20000L);

        executor.shutdown();
    }

}