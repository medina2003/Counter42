package kg.geektech.counter42.model;

import kg.geektech.counter42.presenter.CounterPresenter;

public class CounterModel {

    public int count = 0;
    public int toast = 10;
    public int color = 15;

    public int getColor() {
        return color;
    }

    public int getToast() {
        return toast;


    }

    public void increment() {
        ++count;


    }


    public void decrement() {
        --count;
    }

    public int getCount() {
        return count;
    }

}

