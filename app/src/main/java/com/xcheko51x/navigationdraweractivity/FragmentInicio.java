package com.xcheko51x.navigationdraweractivity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentInicio extends Fragment {

    View vista;
    Button btnFecha;
    TextView fecha;
    DatePicker picker;
    Spinner opciones;
    ArrayAdapter<CharSequence> adapter;

    public FragmentInicio() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        vista = inflater.inflate(R.layout.fragment_fragment_inicio, container, false);

        btnFecha = (Button) vista.findViewById(R.id.btnFecha);
        fecha=(TextView) vista.findViewById(R.id.textView1);
        picker=(DatePicker) vista.findViewById(R.id.dpFecha);
        opciones = (Spinner) vista.findViewById(R.id.sp01);


        btnFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fecha.setText("Usted selecciono la fecha: "+ picker.getDayOfMonth()+"/"+ (picker.getMonth() + 1)+"/"+picker.getYear());
            }
        });

        return vista;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapter = ArrayAdapter.createFromResource(getActivity(), R.array.opciones, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        opciones.setAdapter(adapter);
    }

}
