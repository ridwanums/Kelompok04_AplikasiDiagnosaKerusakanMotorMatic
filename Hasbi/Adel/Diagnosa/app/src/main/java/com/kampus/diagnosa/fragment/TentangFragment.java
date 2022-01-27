package com.kampus.diagnosa.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kampus.diagnosa.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TentangFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TentangFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    TextView text;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TentangFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TentangFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TentangFragment newInstance(String param1, String param2) {
        TentangFragment fragment = new TentangFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_tentang, container, false);
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_tentang, null);
        text    = (TextView) root.findViewById(R.id.text_desc);
        SharedPreferences sp = requireContext().getSharedPreferences("data", Context.MODE_PRIVATE);
        String guide = sp.getString("guide", "");
        text.setText(guide);
        return  root;
    }
}