package com.github.sejoung.codetest.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferencesTest {
    public static void main(String[] args) throws InterruptedException {
        D d = new D();
        d.say();
        ReferenceQueue<D> refQueue = new ReferenceQueue<D>();
        PhantomReference<D> phantomRef = new PhantomReference<D>(d, refQueue);
        d = null;
        System.out.println(phantomRef.isEnqueued());// 큐에 들어갔는지 확인
        System.gc(); // gc를 강제하는데 하지 않으면 remove에서 무한대기
        System.out.println(phantomRef.isEnqueued());// 큐에 들어갔는지 확인
        Reference pr = refQueue.remove();
        d = phantomRef.get(); //null 반환
        d.say(); // NPE ㅜㅜ
    }
}

class D {
    public void say() {
        System.out.println("하하하");
    }
}
