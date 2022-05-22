package kg.geektech.counter42.presenter;

import android.graphics.Color;
import android.widget.Toast;

import kg.geektech.counter42.databinding.ActivityMainBinding;
import kg.geektech.counter42.model.CounterModel;
import kg.geektech.counter42.view.CounterContracts;

public class CounterPresenter implements CounterContracts.CounterPresenter {
    CounterModel counterModel = new CounterModel();
    CounterContracts.CounterView counterView;
    ActivityMainBinding binding;


    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateText(counterModel.getCount());
        counterModel.getToast();
        if (counterModel.getCount()== counterModel.getToast()){
            counterView.toastToast(counterModel.getToast());

            }
        if (counterModel.getCount()==counterModel.getColor()){
            counterView.colorText(counterModel.getColor());
        }


    }


    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.updateText(counterModel.getCount());
        if (counterModel.getCount() == counterModel.getToast()) {
            counterView.toastToast(counterModel.getToast());




            }
            if (counterModel.getCount()==counterModel.getColor()) {
                counterView.colorText(counterModel.getColor());
        }
    }

        @Override
        public void attachCounterView (CounterContracts.CounterView view){
            counterView = view;
        }
    }
