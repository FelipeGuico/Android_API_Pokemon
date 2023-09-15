package com.example.aula0431_08_2023.models;

import com.example.aula0431_08_2023.Config;

public class Pokemon {
    public String nome;
    public String url;
    public String imagem;

    public int  id() {
        if (url != null) {
            String codigo = url.replace(Config.linkServer, "").replace("/", "");
            return Integer.parseInt(codigo);
        }
        return 0;
    }

    public String imagem(){
        return "";
    }
}
