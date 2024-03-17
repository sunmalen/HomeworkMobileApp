package com.malen.aeumastermobile.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.malen.aeumastermobile.ListViewActivity;
import com.malen.aeumastermobile.R;
import com.malen.aeumastermobile.databinding.FragmentGalleryBinding;
import com.malen.aeumastermobile.homework.homework1.currencyCovertor.KhConverUsd;


public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Button btn_area = root.findViewById(R.id.area);
        btn_area.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ListViewActivity.class);
                startActivity(intent);
            }
        });
        return root;

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}