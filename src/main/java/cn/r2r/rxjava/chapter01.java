package cn.r2r.rxjava;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zero on 2017/7/25.
 */
public class chapter01 {


    public static void main(String[] args) {


        Observable<Integer> observable = Observable.create(new Observable.OnSubscribe<Integer>() {
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 0; i < 5; i++) {
                    subscriber.onNext(i);
                }
                subscriber.onCompleted();
            }
        });

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Observable observable1 = Observable.from(list);


        Observable observable2 = Observable.just(getDatas(),getCount());


        Subscription subscription = observable2.subscribe(new Observer<Integer>() {
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            public void onError(Throwable throwable) {
                System.out.println("onError:" + throwable.getMessage());
            }

            public void onNext(Integer integer) {
                System.out.println("onNext:" + integer);
            }
        });

    }

    public static Integer getDatas() {

        return 0;
    }

    public static Integer getCount() {

        return 2;

    }


}
