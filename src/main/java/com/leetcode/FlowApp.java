package com.leetcode;

import java.util.concurrent.Flow;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.SubmissionPublisher;

public class FlowApp {
    public static void main(String[] args) throws InterruptedException {
        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>(ForkJoinPool.commonPool(), 5);
        MySubscriber subscriber = new MySubscriber();
        publisher.subscribe(subscriber);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " | Publishing = " + i);
            publisher.submit(i);
        }

        publisher.close();
        Thread.currentThread().join(1000);

    }

}

class MySubscriber implements Flow.Subscriber<Integer>{

    private Flow.Subscription subscription;

    @Override public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        System.out.println(Thread.currentThread().getName() + "Subscriber onSubscribe");
        subscription.request(1);
    }

    @Override public void onNext(Integer item) {
        System.out.println(Thread.currentThread().getName() + " Subscriber onNext "+item.toString());
                subscription.request(1);

    }

    @Override public void onError(Throwable throwable) {
        System.out.println(Thread.currentThread().getName() + "Subscriber onError");
        throwable.printStackTrace();
    }

    @Override public void onComplete() {
        System.out.println(Thread.currentThread().getName() + "Subscriber onComplete");

    }
}

