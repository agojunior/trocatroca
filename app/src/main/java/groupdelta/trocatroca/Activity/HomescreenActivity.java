package groupdelta.trocatroca.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import groupdelta.trocatroca.DataAccessObject.Conexao;
import groupdelta.trocatroca.R;

public class HomescreenActivity extends AppCompatActivity {
    private Button btnPerfil;
    private Button btnLogout;
    private Button btnNewItem;
    private FirebaseAuth auth;
    private AutoCompleteTextView PesquisaItens;
    private String[] itens = new String[] {"Game of Thrones", "Age of Empires", "Prototype", "God of War", "God of War2", "god of war", "game of Throne2"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        /*Obtaining the references to the views from the XML.*/
        btnPerfil = findViewById(R.id.btnPerfil);
        btnLogout = findViewById(R.id.btnLogout);
        btnNewItem = findViewById(R.id.btnNewItem);

        PesquisaItens = findViewById(R.id.pesquisaItens);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, itens);
        PesquisaItens.setAdapter(adapter);
    }
    public void onPerfilButtonClicked(View view) {
        Intent i = new Intent(HomescreenActivity.this, PerfilActivity.class);
        startActivity(i);
    }
    public void onLogoutButtonClicked(View view) {
        Intent i = new Intent(HomescreenActivity.this, MainActivity.class);
        Conexao.logOut();
        startActivity(i);

    }
    public void onNovaofertaButtonClicked(View view) {
        Intent i = new Intent(HomescreenActivity.this, PerfilActivity.class);
        startActivity(i);
    }

}
