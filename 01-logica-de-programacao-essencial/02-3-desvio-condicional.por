programa
{
	
	funcao inicio()
	{
		escreva("Escreva uma das opções :" + "\n" + "1 - Abre Netflix!" + "\n" + "2 - Abre Amazon Prime" + "\n" + "3 - Abre HBO GO!")
		inteiro menu = 0

		escreva("\n" + "Sua escolha :")
		leia(menu)

		escolha(menu) {
			caso 1:	//testa se o valor é igual a 1
			escreva("Abrir Netflix")
			pare

			caso 2:	//testa se o valor é igual a 2
			escreva("Abrir Amazon Prime")
			pare

			caso 3:	//testa se o valor é igual a 3
			escreva("Abrir HBO GO")
			pare

			caso 4:	//testa se o valor é igual a 4
			escreva("Saindo do menu ...")
			pare

			caso contrario:	//testa se o valor não é 1, 2, 3 ou 4
			escreva("Você deve escolher as opções 1, 2, 3 ou 4.")
			pare
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 233; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */