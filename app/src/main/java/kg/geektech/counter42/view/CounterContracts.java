package kg.geektech.counter42.view;

public class CounterContracts {

    public interface  CounterView{
        void updateText(int count);
        void toastToast(int toastNum);
        void colorText(int colorT);



    }
    public interface CounterPresenter{
        void increment();

        void decrement();

        void attachCounterView(CounterView view);
    }
}
