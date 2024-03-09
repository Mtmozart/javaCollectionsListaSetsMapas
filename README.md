# Anotações de Revisão

ArrayList: tipo genérico, é necessário passar o parâmetro dentro; respeita a ordem dos atributos que colocamos.

[Documentação](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

```java
ArrayList<String> nome = new ArrayList<>();
```

	##Métodos
    nome.add("elemento"): adiciona o elemento no final da lista;
    nome.addAll(outraLista): adiciona todos os elementos de outraLista no final da lista atual;
    nome.get(i): retorna o elemento no índice i;
    nome.indexOf("elemento"): retorna o índice da primeira ocorrência de "elemento" na lista;
    nome.lastIndexOf("elemento"): retorna o índice da última ocorrência de "elemento" na lista;
    nome.contains("elemento"): verifica se a lista contém "elemento";
    nome.size(): retorna o número de elementos na lista;
    nome.isEmpty(): verifica se a lista está vazia;
    nome.clear(): remove todos os elementos da lista;
    nome.set(i, "novoElemento"): substitui o elemento no índice i por "novoElemento".

Listas bonitinhas: utilizar o forEach, lembrando que sempre deve ser menor, pois <= daria IndexOutOfBoundsException
```Java
for (int i = 0; i < aulas.size(); i++) {
    System.out.println("Aula: " + aulas.get(i));
}
```

Método forEach: nome.forEach(action), passa um lambda dentro dele.

```Java
nome.forEach(aula -> {System.out.println(aula);});
```

Classe para ordenar coleção Collections, ele ordena lexográficamente, também é uma parte essencial da API Java para manipulação e armazenamento de grupos de objetos. O framework Collections fornece interfaces e classes que representam diferentes tipos de coleções, como listas, conjuntos e mapas, permitindo que os desenvolvedores manipulem dados de forma mais eficiente.

```Java
Collections.sort(nome);

```




