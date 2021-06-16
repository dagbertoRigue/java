programa
{
	
	funcao inicio()
	{
		real janeiro, fevereiro, marco, abril, media

		escreva("Informe as vendas de Janeiro: ")
		leia(janeiro)
		escreva("Informe as vendas de Fevereiro: ")
		leia(fevereiro)
		escreva("Informe as vendas de Março: ")
		leia(marco)
		escreva("Informe as vendas de Abril: ")
		leia(abril)

		media = (janeiro+fevereiro+marco+abril)/4

		se(media >=5000) {
			escreva("Parabéns! Você ganhará um abono de 10%!")
		}
		senao {
			escreva("Parabéns! Você vai receper 3% de abono!")	
		}			
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */