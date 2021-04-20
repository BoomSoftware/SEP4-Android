package com.example.sep4_android.views.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.sep4_android.LoginActivity;
import com.example.sep4_android.R;

public class SignInFragment extends Fragment {

    private View view;

    private EditText username;
    private EditText password;
    private Button login;
    private TextView signUp;

    String inputUsername = "";
    String inputPassword = "";

    static class Credentials {
        String name = "Admin";
        String password = "123456";
    }

    boolean isValid = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sign_in, container, false);
        signUp = view.findViewById(R.id.SU);

//        signUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SignUpFragment signUpFragment = new SignUpFragment();
//                FragmentTransaction transaction = getFragmentManager().beginTransaction();
//                transaction.replace(R.id.signInFragment, signUpFragment);
//                transaction.commit();
//            }
//        });
//        FragmentManager manager =getSupportFragmentManager();
//        manager.beginTransaction().replace(R.id.signInFragment,SignUpFragment);
        prepareOnClickEvents();
        prepareUI();
        prepareUIActions();
        return view;

    }

    private void prepareUI() {
        username = view.findViewById(R.id.input_login_username);
        password = view.findViewById(R.id.input_login_password);
        login = view.findViewById(R.id.button_login);
    }

    private void prepareUIActions() {
        login.setOnClickListener(v -> {
            inputUsername = username.getText().toString();
            inputPassword = password.getText().toString();

            if (inputUsername.isEmpty() || inputPassword.isEmpty()) {
                Toast.makeText(view.getContext(), "Please enter name and password!", Toast.LENGTH_LONG).show();
            } else {

                isValid = validate(inputUsername, inputPassword);
                if (!isValid) {
                    Toast.makeText(view.getContext(), "Wrong credentials", Toast.LENGTH_SHORT).show();
                } else {

                    startActivity(new Intent(view.getContext(), LoginActivity.class));
                }
            }

        });
    }

    private boolean validate(String inputUsername, String inputPassword) {
        Credentials credentials = new Credentials();

        if (inputUsername.equals(credentials.name) && inputPassword.equals(credentials.password)) {
            return true;
        }

        return false;
    }



    private void prepareOnClickEvents()
   {
      signUp.setOnClickListener(v-> Navigation.findNavController(view).navigate(R.id.action_signInFragment_to_signUpFragment));    }
    }


//