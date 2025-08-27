package api.Api.Exception;

public class ErroDeConvercaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConvercaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage(){
        return this.mensagem;
    }

}
