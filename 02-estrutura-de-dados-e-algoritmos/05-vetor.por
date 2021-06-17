programa
{
	
	funcao inicio()
	{
		// Criação dos vetores já com os dados inicializados
		cadeia nome[] = {"Pedro", "Tiago", "João", "Mateus", "Lucas"}
		real altura[] = {1.71, 1.78, 1.75, 1.87, 1.75}

		// Cria o cabeçalho da tabela
		escreva("--------------------\n")
		escreva("-------Tabela-------\n")
		escreva("--------------------\n")

		para(inteiro posicao = 0; posicao < 5; posicao++) {
			//O caracter especial \t serve para escrever uma tabulação
			escreva(nome[posicao], "\t\t", altura[posicao], "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 207; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */