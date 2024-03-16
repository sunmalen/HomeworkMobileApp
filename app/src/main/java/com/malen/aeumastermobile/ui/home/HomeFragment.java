package com.malen.aeumastermobile.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.malen.aeumastermobile.R;
import com.malen.aeumastermobile.databinding.FragmentHomeBinding;
import com.malen.aeumastermobile.homework.homework1.currencyCovertor.EnConvertKh;
import com.malen.aeumastermobile.homework.homework1.currencyCovertor.KhConverUsd;
import com.malen.aeumastermobile.homework.homework1.currencyCovertor.KhCovertEn;
import com.malen.aeumastermobile.homework.homework1.currencyCovertor.UsdConverKh;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button btn_kh_Usd = root.findViewById(R.id.convertRielToUSD);
        Button btn_Usd_kh = root.findViewById(R.id.btn_usd_kh);
        Button btn_Eu_kh = root.findViewById(R.id.btn_eu_kh);
        Button btn_kh_Eu = root.findViewById(R.id.btn_kh_eu);

        btn_kh_Usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), KhConverUsd.class);
                startActivity(intent);
            }
        });
        btn_Usd_kh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), UsdConverKh.class);
                startActivity(intent);
            }
        });
        btn_Eu_kh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EnConvertKh.class);
                startActivity(intent);
            }
        });
        btn_kh_Eu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), KhCovertEn.class);
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