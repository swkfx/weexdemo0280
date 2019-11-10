package com.jiatui.weexdemo0280.ui.main;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    public MediatorLiveData<Integer> liveDataMerger = new MediatorLiveData<>();
    public MediatorLiveData<String> textLiveData = new MediatorLiveData<>();

    void doAction() {
         // depending on the action, do necessary business logic calls and update the
         // userLiveData.
        //liveDataMerger.addSource(textLiveData, new Observer<String>() {
        //    private int count = 1;
        //
        //    @Override
        //    public void onChanged(@Nullable String s) {
        //        count++;
        //        liveDataMerger.setValue(count);
        //        textLiveData.setValue(String.valueOf(count));
        //        if (count > 10) {
        //            liveDataMerger.removeSource(textLiveData);
        //        }
        //    }
        //});

        textLiveData.postValue("!@#!@#!");
    }
}
