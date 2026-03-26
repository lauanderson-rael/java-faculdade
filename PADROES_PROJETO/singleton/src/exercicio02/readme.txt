# Gerenciador de Logs (Registro de Eventos).

Imagine que várias classes do seu sistema (Usuário, Financeiro, Estoque)
precisam gravar mensagens em um único arquivo ou console.
Se cada classe criasse seu próprio gravador, teríamos conflitos de escrita.
O Singleton resolve isso garantindo um único canal de saída.