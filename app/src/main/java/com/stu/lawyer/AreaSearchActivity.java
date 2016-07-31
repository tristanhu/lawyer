package com.stu.lawyer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.jakewharton.rxbinding.view.RxView;
import com.jakewharton.rxbinding.widget.RxAdapter;
import com.stu.lawyer.model.LawyerService;

import butterknife.ButterKnife;
import butterknife.InjectView;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.functions.Action1;

public class AreaSearchActivity extends AppCompatActivity {

    @InjectView(R.id.textView)
    TextView textView;
    @InjectView(R.id.btnSearch)
    Button btnSearch;

    private Retrofit retrofit;
    private LawyerService lawyerService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_search);
        ButterKnife.inject(this);

        retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        lawyerService = retrofit.create(LawyerService.class);

        RxView.clicks(btnSearch)
                .subscribe(new Action1<Void>() {
                    @Override
                    public void call(Void aVoid) {

                    }
                });
    }


}
