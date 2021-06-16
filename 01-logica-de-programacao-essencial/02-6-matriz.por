programa
{
	
	funcao inicio()
	{
		cadeia cesta[][] ={{"pera","100"},{"uva","200"},{"maçã","300"},{"banana","400"}} 

		escreva("Produto: ")
		escreva(cesta[0][0])
		escreva(" Quantidade: ")
		escreva(cesta[0][1])

		escreva("\n" + "Imprimindo a matriz inteira:" + "\n")
		inteiro contador = 0

		faca {
			escreva("Produto: " + cesta[contador][0] + " Quantidade: " + cesta[contador][1] + "\n")
			contador++
		}enquanto(contador<=3)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 274; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */