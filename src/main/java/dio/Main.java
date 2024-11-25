package dio;

import dio.model.Obj;

public class Main {

    public static void main(String[] args) {
        BinaryTree<Obj> minhaArvore = new BinaryTree<Obj>();

        /*
          Pré-ordem: 13, 10, 2, 12, 25, 20, 31, 29, 32
          In-ordem: 2, 10, 12, 13, 20, 25, 29, 31, 32
          Pós-ordem: 2, 12, 10, 20, 29, 32, 31, 25, 13
        */

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));
        minhaArvore.inserir(new Obj(32));

        minhaArvore.exibirPreOrdem();
        //ordem Crescente
        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPosOrdem();

        System.out.println("\n =======================================");
        minhaArvore.imprimirArvore();


        minhaArvore.remover(new Obj(31));

        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPosOrdem();
        System.out.println("\n =======================================");
        minhaArvore.imprimirArvore();




    }
}
