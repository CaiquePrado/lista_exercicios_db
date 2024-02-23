package tree;

import tree.models.Father;
import tree.models.Mother;

public class App {

    public static void main(String[] args) {
        Mother mother = new Mother("Cristina", 42);

        System.out.println("Nome da mãe: " + mother.getName());
        System.out.println("Idade da mãe: " + mother.getAge());
        System.out.println(mother.sleep());
        System.out.println(mother.eat());
        System.out.println(mother.walk());
        System.out.println(mother.beautySalon());

        Father father = new Father("Edmar", 47);

        System.out.println("Nome da mãe: " + father.getName());
        System.out.println("Idade da mãe: " + father.getAge());
        System.out.println(father.sleep());
        System.out.println(father.eat());
        System.out.println(father.walk());
        System.out.println(father.playSoccer());
    }
}
