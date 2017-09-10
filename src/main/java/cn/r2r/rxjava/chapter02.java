package cn.r2r.rxjava;

import rx.Subscriber;
import rx.subjects.PublishSubject;

/**
 * Created by zero on 2017/7/25.
 */
public class chapter02 {

    public static void main(String[] args) {

        PublishSubject<String> publishSubject = PublishSubject.create();

        publishSubject.subscribe(new Subscriber<String>() {
            public void onCompleted() {

            }

            public void onError(Throwable throwable) {

            }

            public void onNext(String s) {
                System.out.println("onNext:" + s);
            }
        });

        publishSubject.onNext("Hello,RxJava.");


    }


}
