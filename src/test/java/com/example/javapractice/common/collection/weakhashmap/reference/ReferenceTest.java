package com.example.javapractice.common.collection.weakhashmap.reference;

import org.junit.jupiter.api.Test;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

class ReferenceTest {

    /*
    softReference, weakReference로 객체 참조를 해제하는 것은 불확실하기 때문에 권장되지 않는다.
    애매모호함에 의존하기 보다는 명시적으로 객체 참조를 해제하는 방법이 권장된다.
     */
    @Test
    void softReference() throws InterruptedException {
        Object strong = new Object();
        SoftReference<Object> soft = new SoftReference<>(strong);
        strong = null;

        // 더이상 strong reference가 없고 soft reference만 있으면 메모리가 필요한 시점에 gc의 대상이 된다.
        System.gc();
        Thread.sleep(3000L);

        // 메모리가 충분하기 때문에 현재는 없어지지 않는다.
        System.out.println(soft.get());
    }

    @Test
    void weakReference() throws InterruptedException {
        Object strong = new Object();
        WeakReference<Object> weak = new WeakReference<>(strong);
        strong = null;

        // weak reference는 soft reference와 다르게 gc가 일어날 때 무조건 없어진다.
        System.gc();
        Thread.sleep(3000L);

        System.out.println(weak.get());
    }

    @Test
    void phantomReference() throws InterruptedException {
        BigObject strong = new BigObject();
        ReferenceQueue<BigObject> referenceQueue = new ReferenceQueue<>();

        BigObjectReference<BigObject> phantom = new BigObjectReference<>(strong, referenceQueue);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        // phantom reference는 없어지지만 사라지진 않고 ReferenceQueue에 들어간다.
        System.out.println(phantom.isEnqueued());

        Reference<? extends BigObject> reference = referenceQueue.poll();
        BigObjectReference bigObjectCleaner = (BigObjectReference) reference;
        bigObjectCleaner.cleanUp();
        reference.clear();
    }

}