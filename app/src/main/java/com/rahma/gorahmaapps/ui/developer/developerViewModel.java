package com.rahma.gorahmaapps.ui.developer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class developerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public developerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is developer fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}