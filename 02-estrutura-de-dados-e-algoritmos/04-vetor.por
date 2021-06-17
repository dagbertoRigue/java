programa
{
	
	funcao inicio()
	{
		inteiro vetor[] = {1, 3, 5, 7, 9}  //cria vetor com valores prédefinidos
		inteiro numero
		logico achou = falso  //variável para armazenar o resultado da procura

		escreva("Qual número deseja pesquisar ?")
		leia(numero)

		para(inteiro posicao = 0; posicao <=4; posicao++) {
			se(vetor[posicao] == numero) {
				escreva("Encontrado na posição: ", posicao, "\n")
				achou = verdadeiro
			}
		}
		se(nao achou) {
			escreva("O número não está no vetor", "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 501; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */