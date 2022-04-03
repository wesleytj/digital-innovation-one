# Introdução ao CSS3
O CSS3 é uma linguagem de estilo, para estilizar nossa página HTML. O CSS foi criado em 96.

## Sintaxe
Uma regra CSS é criado por Seletores e Declarações.
    a, p, h1, h3{
        color: blue;
        font-size: 14px;
    }
Sendo a, p, h1 e h3 os seletores e o que está dentro de { chaves } a declaração.

### Id e Class
Usando os seletores diretamente como as tags do HTML, todos os elementos que forem daquele tipo, terão a mesma estilização.
É aí que entra os Ids `id` e as classes `class`.
Com eles(as), podemos especificar, que uma estilização será apenas para os elementos que tiverem aquele(a) `ìd` ou `class` específico(a).
```html
<header id="header-principal"> 
    <!--Conteudo aqui-->
</header>
<!-- O `id` só pode ser utilizado uma única vez na página.-->

<header class="header"> 
    <!--Conteudo aqui-->
</header>
```
```css
#header-principal{
    /*Declaração aqui*/
}
.header{
    /*Declaração aqui*/
}
/* Observe que os `ids` são especificados com `#` e as `class` com `.` */
```

## Box-model
Quando estamos criando o layout de um site o navegador representa cada elemento HTML  como uma caixa retangular, isso é o box-model. E com CSS nós alteramos a aparência dessa caixa (largura, altura, cor de fundo, etc.). Essa caixa é composta por 4 áreas: o conteúdo, o padding, a borda e a margem.

* As margens (margin) são espaçamentos entre elementos;
* As bordas (border) ;
* O padding é um espaçamento entre as bordas e o conteúdo, a diferença para as margens é que declarações de imagem de fundo funcionam nele;
* O conteúdo (content) é o que o seu bloco representa, um texto, uma imagem, um vídeo;
