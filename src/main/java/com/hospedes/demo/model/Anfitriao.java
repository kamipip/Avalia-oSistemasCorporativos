public class Anfitriao {
    private Long id;
    private String nome;
    private String nacionalidade;
    private String lista_acomodacoes;
    private String hospede;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getListaAcomodacoes() {
        return lista_acomodacoes;
    }

    public String getHospede() {
        return hospede;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setListaAcomodacoes(String listaAcomodacoes) {
        this.lista_acomodacoes = listaAcomodacoes;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }
}
