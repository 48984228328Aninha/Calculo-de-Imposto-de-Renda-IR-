import java.util.Arrays;
import java.util.List;

public class FaixaImposto {
    private Double limiteMaximo;
    private Double aliquota;
    private Double parcelaDeduzir;

    public FaixaImposto(Double limiteMaximo, Double aliquota, Double parcelaDeduzir) {
        this.limiteMaximo = limiteMaximo;
        this.aliquota = aliquota;
        this.parcelaDeduzir = parcelaDeduzir;
    }

    public List<FaixaImposto> obterTabelaImposto() {
        return Arrays.asList(
                new FaixaImposto(2428.80, 0.0, 0.0),
                new FaixaImposto(2826.65, 0.075, 182.16),
                new FaixaImposto(3751.05, 0.15, 394.16),
                new FaixaImposto(4664.68, 0.225, 675.49),
                new FaixaImposto(Double.MAX_VALUE, 0.275, 908.73));
    }

    public Double getLimiteMaximo() {
        return limiteMaximo;
    }

    public void setLimiteMaximo(Double limiteMaximo) {
        this.limiteMaximo = limiteMaximo;
    }

    public Double getAliquota() {
        return aliquota;
    }

    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }

    public Double getParcelaDeduzir() {
        return parcelaDeduzir;
    }

    public void setParcelaDeduzir(Double parcelaDeduzir) {
        this.parcelaDeduzir = parcelaDeduzir;
    }
}
