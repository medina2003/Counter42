package kg.geektech.counter42;

import kg.geektech.counter42.presenter.CounterPresenter;

public class Injector {


    public  static CounterPresenter gatCounter(){
        return new  CounterPresenter();
    }
}
