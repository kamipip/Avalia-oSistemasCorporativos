import java.util.Date;

public class Hospede {
    private Long id;
    private String nome;
    private Date data_registro;
    private String lista_reservas;


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataRegistro() {
        return data_registro;
    }

    public String getListaReservas() {
        return lista_reservas;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.data_registro = dataRegistro;
    }

    public void setListaReservas(String listaReservas) {
        this.lista_reservas = listaReservas;
    }
}
