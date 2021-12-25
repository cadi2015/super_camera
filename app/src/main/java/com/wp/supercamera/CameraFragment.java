package com.wp.supercamera;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CameraFragment extends Fragment {

    public CameraFragment() {
        super();
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fish,container,false);
    }

    public static CameraFragment newInstance() {
        return new CameraFragment();
    }
}
