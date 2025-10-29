package core;

public class Carta {

    //ATRIBUTOS DE TODA CARTA
    private String nome; //nome da carta
    private int nivel; //nível que a carta está
    private double custoElixir; //custo em elixir para utilizar a carta
    private String tipo; //o tipo da carta (tropa, feitiço ou construção)
    private String raridade; //a raridade da carta (comum, rara, épica ou lendária)
    private String imagem; //o caminho para a imagem dessa carta
    private double dano; //dano que a carta causa
    private double danoPorSegundo; //dps da carta
    private double vida; //pontos de vida da carta
    private String alvos; //o tipo de alvo que a carta atinge
    private String alcance; //o alcance da carta
    private String velocidade; //a velocidade da carta
    private String velocidadeImpacto; //---------------não entendi muito bem o que é isso-----------

    //construtor da carta (para construir quantas cartas for preciso)
    public Carta (String nome, int nivel, double custoElixir, String tipo, String raridade, String imagem,
                  double dano, double danoPorSegundo, double vida, String alvos, String alcance,
                  String velocidade, String velocidadeImpacto) {

        this.nome = nome;
        this.nivel = nivel;
        this.custoElixir = custoElixir;
        this.tipo = tipo;
        this.raridade = raridade;
        this.imagem = imagem;
        this.dano = dano;
        this.danoPorSegundo = danoPorSegundo;
        this.vida = vida;
        this.alvos = alvos;
        this.alcance = alcance;
        this.velocidade = velocidade;
        this.velocidadeImpacto = velocidadeImpacto;

    }

    //métodos públicos para ler e alterar os atributos das cartas
    //getters

    //para ler o nome da carta
    public String getNome() {

        return this.nome;

    }

    //para ler o nível da carta
    public int getNivel() {

        return this.nivel;

    }

    //para ler o custo da carta
    public double getCustoElixir() {

        return this.custoElixir;

    }

    //para ler o tipo da carta
    public String getTipo() {

        return this.tipo;

    }

    //para ler a raridade da carta
    public String getRaridade() {

        return this.raridade;

    }

    //para ler o caminho da imagem da carta
    public String getImagem() {

        return this.imagem;

    }

    //para ler o dano da carta
    public double getDano() {

        return this.dano;

    }

    //para ler o dps da carta
    public double getDanoPorSegundo(){

        return this.danoPorSegundo;

    }

    //para ler a vida da carta
    public double getVida() {

        return this.vida;

    }

    //para ler o alvo da carta
    public String getAlvos() {

        return this.alvos;

    }

    //para ler o alcance da carta
    public String getAlcance() {

        return this.alcance;

    }

    //para ler a velocidade da carta
    public String getVelocidade() {

        return this.velocidade;

    }

    //para ler a velocidade de impacto da carta
    public String getVelocidadeImpacto() {

        return this.velocidadeImpacto;

    }

    //setters

    //para mudar o nome da carta
    public void setNome(String nome) {

        this.nome = nome;

    }

    //para mudar o nível da carta
    public void setNivel(int nivel) {

        this.nivel = nivel;

    }

    //para mudar o custo da carta
    public void setCustoElixir(double custoElixir) {

        this.custoElixir = custoElixir;

    }

    //para mudar o tipo da carta
    public void setTipo(String tipo) {

        this.tipo = tipo;

    }

    //para mudar a raridade da carta
    public void setRaridade(String raridade) {

        this.raridade = raridade;

    }

    //para mudar o caminho da imagem da carta
    public void setImagem(String imagem) {

        this.imagem = imagem;

    }

    //para mudar o dano da carta
    public void setDano(Double dano){

        this.dano = dano;

    }

    //para mudar o dps da carta
    public void setDanoPorSegundo(Double danoPorSegundo) {

        this.danoPorSegundo = danoPorSegundo;

    }

    //para mudar a vida da carta
    public void setVida(double vida) {

        this.vida = vida;

    }

    //para mudar o alvo da carta
    public void setAlvos(String alvos) {

        this.alvos = alvos;

    }

    //para mudar o alcance da carta
    public void setAlcance(String alcance) {

        this.alcance = alcance;

    }

    //para mudar a velocidade da carta
    public void setVelocidade(String velocidade) {

        this.velocidade = velocidade;

    }

    //para mudar a velocidade de impacto da carta
    public void setVelocidadeImpacto(String velocidadeImpacto) {

        this.velocidadeImpacto = velocidadeImpacto;

    }


}


