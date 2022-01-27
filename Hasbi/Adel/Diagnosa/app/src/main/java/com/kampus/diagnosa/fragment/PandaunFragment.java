package com.kampus.diagnosa.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.kampus.diagnosa.R;
import com.kampus.diagnosa.activity.EditActivity;
import com.kampus.diagnosa.activity.LoginAdminActivity;
import com.kampus.diagnosa.activity.LoginUserActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PandaunFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PandaunFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    TextView text;
    ImageView logout;
    Button btn;
    SharedPreferences sharedPreferences;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PandaunFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PandaunFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PandaunFragment newInstance(String param1, String param2) {
        PandaunFragment fragment = new PandaunFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_pandaun, container, false);
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_pandaun, null);
        text    = (TextView) root.findViewById(R.id.text_desc);
        btn     = (Button) root.findViewById(R.id.btn_edit);
        logout  = (ImageView) root.findViewById(R.id.image_logout);


        setData();
        setEvent();
        return  root;
    }

    private void setData() {
        SharedPreferences sp = requireContext().getSharedPreferences("data", Context.MODE_PRIVATE);
        String guide = sp.getString("guide", "");
        text.setText(guide);
    }

    private void setEvent() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireContext(), EditActivity.class));
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireContext(), LoginAdminActivity.class));
            }
        });
    }
}