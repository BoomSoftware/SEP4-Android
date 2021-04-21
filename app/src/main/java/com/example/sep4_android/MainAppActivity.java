package com.example.sep4_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainAppActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private GoogleSignInClient mGoogleSignInClient;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(getApplicationContext(), gso);

        setContentView(R.layout.activity_app_main);
        prepareToolbar();
        setNavigationViewListener();
        setNavigationHeader();
    }

    private void prepareToolbar() {
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_fragment_main);
        NavController navController = navHostFragment.getNavController();
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(drawerLayout).build();

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(null);
        setSupportActionBar(toolbar);
        NavigationUI.setupWithNavController(toolbar, navController, appBarConfiguration);
    }

    private void setNavigationViewListener() {
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void setNavigationHeader() {
        GoogleSignInAccount userInfo = GoogleSignIn.getLastSignedInAccount(this);
        if (userInfo != null) {
            View header = navigationView.getHeaderView(0);
            TextView headerName = header.findViewById(R.id.nav_header_name);
            ImageView headerAvatar = header.findViewById(R.id.nav_header_avatar);

            headerName.setText(userInfo.getDisplayName());
            Glide.with(this).load(userInfo.getPhotoUrl()).into(headerAvatar);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_item_logout: {
                mGoogleSignInClient.signOut()
                        .addOnCompleteListener(this, task -> {
                            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                            FirebaseAuth.getInstance().signOut();
                            startActivity(intent);
                        });
            }
        }
        return true;
    }
}
