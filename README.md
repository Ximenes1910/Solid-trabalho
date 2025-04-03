# trabalhoEstoque
Trabalho em trios aplicando os princípios do SOLID à um projeto de Gerenciamento de Estoque
TRABALHO DE SOLID
ALUNOS: Ana, Leonardo e Pedro Lopes

Aplicamos no nosso projeto todos os princípios SOLID, deixando o código organizado

Responsabilidade Única (SRP)

	GerenciarIngredientes apenas lista ingredientes
	
	FiltroIngredientes apenas filtra

	MostrarIngredientes exibe as informações no console

	Main se responsabiliza por interagir com o usuário



Aberto para extensões, fechado para alterações(OCP)

	Adicionamos filtros sem precisar alterar o código original, desse modo podemos adicionar um novo critério de filtragem, apenas criando um novo método dentro de FiltroIngredientes.




Substituição de Liskov (LSP)

	A classe Pedido segue a interface IPedido, então qualquer outra classe que implemente essa interface pode ser usada no lugar sem quebrar o sistema. Isso significa que, se no futuro quisermos criar um tipo diferente de pedido, ele vai funcionar normalmente sem mudar o código existente.



Segregação de Interfaces (ISP)

	Criamos a interface IIngrediente apenas só com os métodos que realmente são necessários, desse modo, todas as classe podem implementar essa interface, observando apenas asfunções relevantes, sem ter que lidar com métodos desnecessários.



Inversão de Dependência (DIP)


	O código trabalha com abstrações (IIngrediente), facilitando a flexibilidade do sistema, permitindo que implementamos o ingrediente sem atingir quem usa essa classe.
