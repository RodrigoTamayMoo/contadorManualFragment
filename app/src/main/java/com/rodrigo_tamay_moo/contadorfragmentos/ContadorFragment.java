package com.rodrigo_tamay_moo.contadorfragmentos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by rodrigo_tamay_moo on 29/10/2017.
 */

public class ContadorFragment extends Fragment{
    private Button mBotonContar, mBotonReiniciar;
    private TextView mTextoConteo;
    int mcontar = 0;

    @Override
    public void onCreate (Bundle savedInstance) {
        super.onCreate(savedInstance);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmento_contador, container, false);

        mBotonContar = (Button)v.findViewById(R.id.buton_contar);
        mBotonReiniciar = (Button)v.findViewById(R.id.boton_reiniciar);
        mTextoConteo = (TextView)v.findViewById(R.id.incrementar_valor);


        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcontar++;
                mTextoConteo.setText(Integer.toString(mcontar));
            }
        });

        mBotonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcontar = 0;
                mTextoConteo.setText("0");
            }
        });

        return v;
    }

}
