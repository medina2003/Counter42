package kg.geektech.counter42;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import kg.geektech.counter42.databinding.ActivityMainBinding;
import kg.geektech.counter42.presenter.CounterPresenter;
import kg.geektech.counter42.view.CounterContracts;

public class MainActivity extends AppCompatActivity  implements CounterContracts.CounterView {
    ActivityMainBinding binding;
    CounterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.gatCounter();
        presenter.attachCounterView(this);
        initClickers();

    }

    private void initClickers() {
        binding.incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              presenter.increment();
            }
        });
    }

    @Override
    public void updateText(int count) {
        binding.counter1.setText(String.valueOf(count));
    }

    @Override
    public void toastToast(int toastNum) {
        Toast.makeText(this, "Поздравляем", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void colorText(int colorT) {
        binding.counter1.setTextColor(Color.GREEN);

    }
}

