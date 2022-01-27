package com.codelabs.diagnosakerusakanmotormatik.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codelabs.diagnosakerusakanmotormatik.R;
import com.codelabs.diagnosakerusakanmotormatik.activity.BantaunRiwayatActivity;
import com.codelabs.diagnosakerusakanmotormatik.activity.BantuanDataKerusakanActivity;
import com.codelabs.diagnosakerusakanmotormatik.activity.BantuanDiagnosaActivity;
import com.codelabs.diagnosakerusakanmotormatik.activity.DataKerusakanActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BantuanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BantuanFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View diagnosa, data, riwayat;

    public BantuanFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BantuanFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BantuanFragment newInstance(String param1, String param2) {
        BantuanFragment fragment = new BantuanFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_bantuan, null);
        diagnosa        = root.findViewById(R.id.diagnosa);
        data        = root.findViewById(R.id.data_kerusakan);
        riwayat        = root.findViewById(R.id.Riwayat);

        diagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireContext(), BantuanDiagnosaActivity.class));
            }
        });

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireContext(), BantuanDataKerusakanActivity.class));
            }
        });

        riwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireContext(), BantaunRiwayatActivity.class));
            }
        });

        return root;
    }
}