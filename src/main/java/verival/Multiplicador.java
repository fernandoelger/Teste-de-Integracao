package verival;

public class Multiplicador{
  private Somador resultado;

  public Multiplicador (Somador somador){
      this.resultado = somador;
  }

  public Multiplicador set (Numero valor){
    this.resultado.set(valor);
    return this;
  }

  public Multiplicador vezes(Numero outro){
    int valor = resultado().valor();
    int multiplicador = outro.valor();

    if (multiplicador == 0 || valor == 0) {
      this.resultado.set(new Numero(0));
      return this;
    }
    else if (multiplicador == 1) {
      return this;
    }
    
    this.resultado.set(this.resultado.resultado().abs());

    Numero sum = new Numero(valor);
    int aux = outro.abs().valor();

    while (aux > 1) {
        resultado.mais(sum);
        aux--;
    }

    if ((valor > 0 && multiplicador < 0) || (valor < 0 && multiplicador > 0)) {
        this.resultado.set(new Numero(this.resultado.resultado().valor() * (-1)));
    }
    return this;
  }

  public Multiplicador dividido(Numero outro){
    int valor = resultado().valor();
    int divisor = outro.valor();

    if (divisor == 0) {
        throw new ArithmeticException("Cannot divide by zero");
    }
    if (valor == 0) {
        this.resultado.set(new Numero(0));
        return this; 
    }
    else if (divisor == 1) {
        return this;
    }
    
    this.resultado.set(this.resultado.resultado().abs());

    Somador aux = new Somador();
    aux.set(resultado.resultado());
    Numero newValue;
    int result = 1;

    

    while ((aux.menos(outro).resultado().valor()) > 0) {
        //aux.menos(outro);
        //newValue = resultado.resultado();
        //resultado.set(newValue);
        result++;
    }

    this.resultado.set(new Numero(result));

    if ((valor > 0 && divisor < 0) || (valor < 0 && divisor > 0)) {
        this.resultado.set(new Numero(this.resultado.resultado().valor() * (-1)));
    }

    return this;
  }

  public Numero resultado(){
    return this.resultado.resultado();
  }
}