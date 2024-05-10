package pe.edu.upeu.poo.claseinterna;

public class Principal {

    public static void main(String[] args) {
        Mama ma=new Mama();
        System.out.println("La mamá provee "+ma.alimento);
        Mama.Bebe bb=ma.new Bebe();
        System.out.println("Su bebe tiene un peso "+bb.peso+"Kg");
    }
}
