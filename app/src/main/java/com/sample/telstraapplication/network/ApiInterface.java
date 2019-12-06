/**
 * @file ApiInterface.java
 * @brief This is the api interface class, it will contain all the Api call references
 * @author Pallavi
 * @date 06/12/2019
 */
package com.sample.telstraapplication.network;

import com.sample.telstraapplication.model.DropBoxContent;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("facts.json")
    Call<DropBoxContent> getContent();

}
