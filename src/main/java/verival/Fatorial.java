package verival;

public class Fatorial{
    private Multiplicador resultado;

  public Fatorial(Multiplicador multiplicador){
      this.resultado = multiplicador;
  }

  public Fatorial fatorial(Numero valor){
    Numero fat = valor.duplica();
    int fatorial = fat.valor();
    
    if (fatorial == 0 || fatorial == 1) {
      this.resultado.set(new Numero(1));
      return this;
    }
    else if (fatorial == -1) {
      this.resultado.set(new Numero(-1));
      return this;
    }

    fatorial = fat.abs().valor();
    int aux = 1;
    resultado.set(valor);

    while(fatorial > 0){
      aux *= fatorial;
      fatorial--;
    }

    this.resultado.set(new Numero(aux));

    if (valor.valor() < 0) {
      resultado.vezes(new Numero(-1));
  }

    return this;
  }

  public Numero resultado(){
    return resultado.resultado();
  }
}