package com.stu.lawyer.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by hujinguang on 16-7-31.
 */
public interface LawyerService {
    @GET("pro?dtype=json&key=")
    Call<Province> listProvince();

    @GET("citiesByPro?dtype=json&key=xxx&pro={pro}")
    Call<City> listCitys(@Path("pro")String pro);
}