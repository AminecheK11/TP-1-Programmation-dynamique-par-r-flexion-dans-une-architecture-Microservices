
# TP 1 : Programmation dynamique par réflexion dans une architecture Microservices

**Réalisé par : Amine Chekkouri**

## Objectif

Ce TP consiste à utiliser l'API Reflection de Java pour charger dynamiquement des classes et réaliser l'injection de dépendances.

Les fonctionnalités réalisées sont :
- Création des interfaces et implémentations DAO et Métier.
- Chargement dynamique avec `Class.forName()`.
- Injection de dépendances avec `Method.invoke()`.
- Configuration des classes via `config.txt`.

## Technologies utilisées

- **Java 21**
- **Java Reflection API**
- **Maven**
- **IntelliJ IDEA**

## 1. Structure du projet

Le projet est organisé en trois couches :
- **DAO** : récupération des données.
- **Métier** : traitement et calcul.
- **Présentation** : chargement dynamique et injection des dépendances.

## 2. Première exécution : DaoImpl

La première implémentation retourne 100.0. Après multiplication par 2, le résultat obtenu est **200.0**.

<img width="1247" height="191" alt="cap2_lab_nouv" src="https://github.com/user-attachments/assets/d699b16e-21c4-4f15-8e78-fa7772c251b3" />


## 3. Deuxième exécution : DaoImpl2

La deuxième implémentation retourne 200.0. Le résultat obtenu est **400.0**, sans modification de la logique métier.

<img width="1214" height="211" alt="cap3_lab_nouv" src="https://github.com/user-attachments/assets/a4a88f9a-5fd5-45f3-81c9-f1027bb624b4" />


## Conclusion

Ce TP a été l'occasion de mettre en pratique les bases de la réflexion Java et de l'injection de dépendances. Les deux exécutions montrent qu'il est possible de changer dynamiquement l'implémentation DAO sans modifier le code métier.
