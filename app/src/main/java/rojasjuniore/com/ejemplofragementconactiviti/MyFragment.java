package rojasjuniore.com.ejemplofragementconactiviti;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by usuario on 19/08/2017.
 */

public class MyFragment extends Fragment {

    EditText editText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        editText = (EditText) view.findViewById(R.id.editext);
        Button button = (Button) view.findViewById(R.id.Enviar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prepareData();
            }
        });

        return view;
    }

    private void prepareData() {
        String xdata = editText.getText().toString();
        MyInterface myInterface = (MyInterface) getActivity();
        myInterface.sendData(xdata);
    }
}
