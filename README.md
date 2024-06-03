# Contexto
Esse repositório tem como objetivo guardar os códigos dos projetos que 
desenvolvo para estudar assim como algumas anotações

# Temas

## Spring Framework



## Spring Boot

![img_4.png](img_4.png)

### Antes do Spring Boot

![img_5.png](img_5.png)

A proposta do Spring Boot é que, como muitas aplicações sempre precisam passar 
pelos mesmos processos iniciais para 
serem iniciadas, poderia automatizar essa etapa. Assim foram criados os starters: (Descritores de Dependências)

![img_6.png](img_6.png)

![img_7.png](img_7.png)

## IoC: Inversion of control

![img.png](img.png)

## Fluxo sem IoC:

![img_1.png](img_1.png)

## Fluxo com IoC:

## ![img_2.png](img_2.png)

## Injeção de dependências:

![img_3.png](img_3.png)


# Bean vs Component

Utilizamos component quando temos acesso ao código fonte 
e Bean quando não temos mas precisamos injetar essa dependencia
no projeto. Seria possível colocar o Bean dentro da classe principal da aplicação,
mas isso polui a classe:

![img_8.png](img_8.png)

# Prototype vs Singleton

Prototype: A cada necessidade da 
aplicação existirá uma instancia da dependencia utilizada

Singleton: Existirá uma unica instancia da dependencia 
utilizada 

# JPA

![img_12.png](img_12.png)

![img_13.png](img_13.png)

![img_14.png](img_14.png) 

# ORM

![img_10.png](img_10.png)

![img_11.png](img_11.png)
