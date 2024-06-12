

class Evento {
    private String titulo;
    private String dataHora;
    private String localizacao;
    private String descricao;

    public Evento(String titulo, String dataHora, String localizacao, String descricao) {
        this.titulo = titulo;
        this.dataHora = dataHora;
        this.localizacao = localizacao;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "Data e Hora: " + dataHora + "Localização: " + localizacao
                + "Descrição: " + descricao;
    }
}
