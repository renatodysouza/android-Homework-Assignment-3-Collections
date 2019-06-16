
/* language: Português  */

/**
* Diferença entre array e list
*  
* O array é imutável, não pode aumentar ou diminuir de tamanho, o array possui tamanho fixo. Mas pode mudar o valor.
* Não há como criarmos arrays “somente leitura”. Eles são uma estrutura de dados de leitura/gravação.
*
* A lista a lista também é imutável e não permitwe mudar o valor
* Os itens das coleções dentro de um loop são disponibilizados como “somente leitura”.
*/

/** Example array */
var myArray = arrayList(0,1,2,3);

/** acessar por index */
println(myArray[0])   /** 0 */
myArray.set(0, 4)  /** podemos adicionar valores no indice já existente */

 val myList = listOf(0,1,2,3) // Doesnt permit change value
 // myList.set() o methodo nao existe


  


