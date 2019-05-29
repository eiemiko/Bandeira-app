package br.com.etecia.bandeirinhasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import model.State;

public class MainActivity extends AppCompatActivity {

    model.State[] State = {


            new State ("São Paulo",
                      "São Paulo é uma das 27 unidades federativas do Brasil. Está situado na Região Sudeste e tem por limites os estados de Minas Gerais a norte e nordeste, Paraná a sul, Rio de Janeiro a leste e Mato Grosso do Sul a oeste, além do Oceano Atlântico a sudeste",
                      "248.209 km²",
                      "44,04 milhões"),
            new State("Paraná",
                     "O Paraná é uma das 27 unidades federativas do Brasil, localizado ao norte da região Sul, da qual é o único a ter área limítrofe com estados de outras regiões.",
                     "199.315 km²",
                     "11,35 milhões"),
            new State("Acre",
                    "Acre é uma das 27 unidades federativas do Brasil. Localiza-se no sudoeste da Região Norte, fazendo divisa com duas unidades federativas: Amazonas ao norte e Rondônia a leste; e faz fronteira com dois países: a Bolívia a sudeste e o Peru ao sul e a oeste.",
                    "152.581 km²",
                    "769.265"),
            new State("Pernambuco",
                     "Pernambuco é uma das 27 unidades federativas do Brasil. Está localizado no centro-leste da região Nordeste e tem como limites os estados da Paraíba, do Ceará, de Alagoas, da Bahia e do Piauí, além de ser banhado pelo oceano Atlântico.",
                     "98 149,119 km².",
                     "9,278 milhões"),
            new State("mato Grosso",
                     "Mato Grosso é uma das 27 unidades federativas do Brasil. Está localizado na região Centro-Oeste. Tem a porção norte de seu território ocupada pela Amazônia Legal, sendo o sul do estado pertencente ao Centro-Sul do Brasil.",
                     "903.357 km²",
                     "3,442 milhões"),




    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        this.StateList

    }
}
