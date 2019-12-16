/**
 * @file ContentInfoDetailsContract.java
 * @brief This is the contract class, it will have interfaces for model, view and viewmodel.
 * @author Pallavi
 * @date 06/12/2019
 */

package com.sample.telstraapplication.viewmodel;

import com.sample.telstraapplication.model.ContentInfo;

import java.util.List;

import androidx.lifecycle.AndroidViewModel;

public class ContentInfoDetailsContract {


    public interface Model {

        interface OnFinishedListener {
            void onFinished(String mainTitle, List<ContentInfo> contentInfoList);

            void onFailure(Throwable t);
        }

        void getContentInfoList(OnFinishedListener onFinishedListener);

    }


   public interface View {

        void showProgress();

        void hideProgress();

        void setDataToRecyclerView(String mainTitle, List<ContentInfo> contentInfoList);

        void onResponseFailure(Throwable throwable);

    }


    public interface Presenter {

        void onDestroy();

        void requestDataFromServer();

    }

}
