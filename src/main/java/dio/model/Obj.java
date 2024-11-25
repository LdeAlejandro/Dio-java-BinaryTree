package dio.model;

import java.util.Objects;

public class Obj extends ObjTree<Obj> {


    Integer meuValor;

    public Obj (Integer meuValor) {
        this.meuValor = meuValor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Verifica se o objeto atual e o parâmetro são o mesmo
        if (o == null || getClass() != o.getClass()) return false; // Verifica a classe do objeto (Obj)
        Obj obj = (Obj) o; // Faz o cast para Obj
        return Objects.equals(meuValor, obj.meuValor); // Compara os valores de 'meuValor'
    }


    @Override
    // Sobrescrevendo o metodo hashCode para gerar um hash único com base no atributo 'meuValor'
    public int hashCode() {
        return Objects.hashCode(meuValor);
    }

    // comparar dois objetos 'Obj'
    @Override
    public int compareTo(Obj outro) {
        int i = 0; // Variável para armazenar o resultado da comparação

        if (this.meuValor > outro.meuValor) { // Se 'meuValor' for maior, retorna 1
            i = 1;
        } else if (this.meuValor < outro.meuValor) { // Se 'meuValor' for menor, retorna -1
            i = -1;
        }
        return i; // Retorna 0 se forem iguais
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }
}
