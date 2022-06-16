package com.example.javapractice.effectivejava.item07.cache;

import java.util.Map;
import java.util.WeakHashMap;

public class PostRepository {

    private Map<CacheKey, Post> cache;

    public PostRepository() {
        this.cache = new WeakHashMap<>();
    }

    public Post getPostById(CacheKey key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        // DB 또는 API에서 얻을 수 있다.
        Post post = new Post();
        cache.put(key, post);
        return post;

    }

    public Map<CacheKey, Post> getCache() {
        return cache;
    }
}