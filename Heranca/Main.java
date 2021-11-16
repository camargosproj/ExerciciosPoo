
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Mamifero();
        Animal a3 = new Cachorro();
        Animal a4 = new Morcego();

        Mamifero m1 = new Animal(); // Classe filha não pode instaciar classe pai
        Mamifero m2 = new Mamifero();
        Mamifero m3 = new Cachorro();
        Mamifero m4 = new Morcego();

        Cachorro c1 = new Animal(); // Classe filha não pode instaciar classe pai
        Cachorro c2 = new Mamifero(); // Classe filha não pode instaciar classe pai
        Cachorro c3 = new Cachorro();
        Cachorro c4 = new Morcego(); // Cachorro não tem relação com morcego pois não há herança

        Morcego mo1 = new Animal(); // Classe filha não pode instaciar classe pai
        Morcego mo2 = new Mamifero(); // Classe filha não pode instaciar classe pai
        Morcego mo3 = new Cachorro(); // Morcego não tem relação com cachorro pois não há herança
        Morcego mo4 = new Morcego();
        Animal a5 = new Cachorro();
        a5.mover();
        a5.mamar(); // Animal não possui metodo mamar, pois pertence a classe filha
        Cachorro c5 = (Cachorro) a5;
        c5.mover();
        c5.mamar();

        Mamifero m5 = new Morcego();
        m5.mover();
        m5.mamar();
        Morcego mo5 = (Morcego) m5;
        mo5.mover();
        mo5.mamar();

        Cachorro c6 = new Cachorro();
        Mamifero m6 = c6;
        Animal a6 = m6;
        Morcego mo6 = a6; // Classe filha não pode instaciar classe pai
        Verdadeiro ou Falso, se falso justifique.

        // (Verdadeiro) Em orientação a objetos herança é a capacidade de uma classe definir o seu comportamento e sua estrutura 
        //    aproveitando definições de outra classe, normalmente conhecida como classe base ou classe pai.
        // (Verdadeiro) O objetivo da herança é generalizar o entendimento de uma classe criando novas características e comportamentos que vão além da superclasse.
        // (Falso - Podem ser instaciadas)Classes concretas são classes que não produzem instâncias. Elas agrupam características e comportamentos que serão herdados por outras classes.
        // (Falso- Apenas a assinatura dos metodos) Classes abstratas precisam ter métodos com implementação definida.
        // (Verdadeiro) Os métodos abstratos são obrigatoriamente implementados pelas classes filhas.
        // Polimorfismo só pode ser utilizando com herança, não podendo ser aplicado a interface.
        // (Verdadeiro) As interfaces são estritamente modelos de comportamento.
        // (Verdadeiro) As interfaces não podem ser instanciadas pois não produzem objetos.
        // (Falso - Pois não código no metodo, isso é feito apenas na classe filha)As interfaces podem ter atributos de instância.
        // (Falso - Não pode ser instanciada)Classes abstratas podem ter atributos de instância.
        // (Verdadeiro) As interfaces não podem ter métodos com corpo definido.
        // (Falso - Apenas as classes filha podem ou não definir o copo dos metodos)Classes abstratas não podem ter métodos com corpo definido.
    }
}
