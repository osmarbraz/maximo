/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplinas: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 *
 * Baseado nos slides 22 da aula do dia 22/09/2017  
 *
 * Página 155 Cormen 3a Ed
 *
 * Problema de Seleção
 * Dado um conjunto A de n números inteiro e um inteiro i, 
 * determinar o i-ésimo maior elemento de A.
 * O limite superior é de n – 1 comparações.
 *
 * Atenção:
 * Vetor em java inicia em 0, os algoritmos consideram início em 1.
 * A subtraçào de -1 ocorre somente no local de acesso ao vetor ou matriz 
 * para manter a compatibilidade entre os algoritmos.
 *
 */

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {

    /**
     * Recebe um vetor A[1... n] e devolve o maior valor do vetor.
     * Número de comparações: n-1 = Theta(n)
     * 
     * @param A Vetor com os valores
     * @param n Quantidade de valores do vetor
     * @return Um valor inteiro com o maior valor do vetor
     */
    public static int maximo(int A[], int n) {
        //Considere o primeiro como maior
        int max = A[1-1];
        //Compara do segundo elemento até o fim
        for (int j = 2; j <= n; j++) {
            if (max < A[j-1]) {
                max = A[j-1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        //Vetor dos dados    
        int A[] = {50, 70, 60, 90, 10, 30, 20, 40};

        //Quantidade de elementos
        int n = A.length;

        int menor = maximo(A, n);
        System.out.println("Maior:" + menor);
    }
}
